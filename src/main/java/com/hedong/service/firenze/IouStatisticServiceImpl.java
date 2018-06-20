package com.hedong.service.firenze;

import com.github.pagehelper.PageHelper;
import com.hedong.constant.ConstantEnum;
import com.hedong.mapper.firenze.IouMapper;
import com.hedong.mapper.firenze.IouUserMapper;
import com.hedong.mapper.firenze.custom.MyIouMapper;
import com.hedong.mapper.firenze.custom.MyIouUserRecordPayMapper;
import com.hedong.model.firenze.IouUserExample;
import com.hedong.mapper.firenze.custom.MyIouUserRecordAwardMapper;
import com.hedong.model.firenze.IouUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author zhaozhihong
 * @create 2018-06-08 15:05
 * @desc
 **/
@Service
public class IouStatisticServiceImpl implements IouStatisticService {

    @Autowired
    private IouUserMapper iouUserMapper;
    @Autowired
    private IouMapper iouMapper;
    @Autowired
    private MyIouMapper myIouMapper;
    @Autowired
    private MyIouUserRecordAwardMapper myIouUserRecordAwardMapper;
    @Autowired
    MyIouUserRecordPayMapper myIouUserRecordPayMapper;

    @Override
    public int getRealNameUserNum() {
        IouUserExample iouUserExample = new IouUserExample();
        iouUserExample.createCriteria().andIsCertificatedEqualTo((byte) 1);
        return iouUserMapper.countByExample(iouUserExample);
    }

    @Override
    public Map<String, Object> getTotalIouNum() {
        List<Map<String, Object>> resaultList = myIouMapper.selectIouNumGroupByStatus();
        List<Map<String, Object>> sortMapList = new ArrayList<>();
        for (ConstantEnum.IouStatus iouStatus : ConstantEnum.IouStatus.values()){
            Map tempMap = new HashMap();
            boolean flag = false;
            for(Map m : resaultList){
                if(m.get("status").toString().equals(String.valueOf(iouStatus.value))){
                    flag = true;
                    tempMap.put("status", iouStatus.discription);
                    tempMap.put("number", m.get("number"));
                }
            }
            if(!flag){
                tempMap.put("status", iouStatus.discription);
                tempMap.put("number", 0);
            }
            sortMapList.add(tempMap);
        }
        int totalIou = resaultList.stream().mapToInt(m -> Integer.valueOf(String.valueOf(m.get("number")))).sum();
        List<Map<String, Object>> appealList = myIouMapper.selectAppealIouGroupByStatus();
        for(ConstantEnum.IouAppealStatus iouAppealStatus : ConstantEnum.IouAppealStatus.values()){
            boolean flag = false;
            for(Map m : appealList){
                if(m.get("status").toString().equals(String.valueOf(iouAppealStatus.value))){
                    flag = true;
                    m.put("status", iouAppealStatus.discription);
                }
            }
            if(!flag){
                Map<String, Object> tempMap = new HashMap<>();
                tempMap.put("status", iouAppealStatus.discription);
                tempMap.put("number", 0);
                appealList.add(tempMap);
            }
        }
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("iouStatus", sortMapList);
        resultMap.put("totalIou", totalIou);
        resultMap.put("appealStatus", appealList);
        return resultMap;
    }

    @Override
    public Map<String, Object> getSltNum() {
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> sltList = myIouUserRecordAwardMapper.selectSltNumGroupbyScene();
        sltList.forEach(m -> m.put("scene", ConstantEnum.SltAwardScene.match(Byte.valueOf(m.get("scene").toString()))));
        double totalSlt = sltList.stream().mapToDouble(m -> Double.valueOf(String.valueOf(m.get("amount")))).sum();
        map.put("sltList", sltList);
        map.put("totalSlt", totalSlt);
        return map;
    }

    @Override
    public String getTotalSltCount() {
        List<Map<String, Object>> sltList = myIouUserRecordAwardMapper.selectSltNumGroupbyScene();

        return null;
    }

    @Override
    public List<IouUser> getIouUserOrderBySlt() {
        IouUserExample iouUserExample = new IouUserExample();
        iouUserExample.setOrderByClause("slt_amount desc");
        PageHelper.offsetPage(0, 30);
        return iouUserMapper.selectByExample(iouUserExample);
    }

    @Override
    public Map<String, Object> getRecieveMoney() {
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> incomes = myIouUserRecordPayMapper.selectIncomeGroupbyScene();
        incomes.forEach(
                m -> m.put("scene", ConstantEnum.PayType.getMessageByCode(Byte.valueOf(m.get("scene").toString())))
        );
        BigDecimal totalAmount = incomes.stream().map(m -> new BigDecimal(String.valueOf(m.get("amount")))).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
        map.put("totalAmount", totalAmount);
        map.put("list", incomes);
        return map;
    }

}
