package io.sltstatistic.mapper.bari;

import io.sltstatistic.model.bari.Wallet;
import io.sltstatistic.model.bari.WalletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WalletMapper {
    long countByExample(WalletExample example);

    int deleteByExample(WalletExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wallet record);

    int insertSelective(Wallet record);

    List<Wallet> selectByExample(WalletExample example);

    Wallet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wallet record, @Param("example") WalletExample example);

    int updateByExample(@Param("record") Wallet record, @Param("example") WalletExample example);

    int updateByPrimaryKeySelective(Wallet record);

    int updateByPrimaryKey(Wallet record);
}