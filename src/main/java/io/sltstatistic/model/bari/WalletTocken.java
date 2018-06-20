package io.sltstatistic.model.bari;

import java.util.Date;

public class WalletTocken {
    private Integer id;

    private Integer tokenId;

    private Integer walletId;

    private Date ctime;

    private Date utime;

    private Byte status;

    public WalletTocken(Integer id, Integer tokenId, Integer walletId, Date ctime, Date utime, Byte status) {
        this.id = id;
        this.tokenId = tokenId;
        this.walletId = walletId;
        this.ctime = ctime;
        this.utime = utime;
        this.status = status;
    }

    public WalletTocken() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
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