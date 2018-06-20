package io.sltstatistic.model.firenze;

public class IouConfig {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_config.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_config.config_key
     *
     * @mbggenerated
     */
    private String configKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_config.config_value
     *
     * @mbggenerated
     */
    private String configValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_config.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_config.id
     *
     * @return the value of iou_config.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_config.id
     *
     * @param id the value for iou_config.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_config.config_key
     *
     * @return the value of iou_config.config_key
     *
     * @mbggenerated
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_config.config_key
     *
     * @param configKey the value for iou_config.config_key
     *
     * @mbggenerated
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey == null ? null : configKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_config.config_value
     *
     * @return the value of iou_config.config_value
     *
     * @mbggenerated
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_config.config_value
     *
     * @param configValue the value for iou_config.config_value
     *
     * @mbggenerated
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_config.remark
     *
     * @return the value of iou_config.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_config.remark
     *
     * @param remark the value for iou_config.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}