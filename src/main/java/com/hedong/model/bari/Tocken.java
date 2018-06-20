package com.hedong.model.bari;

import java.math.BigDecimal;
import java.util.Date;

public class Tocken {
    private Integer id;

    private String symbol;

    private String name;

    private String logo;

    private Byte chainType;

    private Byte type;

    private String address;

    private Date ctime;

    private Date utime;

    private Integer seqNum;

    private BigDecimal priceUsd;

    private BigDecimal priceCny;

    private Byte decimalVal;

    private Integer transferGasUsed;

    private Byte status;

    public Tocken(Integer id, String symbol, String name, String logo, Byte chainType, Byte type, String address, Date ctime, Date utime, Integer seqNum, BigDecimal priceUsd, BigDecimal priceCny, Byte decimalVal, Integer transferGasUsed, Byte status) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.logo = logo;
        this.chainType = chainType;
        this.type = type;
        this.address = address;
        this.ctime = ctime;
        this.utime = utime;
        this.seqNum = seqNum;
        this.priceUsd = priceUsd;
        this.priceCny = priceCny;
        this.decimalVal = decimalVal;
        this.transferGasUsed = transferGasUsed;
        this.status = status;
    }

    public Tocken() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Byte getChainType() {
        return chainType;
    }

    public void setChainType(Byte chainType) {
        this.chainType = chainType;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public BigDecimal getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(BigDecimal priceUsd) {
        this.priceUsd = priceUsd;
    }

    public BigDecimal getPriceCny() {
        return priceCny;
    }

    public void setPriceCny(BigDecimal priceCny) {
        this.priceCny = priceCny;
    }

    public Byte getDecimalVal() {
        return decimalVal;
    }

    public void setDecimalVal(Byte decimalVal) {
        this.decimalVal = decimalVal;
    }

    public Integer getTransferGasUsed() {
        return transferGasUsed;
    }

    public void setTransferGasUsed(Integer transferGasUsed) {
        this.transferGasUsed = transferGasUsed;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}