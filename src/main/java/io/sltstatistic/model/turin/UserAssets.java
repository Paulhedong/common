package io.sltstatistic.model.turin;

import java.math.BigDecimal;
import java.util.Date;

public class UserAssets {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_assets.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_assets.ctime
     *
     * @mbggenerated
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_assets.utime
     *
     * @mbggenerated
     */
    private Date utime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_assets.bee_count
     *
     * @mbggenerated
     */
    private Integer beeCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_assets.honey
     *
     * @mbggenerated
     */
    private BigDecimal honey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_assets.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_assets.id
     *
     * @return the value of user_assets.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_assets.id
     *
     * @param id the value for user_assets.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_assets.ctime
     *
     * @return the value of user_assets.ctime
     *
     * @mbggenerated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_assets.ctime
     *
     * @param ctime the value for user_assets.ctime
     *
     * @mbggenerated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_assets.utime
     *
     * @return the value of user_assets.utime
     *
     * @mbggenerated
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_assets.utime
     *
     * @param utime the value for user_assets.utime
     *
     * @mbggenerated
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_assets.bee_count
     *
     * @return the value of user_assets.bee_count
     *
     * @mbggenerated
     */
    public Integer getBeeCount() {
        return beeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_assets.bee_count
     *
     * @param beeCount the value for user_assets.bee_count
     *
     * @mbggenerated
     */
    public void setBeeCount(Integer beeCount) {
        this.beeCount = beeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_assets.honey
     *
     * @return the value of user_assets.honey
     *
     * @mbggenerated
     */
    public BigDecimal getHoney() {
        return honey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_assets.honey
     *
     * @param honey the value for user_assets.honey
     *
     * @mbggenerated
     */
    public void setHoney(BigDecimal honey) {
        this.honey = honey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_assets.user_id
     *
     * @return the value of user_assets.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_assets.user_id
     *
     * @param userId the value for user_assets.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}