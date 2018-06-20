package com.hedong.model.turin;

import java.math.BigDecimal;
import java.util.Date;

public class WorldCupNational {
    private Integer id;

    private Date ctime;

    private Date utime;

    private String nationalId;

    private String name;

    private String englishName;

    private String nationalFlag;

    private BigDecimal championOdds;

    private Byte status;

    private String remark;

    public WorldCupNational(Integer id, Date ctime, Date utime, String nationalId, String name, String englishName, String nationalFlag, BigDecimal championOdds, Byte status, String remark) {
        this.id = id;
        this.ctime = ctime;
        this.utime = utime;
        this.nationalId = nationalId;
        this.name = name;
        this.englishName = englishName;
        this.nationalFlag = nationalFlag;
        this.championOdds = championOdds;
        this.status = status;
        this.remark = remark;
    }

    public WorldCupNational() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId == null ? null : nationalId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getNationalFlag() {
        return nationalFlag;
    }

    public void setNationalFlag(String nationalFlag) {
        this.nationalFlag = nationalFlag == null ? null : nationalFlag.trim();
    }

    public BigDecimal getChampionOdds() {
        return championOdds;
    }

    public void setChampionOdds(BigDecimal championOdds) {
        this.championOdds = championOdds;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}