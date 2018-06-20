package io.sltstatistic.service.turin;

import java.util.List;
import java.util.Map;

/**
 * @author zhaozhihong
 * @create 2018-06-15 17:00
 * @desc
 **/
public interface WorldCupService {

    Map<String, String> getWorldCupBetCount();

    List<Map<String, String>> getBetCountryRank();

}
