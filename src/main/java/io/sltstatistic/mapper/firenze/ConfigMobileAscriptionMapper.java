package io.sltstatistic.mapper.firenze;


import io.sltstatistic.model.firenze.ConfigMobileAscription;
import io.sltstatistic.model.firenze.ConfigMobileAscriptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConfigMobileAscriptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    long countByExample(ConfigMobileAscriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    int deleteByExample(ConfigMobileAscriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    int insert(ConfigMobileAscription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    int insertSelective(ConfigMobileAscription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    List<ConfigMobileAscription> selectByExample(ConfigMobileAscriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    ConfigMobileAscription selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ConfigMobileAscription record, @Param("example") ConfigMobileAscriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ConfigMobileAscription record, @Param("example") ConfigMobileAscriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ConfigMobileAscription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_mobile_ascription
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ConfigMobileAscription record);
}