package com.hedong.model.bari;

import java.util.Date;

public class WalletNotice {
    private Integer id;

    private String userPhone;

    private String walletName;

    private String value;

    private String symbol;

    private Byte status;

    private String addressFrom;

    private String addressTo;

    private String txhash;

    private Date ctime;

    private Date utime;

    private Byte type;

    private Byte readStatus;

    public WalletNotice(Integer id, String userPhone, String walletName, String value, String symbol, Byte status, String addressFrom, String addressTo, String txhash, Date ctime, Date utime, Byte type, Byte readStatus) {
        this.id = id;
        this.userPhone = userPhone;
        this.walletName = walletName;
        this.value = value;
        this.symbol = symbol;
        this.status = status;
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.txhash = txhash;
        this.ctime = ctime;
        this.utime = utime;
        this.type = type;
        this.readStatus = readStatus;
    }

    public WalletNotice() {
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

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName == null ? null : walletName.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getAddressFrom() {
        return addressFrom;
    }

    public void setAddressFrom(String addressFrom) {
        this.addressFrom = addressFrom == null ? null : addressFrom.trim();
    }

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo == null ? null : addressTo.trim();
    }

    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash == null ? null : txhash.trim();
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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Byte readStatus) {
        this.readStatus = readStatus;
    }
}