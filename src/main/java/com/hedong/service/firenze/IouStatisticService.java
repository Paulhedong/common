package com.hedong.service.firenze;

import com.hedong.model.firenze.IouUser;

import java.util.List;
import java.util.Map;

/**
 * @author zhaozhihong
 * @create 2018-06-08 14:56
 * @desc
 **/
public interface IouStatisticService {

    int getRealNameUserNum();

    Map<String, Object> getTotalIouNum();

    Map<String, Object> getSltNum();

    String getTotalSltCount();

    List<IouUser> getIouUserOrderBySlt();

    Map<String, Object> getRecieveMoney();

}
