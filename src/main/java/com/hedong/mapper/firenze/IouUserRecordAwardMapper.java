package com.hedong.mapper.firenze;


import com.hedong.model.firenze.IouUserRecordAwardExample;
import com.hedong.model.firenze.IouUserRecordAward;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IouUserRecordAwardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    int countByExample(IouUserRecordAwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    int deleteByExample(IouUserRecordAwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    int insert(IouUserRecordAward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    int insertSelective(IouUserRecordAward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    List<IouUserRecordAward> selectByExample(IouUserRecordAwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    IouUserRecordAward selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") IouUserRecordAward record, @Param("example") IouUserRecordAwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") IouUserRecordAward record, @Param("example") IouUserRecordAwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(IouUserRecordAward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_user_record_award
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(IouUserRecordAward record);
}