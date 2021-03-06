package com.hedong.mapper.firenze;


import com.hedong.model.firenze.IouUserAuthInfo;
import com.hedong.model.firenze.IouUserAuthInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IouUserAuthInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    int countByExample(IouUserAuthInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    int deleteByExample(IouUserAuthInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    int insert(IouUserAuthInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    int insertSelective(IouUserAuthInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    List<IouUserAuthInfo> selectByExample(IouUserAuthInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    IouUserAuthInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") IouUserAuthInfo record, @Param("example") IouUserAuthInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") IouUserAuthInfo record, @Param("example") IouUserAuthInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(IouUserAuthInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_auth_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(IouUserAuthInfo record);
}