package io.sltstatistic.mapper.bari.custom;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author zhaozhihong
 * @create 2018-06-15 13:57
 * @desc
 **/
@Mapper
public interface MyWalletMapper {

    @Select("SELECT date_format(ctime, '%Y-%m-%d') AS thedate, count(id) AS walletcount FROM wallet GROUP BY thedate desc limit 30")
    List<Map<String, Integer>> getLast30DaysWalletCount();

    @Select("SELECT count(id) FROM wallet")
    int getWalletNum();

    @Select("SELECT count(DISTINCT user_phone) FROM wallet")
    int getUserNumHasWallet();

    @Select("SELECT wt.token_id as id, t.symbol as token, count(wt.token_id) as count FROM wallet_token wt, token t WHERE wt.token_id = t.id GROUP BY token_id ORDER BY count DESC")
    List<Map<String, String>> getWallentCountGroupByToken();

}
