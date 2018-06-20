package io.sltstatistic.model.turin;

import java.math.BigDecimal;
import java.util.Date;

public class Task {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.ctime
     *
     * @mbggenerated
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.utime
     *
     * @mbggenerated
     */
    private Date utime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.task_name
     *
     * @mbggenerated
     */
    private String taskName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.task_details
     *
     * @mbggenerated
     */
    private String taskDetails;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.award_beenum
     *
     * @mbggenerated
     */
    private Integer awardBeenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.award_honeynum
     *
     * @mbggenerated
     */
    private BigDecimal awardHoneynum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.award_limit
     *
     * @mbggenerated
     */
    private Integer awardLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.task_status
     *
     * @mbggenerated
     */
    private Byte taskStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.id
     *
     * @return the value of task.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.id
     *
     * @param id the value for task.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.ctime
     *
     * @return the value of task.ctime
     *
     * @mbggenerated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.ctime
     *
     * @param ctime the value for task.ctime
     *
     * @mbggenerated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.utime
     *
     * @return the value of task.utime
     *
     * @mbggenerated
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.utime
     *
     * @param utime the value for task.utime
     *
     * @mbggenerated
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.task_name
     *
     * @return the value of task.task_name
     *
     * @mbggenerated
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.task_name
     *
     * @param taskName the value for task.task_name
     *
     * @mbggenerated
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.task_details
     *
     * @return the value of task.task_details
     *
     * @mbggenerated
     */
    public String getTaskDetails() {
        return taskDetails;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.task_details
     *
     * @param taskDetails the value for task.task_details
     *
     * @mbggenerated
     */
    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails == null ? null : taskDetails.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.award_beenum
     *
     * @return the value of task.award_beenum
     *
     * @mbggenerated
     */
    public Integer getAwardBeenum() {
        return awardBeenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.award_beenum
     *
     * @param awardBeenum the value for task.award_beenum
     *
     * @mbggenerated
     */
    public void setAwardBeenum(Integer awardBeenum) {
        this.awardBeenum = awardBeenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.award_honeynum
     *
     * @return the value of task.award_honeynum
     *
     * @mbggenerated
     */
    public BigDecimal getAwardHoneynum() {
        return awardHoneynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.award_honeynum
     *
     * @param awardHoneynum the value for task.award_honeynum
     *
     * @mbggenerated
     */
    public void setAwardHoneynum(BigDecimal awardHoneynum) {
        this.awardHoneynum = awardHoneynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.award_limit
     *
     * @return the value of task.award_limit
     *
     * @mbggenerated
     */
    public Integer getAwardLimit() {
        return awardLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.award_limit
     *
     * @param awardLimit the value for task.award_limit
     *
     * @mbggenerated
     */
    public void setAwardLimit(Integer awardLimit) {
        this.awardLimit = awardLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.task_status
     *
     * @return the value of task.task_status
     *
     * @mbggenerated
     */
    public Byte getTaskStatus() {
        return taskStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.task_status
     *
     * @param taskStatus the value for task.task_status
     *
     * @mbggenerated
     */
    public void setTaskStatus(Byte taskStatus) {
        this.taskStatus = taskStatus;
    }
}