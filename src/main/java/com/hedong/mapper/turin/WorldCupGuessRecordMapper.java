package com.hedong.mapper.turin;

import com.hedong.model.turin.WorldCupGuessRecord;
import com.hedong.model.turin.WorldCupGuessRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorldCupGuessRecordMapper {
    long countByExample(WorldCupGuessRecordExample example);

    int deleteByExample(WorldCupGuessRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorldCupGuessRecord record);

    int insertSelective(WorldCupGuessRecord record);

    List<WorldCupGuessRecord> selectByExample(WorldCupGuessRecordExample example);

    WorldCupGuessRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorldCupGuessRecord record, @Param("example") WorldCupGuessRecordExample example);

    int updateByExample(@Param("record") WorldCupGuessRecord record, @Param("example") WorldCupGuessRecordExample example);

    int updateByPrimaryKeySelective(WorldCupGuessRecord record);

    int updateByPrimaryKey(WorldCupGuessRecord record);
}