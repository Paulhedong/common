package com.hedong.mapper.firenze;


import com.hedong.model.firenze.IouUserCreditRelation;
import com.hedong.model.firenze.IouUserCreditRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IouUserCreditRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    int countByExample(IouUserCreditRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    int deleteByExample(IouUserCreditRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    int insert(IouUserCreditRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    int insertSelective(IouUserCreditRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    List<IouUserCreditRelation> selectByExample(IouUserCreditRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    IouUserCreditRelation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") IouUserCreditRelation record, @Param("example") IouUserCreditRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") IouUserCreditRelation record, @Param("example") IouUserCreditRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(IouUserCreditRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_credit_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(IouUserCreditRelation record);
}