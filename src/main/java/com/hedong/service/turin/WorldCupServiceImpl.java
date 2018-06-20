package com.hedong.service.turin;

import com.hedong.mapper.turin.extra.WorldCupStatisticMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author zhaozhihong
 * @create 2018-06-15 17:01
 * @desc 世界杯活动统计
 **/
@Service
public class WorldCupServiceImpl implements WorldCupService{

    @Autowired
    private WorldCupStatisticMapper worldCupStatisticMapper;

    @Override
    public Map<String, String> getWorldCupBetCount() {
        return worldCupStatisticMapper.getWorldCupBetCount();
    }

    @Override
    public List<Map<String, String>> getBetCountryRank() {
        return worldCupStatisticMapper.getBetCountryRank();
    }
}
