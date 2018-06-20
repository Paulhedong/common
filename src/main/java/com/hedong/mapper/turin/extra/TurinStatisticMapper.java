package com.hedong.mapper.turin.extra;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @className: TurinStatisticMapper
 * @description:
 * @author: hedong@ibeesaas.com
 * @date: 2018-06-08 19:04
 **/
public interface TurinStatisticMapper {
    @Select("select sum(honey) from user_assets")
    String getTotalHoneyCount();

    @Select("SELECT  ub.login_name loginName, ua.honey honey FROM user_assets ua INNER JOIN user_base ub ON ua.user_id = ub.user_id ORDER BY ua.honey DESC LIMIT 0,30")
    List<Map<String, Object>> getHoneyRankList();

    @Select("select count(*) from user_assets  where ctime between #{startTime} and #{endTime}")
    int getNewUserCount(@Param("startTime") String startTime, @Param("endTime") String endTime);

    @Select("select count(*) from log_user_access  where ctime between #{startTime} and #{endTime}")
    int getDailyUserCount(@Param("startTime") String startTime, @Param("endTime") String endTime);
}
