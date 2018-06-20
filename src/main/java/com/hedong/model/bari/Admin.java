package com.hedong.model.bari;

import java.util.Date;

public class Admin {
    private Integer id;

    private String userName;

    private String password;

    private Date ctime;

    private Date utime;

    private Byte status;

    public Admin(Integer id, String userName, String password, Date ctime, Date utime, Byte status) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.ctime = ctime;
        this.utime = utime;
        this.status = status;
    }

    public Admin() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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
}