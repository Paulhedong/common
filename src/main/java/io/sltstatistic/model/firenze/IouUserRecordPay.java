package io.sltstatistic.model.firenze;

import java.util.Date;

public class IouUserRecordPay {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.pay_type
     *
     * @mbg.generated
     */
    private Byte payType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.pay_amount
     *
     * @mbg.generated
     */
    private Integer payAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.pay_way
     *
     * @mbg.generated
     */
    private Byte payWay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.pay_status
     *
     * @mbg.generated
     */
    private Byte payStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.order_no
     *
     * @mbg.generated
     */
    private String orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.channel_order_no
     *
     * @mbg.generated
     */
    private String channelOrderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.channel_return_code
     *
     * @mbg.generated
     */
    private String channelReturnCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.fail_reason
     *
     * @mbg.generated
     */
    private String failReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.to_user_id
     *
     * @mbg.generated
     */
    private String toUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.utime
     *
     * @mbg.generated
     */
    private Date utime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_user_record_pay.complete_time
     *
     * @mbg.generated
     */
    private String completeTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.id
     *
     * @return the value of iou_user_record_pay.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.id
     *
     * @param id the value for iou_user_record_pay.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.user_id
     *
     * @return the value of iou_user_record_pay.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.user_id
     *
     * @param userId the value for iou_user_record_pay.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.pay_type
     *
     * @return the value of iou_user_record_pay.pay_type
     *
     * @mbg.generated
     */
    public Byte getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.pay_type
     *
     * @param payType the value for iou_user_record_pay.pay_type
     *
     * @mbg.generated
     */
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.pay_amount
     *
     * @return the value of iou_user_record_pay.pay_amount
     *
     * @mbg.generated
     */
    public Integer getPayAmount() {
        return payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.pay_amount
     *
     * @param payAmount the value for iou_user_record_pay.pay_amount
     *
     * @mbg.generated
     */
    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.pay_way
     *
     * @return the value of iou_user_record_pay.pay_way
     *
     * @mbg.generated
     */
    public Byte getPayWay() {
        return payWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.pay_way
     *
     * @param payWay the value for iou_user_record_pay.pay_way
     *
     * @mbg.generated
     */
    public void setPayWay(Byte payWay) {
        this.payWay = payWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.pay_status
     *
     * @return the value of iou_user_record_pay.pay_status
     *
     * @mbg.generated
     */
    public Byte getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.pay_status
     *
     * @param payStatus the value for iou_user_record_pay.pay_status
     *
     * @mbg.generated
     */
    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.order_no
     *
     * @return the value of iou_user_record_pay.order_no
     *
     * @mbg.generated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.order_no
     *
     * @param orderNo the value for iou_user_record_pay.order_no
     *
     * @mbg.generated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.channel_order_no
     *
     * @return the value of iou_user_record_pay.channel_order_no
     *
     * @mbg.generated
     */
    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.channel_order_no
     *
     * @param channelOrderNo the value for iou_user_record_pay.channel_order_no
     *
     * @mbg.generated
     */
    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo == null ? null : channelOrderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.channel_return_code
     *
     * @return the value of iou_user_record_pay.channel_return_code
     *
     * @mbg.generated
     */
    public String getChannelReturnCode() {
        return channelReturnCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.channel_return_code
     *
     * @param channelReturnCode the value for iou_user_record_pay.channel_return_code
     *
     * @mbg.generated
     */
    public void setChannelReturnCode(String channelReturnCode) {
        this.channelReturnCode = channelReturnCode == null ? null : channelReturnCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.fail_reason
     *
     * @return the value of iou_user_record_pay.fail_reason
     *
     * @mbg.generated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.fail_reason
     *
     * @param failReason the value for iou_user_record_pay.fail_reason
     *
     * @mbg.generated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.to_user_id
     *
     * @return the value of iou_user_record_pay.to_user_id
     *
     * @mbg.generated
     */
    public String getToUserId() {
        return toUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.to_user_id
     *
     * @param toUserId the value for iou_user_record_pay.to_user_id
     *
     * @mbg.generated
     */
    public void setToUserId(String toUserId) {
        this.toUserId = toUserId == null ? null : toUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.ctime
     *
     * @return the value of iou_user_record_pay.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.ctime
     *
     * @param ctime the value for iou_user_record_pay.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.utime
     *
     * @return the value of iou_user_record_pay.utime
     *
     * @mbg.generated
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.utime
     *
     * @param utime the value for iou_user_record_pay.utime
     *
     * @mbg.generated
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_user_record_pay.complete_time
     *
     * @return the value of iou_user_record_pay.complete_time
     *
     * @mbg.generated
     */
    public String getCompleteTime() {
        return completeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_user_record_pay.complete_time
     *
     * @param completeTime the value for iou_user_record_pay.complete_time
     *
     * @mbg.generated
     */
    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime == null ? null : completeTime.trim();
    }
}