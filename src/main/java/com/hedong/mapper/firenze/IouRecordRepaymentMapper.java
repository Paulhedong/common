package com.hedong.mapper.firenze;


import com.hedong.model.firenze.IouRecordRepayment;
import com.hedong.model.firenze.IouRecordRepaymentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IouRecordRepaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    long countByExample(IouRecordRepaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    int deleteByExample(IouRecordRepaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    int insert(IouRecordRepayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    int insertSelective(IouRecordRepayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    List<IouRecordRepayment> selectByExample(IouRecordRepaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    IouRecordRepayment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IouRecordRepayment record, @Param("example") IouRecordRepaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IouRecordRepayment record, @Param("example") IouRecordRepaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IouRecordRepayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou_record_repayment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IouRecordRepayment record);
}