package com.hedong.model.bari;

import java.util.Date;

public class Wallet {
    private Integer id;

    private String logo;

    private String name;

    private String ethAddress;

    private String userPhone;

    private String v3Json;

    private Date ctime;

    private Date utime;

    private Byte status;

    private String iban;

    public Wallet(Integer id, String logo, String name, String ethAddress, String userPhone, String v3Json, Date ctime, Date utime, Byte status, String iban) {
        this.id = id;
        this.logo = logo;
        this.name = name;
        this.ethAddress = ethAddress;
        this.userPhone = userPhone;
        this.v3Json = v3Json;
        this.ctime = ctime;
        this.utime = utime;
        this.status = status;
        this.iban = iban;
    }

    public Wallet() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEthAddress() {
        return ethAddress;
    }

    public void setEthAddress(String ethAddress) {
        this.ethAddress = ethAddress == null ? null : ethAddress.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getV3Json() {
        return v3Json;
    }

    public void setV3Json(String v3Json) {
        this.v3Json = v3Json == null ? null : v3Json.trim();
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban == null ? null : iban.trim();
    }
}