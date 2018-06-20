package io.sltstatistic.service.bari;

import io.sltstatistic.mapper.bari.custom.MyWalletMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author zhaozhihong
 * @create 2018-06-15 14:04
 * @desc
 **/
@Service
public class BariServiceImpl implements BariService{

    @Autowired
    private MyWalletMapper myWalletMapper;

    @Override
    public List<Map<String, Integer>> getLast30DaysWalletCount() {
        return myWalletMapper.getLast30DaysWalletCount();
    }

    @Override
    public int getWalletNum() {
        return myWalletMapper.getWalletNum();
    }

    @Override
    public int getUserNumHasWallet() {
        return myWalletMapper.getUserNumHasWallet();
    }

    @Override
    public List<Map<String, String>> getWallentCountGroupByToken() {
        return myWalletMapper.getWallentCountGroupByToken();
    }
}
