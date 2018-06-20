package com.hedong.mapper.turin;

import com.hedong.model.turin.WorldCupNational;
import com.hedong.model.turin.WorldCupNationalExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorldCupNationalMapper {
    long countByExample(WorldCupNationalExample example);

    int deleteByExample(WorldCupNationalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorldCupNational record);

    int insertSelective(WorldCupNational record);

    List<WorldCupNational> selectByExample(WorldCupNationalExample example);

    WorldCupNational selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorldCupNational record, @Param("example") WorldCupNationalExample example);

    int updateByExample(@Param("record") WorldCupNational record, @Param("example") WorldCupNationalExample example);

    int updateByPrimaryKeySelective(WorldCupNational record);

    int updateByPrimaryKey(WorldCupNational record);
}