package com.hedong.utils;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @className: ZkDistributedLocker
 * @description: zookeeper 实现分布式锁
 * @author: hedong@ibeesaas.com
 * @date: 2018-06-20 14:19
 **/
//@Component
public class ZkDistributedLocker implements Lock, Watcher {
    private final static Logger logger = LoggerFactory.getLogger(ZkDistributedLocker.class);

    //    @Value("${zk.address}")
//    private String zkAddress;
    private static final String zkAddress = "172.16.50.111:2181";
    private ZooKeeper zk;
    /**
     * 根
     */
    private String root = "/locks";
    /**
     * 竞争资源的标志
     */
    private String lockName;
    /**
     * 等待前一个锁
     */

    private String waitNode;
    /**
     * 当前锁
     */
    private String myZnode;
    /**
     * 计数器
     */
    private CountDownLatch latch;
    private CountDownLatch connectedSignal = new CountDownLatch(1);
    private int sessionTimeout = 30000;


    /**
     * 创建分布式锁,使用前请确认config配置的zookeeper服务可用
     *
     * @param lockName 竞争资源标志,lockName中不能包含单词_lock_
     */
    public ZkDistributedLocker(String lockName) {
        this.lockName = lockName;
        // 创建一个与服务器的连接
        try {
            zk = new ZooKeeper(zkAddress, sessionTimeout, this);
            connectedSignal.await();
            //此去不执行 Watcher
            Stat stat = zk.exists(root, false);
            if (stat == null) {
                // 创建根节点
                zk.create(root, new byte[0], ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * zookeeper节点的监视器
     */
    @Override
    public void process(WatchedEvent event) {
        //建立连接用
        if (event.getState() == Event.KeeperState.SyncConnected) {
            connectedSignal.countDown();
            return;
        }
        //其他线程放弃锁的标志
        if (this.latch != null) {
            this.latch.countDown();
        }
    }

    @Override
    public void lock() {

        try {
            if (this.tryLock()) {
                logger.info("Thread " + Thread.currentThread().getId() + " " + myZnode + " get lock true");
                return;
            } else {
                waitForLock(waitNode, sessionTimeout);//等待锁
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        this.lock();
    }

    @Override
    public boolean tryLock() {
        try {
            String splitStr = "_lock_";
            if (lockName.contains(splitStr)) {
                logger.warn("lockName can not contains");
            }
            //创建临时子节点
            myZnode = zk.create(root + "/" + lockName + splitStr, new byte[0], ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
            logger.info(myZnode + " is created ");
            //取出所有子节点
            List<String> subNodes = zk.getChildren(root, false);
            //取出所有lockName的锁
            List<String> lockObjNodes = new ArrayList<String>();
            for (String node : subNodes) {
                String _node = node.split(splitStr)[0];
                if (_node.equals(lockName)) {
                    lockObjNodes.add(node);
                }
            }
            Collections.sort(lockObjNodes);
            if (myZnode.equals(root + "/" + lockObjNodes.get(0))) {
                //如果是最小的节点,则表示取得锁
                logger.info(myZnode + "==" + lockObjNodes.get(0));
                return true;
            }
            //如果不是最小的节点，找到比自己小1的节点
            String subMyZnode = myZnode.substring(myZnode.lastIndexOf("/") + 1);
            waitNode = lockObjNodes.get(Collections.binarySearch(lockObjNodes, subMyZnode) - 1);//找到前一个子节点
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        try {
            if (this.tryLock()) {
                return true;
            }
            return waitForLock(waitNode, time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void unlock() {
        try {
            logger.info("unlock " + myZnode);
            zk.delete(myZnode, -1);
            myZnode = null;
            zk.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Condition newCondition() {
        return null;
    }


    private boolean waitForLock(String lower, long waitTime) throws InterruptedException, KeeperException {
        Stat stat = zk.exists(root + "/" + lower, true);//同时注册监听。
        //判断比自己小一个数的节点是否存在,如果不存在则无需等待锁,同时注册监听
        if (stat != null) {
            logger.info("Thread " + Thread.currentThread().getId() + " waiting for " + root + "/" + lower);
            this.latch = new CountDownLatch(1);
            this.latch.await(waitTime, TimeUnit.MILLISECONDS);//等待，这里应该一直等待其他线程释放锁
            this.latch = null;
        }
        return true;
    }

}