package com.hedong.mapper.firenze;


import com.hedong.model.firenze.Iou;
import com.hedong.model.firenze.IouExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IouMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    int countByExample(IouExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    int deleteByExample(IouExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    int insert(Iou record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    int insertSelective(Iou record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    List<Iou> selectByExample(IouExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    Iou selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Iou record, @Param("example") IouExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Iou record, @Param("example") IouExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Iou record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iou
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Iou record);
}