package io.sltstatistic.model.bari;

import java.util.Date;

public class TransactionLog {
    private Integer id;

    private String tokenAddress;

    private String from;

    private String to;

    private String value;

    private String gasFee;

    private String message;

    private Date ctime;

    private Date utime;

    private String txhash;

    private Integer blockNum;

    private Byte status;

    private Integer timeStamp;

    private Integer nonce;

    private String gasPrice;

    private String gasLimit;

    private String gasUsed;

    private String lastTxHash;

    public TransactionLog(Integer id, String tokenAddress, String from, String to, String value, String gasFee, String message, Date ctime, Date utime, String txhash, Integer blockNum, Byte status, Integer timeStamp, Integer nonce, String gasPrice, String gasLimit, String gasUsed, String lastTxHash) {
        this.id = id;
        this.tokenAddress = tokenAddress;
        this.from = from;
        this.to = to;
        this.value = value;
        this.gasFee = gasFee;
        this.message = message;
        this.ctime = ctime;
        this.utime = utime;
        this.txhash = txhash;
        this.blockNum = blockNum;
        this.status = status;
        this.timeStamp = timeStamp;
        this.nonce = nonce;
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
        this.gasUsed = gasUsed;
        this.lastTxHash = lastTxHash;
    }

    public TransactionLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTokenAddress() {
        return tokenAddress;
    }

    public void setTokenAddress(String tokenAddress) {
        this.tokenAddress = tokenAddress == null ? null : tokenAddress.trim();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getGasFee() {
        return gasFee;
    }

    public void setGasFee(String gasFee) {
        this.gasFee = gasFee == null ? null : gasFee.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
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

    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash == null ? null : txhash.trim();
    }

    public Integer getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Integer timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getNonce() {
        return nonce;
    }

    public void setNonce(Integer nonce) {
        this.nonce = nonce;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice == null ? null : gasPrice.trim();
    }

    public String getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(String gasLimit) {
        this.gasLimit = gasLimit == null ? null : gasLimit.trim();
    }

    public String getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed == null ? null : gasUsed.trim();
    }

    public String getLastTxHash() {
        return lastTxHash;
    }

    public void setLastTxHash(String lastTxHash) {
        this.lastTxHash = lastTxHash == null ? null : lastTxHash.trim();
    }
}