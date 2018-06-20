package io.sltstatistic.service.turin;


import java.util.List;
import java.util.Map;


public interface TurinStatisticService {


    /**
     * 获取注册用户数
     *
     * @return
     */
    int getUserCount();

    /**
     * 获取honey总数
     *
     * @return
     */
    String getTotalHoneyCount();

    /**
     * honey用户排行（top30） 
     *
     * @return
     */
    List<Map<String, Object>> getHoneyRankList();

    /**
     * 日活查询
     *  @param startTime 开始时间（2018-06-07 00:00:00）
     * @param endTime   结束时间（2018-06-08 00:00:00）
     * @return
     */
    int getDailyUserCount(String startTime,String endTime);

    /**
     * 按时间查找注册用户数
     *
     * @param startTime 开始时间（2018-06-07 00:00:00）
     * @param endTime   结束时间（2018-06-08 00:00:00）
     * @return
     */
    int getNewUserCount(String startTime, String endTime);

}
