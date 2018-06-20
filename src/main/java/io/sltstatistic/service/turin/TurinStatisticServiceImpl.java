package io.sltstatistic.service.turin;

import io.sltstatistic.annotation.TargetDataSource;
import io.sltstatistic.mapper.turin.UserBaseMapper;
import io.sltstatistic.mapper.turin.extra.TurinStatisticMapper;
import io.sltstatistic.model.turin.UserBaseExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @className: TurinStatisticServiceImpl
 * @description:
 * @author: hedong@ibeesaas.com
 * @date: 2018-06-08 18:56
 **/
@Service
public class TurinStatisticServiceImpl implements TurinStatisticService {
    @Resource
    private UserBaseMapper userBaseMapper;
    @Resource
    private TurinStatisticMapper turinStatisticMapper;

    @Override
    public int getUserCount() {
        UserBaseExample userBaseExample = new UserBaseExample();
        return userBaseMapper.countByExample(userBaseExample);
    }

    @Override
    public String getTotalHoneyCount() {
        return turinStatisticMapper.getTotalHoneyCount();
    }

    @Override
    public List<Map<String, Object>> getHoneyRankList() {
        return turinStatisticMapper.getHoneyRankList();
    }

    @Override
    public int getDailyUserCount(String startTime, String endTime) {
        return turinStatisticMapper.getDailyUserCount(startTime, endTime);
    }

    @Override
    public int getNewUserCount(String startTime, String endTime) {
        return turinStatisticMapper.getNewUserCount(startTime, endTime);
    }


}
