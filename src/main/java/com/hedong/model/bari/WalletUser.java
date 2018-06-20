package com.hedong.model.bari;

import java.util.Date;

public class WalletUser {
    private Integer id;

    private String userPhone;

    private String password;

    private String passwordHint;

    private String channel;

    private String version;

    private String deviceNumber;

    private Date ctime;

    private Date utime;

    private String jpushRegId;

    private Byte loginStatus;

    public WalletUser(Integer id, String userPhone, String password, String passwordHint, String channel, String version, String deviceNumber, Date ctime, Date utime, String jpushRegId, Byte loginStatus) {
        this.id = id;
        this.userPhone = userPhone;
        this.password = password;
        this.passwordHint = passwordHint;
        this.channel = channel;
        this.version = version;
        this.deviceNumber = deviceNumber;
        this.ctime = ctime;
        this.utime = utime;
        this.jpushRegId = jpushRegId;
        this.loginStatus = loginStatus;
    }

    public WalletUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint == null ? null : passwordHint.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber == null ? null : deviceNumber.trim();
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

    public String getJpushRegId() {
        return jpushRegId;
    }

    public void setJpushRegId(String jpushRegId) {
        this.jpushRegId = jpushRegId == null ? null : jpushRegId.trim();
    }

    public Byte getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Byte loginStatus) {
        this.loginStatus = loginStatus;
    }
}