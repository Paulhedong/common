package io.sltstatistic.service.bari;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author zhaozhihong
 * @create 2018-06-15 12:31
 * @desc
 **/
public interface BariService {

    List<Map<String, Integer>> getLast30DaysWalletCount();

    int getWalletNum();

    int getUserNumHasWallet();

    List<Map<String, String>> getWallentCountGroupByToken();

}
