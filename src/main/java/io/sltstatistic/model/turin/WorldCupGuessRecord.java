package io.sltstatistic.model.turin;

import java.math.BigDecimal;
import java.util.Date;

public class WorldCupGuessRecord {
    private Integer id;

    private Date ctime;

    private Date utime;

    private String userId;

    private String gameId;

    private String nationalId;

    private Integer guessNumber;

    private BigDecimal odds;

    private Byte status;

    public WorldCupGuessRecord(Integer id, Date ctime, Date utime, String userId, String gameId, String nationalId, Integer guessNumber, BigDecimal odds, Byte status) {
        this.id = id;
        this.ctime = ctime;
        this.utime = utime;
        this.userId = userId;
        this.gameId = gameId;
        this.nationalId = nationalId;
        this.guessNumber = guessNumber;
        this.odds = odds;
        this.status = status;
    }

    public WorldCupGuessRecord() {
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId == null ? null : gameId.trim();
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId == null ? null : nationalId.trim();
    }

    public Integer getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(Integer guessNumber) {
        this.guessNumber = guessNumber;
    }

    public BigDecimal getOdds() {
        return odds;
    }

    public void setOdds(BigDecimal odds) {
        this.odds = odds;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}