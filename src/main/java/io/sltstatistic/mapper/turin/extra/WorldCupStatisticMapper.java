package io.sltstatistic.mapper.turin.extra;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author zhaozhihong
 * @create 2018-06-15 16:39
 * @desc 世界杯活动统计
 **/
public interface WorldCupStatisticMapper {

    @Select("SELECT COUNT(id) AS 押注人数, COUNT(DISTINCT user_id) AS 押注数量, SUM(guess_number) AS 押注honey量 FROM world_cup_guess_record")
    Map<String, String> getWorldCupBetCount();

    @Select("SELECT wn.`name`, sum(wr.guess_number) AS betCount FROM world_cup_guess_record wr, world_cup_national wn WHERE wr.national_id = wn.national_id GROUP BY wn.`name` ORDER BY betCount DESC")
    List<Map<String, String>> getBetCountryRank();

}
