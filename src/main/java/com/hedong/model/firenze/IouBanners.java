package com.hedong.model.firenze;

import java.util.Date;

public class IouBanners {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_banners.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_banners.ctime
     *
     * @mbggenerated
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_banners.utime
     *
     * @mbggenerated
     */
    private Date utime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_banners.banner_name
     *
     * @mbggenerated
     */
    private String bannerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_banners.banner_img_url
     *
     * @mbggenerated
     */
    private String bannerImgUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_banners.link_url
     *
     * @mbggenerated
     */
    private String linkUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_banners.sequence
     *
     * @mbggenerated
     */
    private Integer sequence;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou_banners.is_available
     *
     * @mbggenerated
     */
    private Byte isAvailable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_banners.id
     *
     * @return the value of iou_banners.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_banners.id
     *
     * @param id the value for iou_banners.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_banners.ctime
     *
     * @return the value of iou_banners.ctime
     *
     * @mbggenerated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_banners.ctime
     *
     * @param ctime the value for iou_banners.ctime
     *
     * @mbggenerated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_banners.utime
     *
     * @return the value of iou_banners.utime
     *
     * @mbggenerated
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_banners.utime
     *
     * @param utime the value for iou_banners.utime
     *
     * @mbggenerated
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_banners.banner_name
     *
     * @return the value of iou_banners.banner_name
     *
     * @mbggenerated
     */
    public String getBannerName() {
        return bannerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_banners.banner_name
     *
     * @param bannerName the value for iou_banners.banner_name
     *
     * @mbggenerated
     */
    public void setBannerName(String bannerName) {
        this.bannerName = bannerName == null ? null : bannerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_banners.banner_img_url
     *
     * @return the value of iou_banners.banner_img_url
     *
     * @mbggenerated
     */
    public String getBannerImgUrl() {
        return bannerImgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_banners.banner_img_url
     *
     * @param bannerImgUrl the value for iou_banners.banner_img_url
     *
     * @mbggenerated
     */
    public void setBannerImgUrl(String bannerImgUrl) {
        this.bannerImgUrl = bannerImgUrl == null ? null : bannerImgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_banners.link_url
     *
     * @return the value of iou_banners.link_url
     *
     * @mbggenerated
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_banners.link_url
     *
     * @param linkUrl the value for iou_banners.link_url
     *
     * @mbggenerated
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_banners.sequence
     *
     * @return the value of iou_banners.sequence
     *
     * @mbggenerated
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_banners.sequence
     *
     * @param sequence the value for iou_banners.sequence
     *
     * @mbggenerated
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou_banners.is_available
     *
     * @return the value of iou_banners.is_available
     *
     * @mbggenerated
     */
    public Byte getIsAvailable() {
        return isAvailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou_banners.is_available
     *
     * @param isAvailable the value for iou_banners.is_available
     *
     * @mbggenerated
     */
    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }
}