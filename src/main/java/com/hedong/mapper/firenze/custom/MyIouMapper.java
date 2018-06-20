package com.hedong.mapper.firenze.custom;


import java.util.List;
import java.util.Map;

public interface MyIouMapper {

    List<Map<String, Object>> selectIouNumGroupByStatus();

    List<Map<String, Object>> selectAppealIouGroupByStatus();

}