package io.sltstatistic.config;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaozhihong
 * @create 2017-12-28 18:35
 * @desc 当前线程持有的数据源
 **/
public class DynamicDataSourceThreadHolder {

    private static ThreadLocal<String> dataSourceHolder = new ThreadLocal<>();
    public static List<Object> dataSourceList = new ArrayList<>();

    public static String getCurrentSourceName(){
        return dataSourceHolder.get();
    }

    public static void putCurrentSourceName(String dataSourceName){
        dataSourceHolder.set(dataSourceName);
    }

    public static void clearDataSourceHolder(){
        dataSourceHolder.remove();
    }

    public static boolean containDataSourceKey(String dataSourceKey){
        return dataSourceList.contains(dataSourceKey);
    }

}
