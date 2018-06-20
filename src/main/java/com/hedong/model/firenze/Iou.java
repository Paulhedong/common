package com.hedong.model.firenze;

import java.math.BigDecimal;
import java.util.Date;

public class Iou {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.iou_id
     *
     * @mbggenerated
     */
    private String iouId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.currency
     *
     * @mbggenerated
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.amount
     *
     * @mbggenerated
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.raise_closing_date
     *
     * @mbggenerated
     */
    private Date raiseClosingDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.promise_repay_date
     *
     * @mbggenerated
     */
    private Date promiseRepayDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.promise_repay_term
     *
     * @mbggenerated
     */
    private Integer promiseRepayTerm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.promise_repay_interest
     *
     * @mbggenerated
     */
    private BigDecimal promiseRepayInterest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.release_address
     *
     * @mbggenerated
     */
    private String releaseAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.loan_usage
     *
     * @mbggenerated
     */
    private String loanUsage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.payment_type
     *
     * @mbggenerated
     */
    private Byte paymentType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.repayment_type
     *
     * @mbggenerated
     */
    private Byte repaymentType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.loan_rate
     *
     * @mbggenerated
     */
    private BigDecimal loanRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.borrower_id
     *
     * @mbggenerated
     */
    private String borrowerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.lender_id
     *
     * @mbggenerated
     */
    private String lenderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.actual_payment_way
     *
     * @mbggenerated
     */
    private Byte actualPaymentWay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.actual_repayment_way
     *
     * @mbggenerated
     */
    private Byte actualRepaymentWay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.prefer_payment_way
     *
     * @mbggenerated
     */
    private Byte preferPaymentWay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.prefer_payment_account
     *
     * @mbggenerated
     */
    private String preferPaymentAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.prefer_payment_remark
     *
     * @mbggenerated
     */
    private String preferPaymentRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.assign_user
     *
     * @mbggenerated
     */
    private Byte assignUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.type
     *
     * @mbggenerated
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.overdue_status
     *
     * @mbggenerated
     */
    private Byte overdueStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.appeal_status
     *
     * @mbggenerated
     */
    private Byte appealStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.pay_time
     *
     * @mbggenerated
     */
    private Date payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.pay_confirm_time
     *
     * @mbggenerated
     */
    private Date payConfirmTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.repay_time
     *
     * @mbggenerated
     */
    private Date repayTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.repay_confirm_time
     *
     * @mbggenerated
     */
    private Date repayConfirmTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.payment_contract
     *
     * @mbggenerated
     */
    private String paymentContract;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.repayment_receipt
     *
     * @mbggenerated
     */
    private String repaymentReceipt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.tx_pay_hash
     *
     * @mbggenerated
     */
    private String txPayHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.tx_pay_block_num
     *
     * @mbggenerated
     */
    private Integer txPayBlockNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.tx_repay_hash
     *
     * @mbggenerated
     */
    private String txRepayHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.tx_repay_block_num
     *
     * @mbggenerated
     */
    private Integer txRepayBlockNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.ctime
     *
     * @mbggenerated
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iou.utime
     *
     * @mbggenerated
     */
    private Date utime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.id
     *
     * @return the value of iou.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.id
     *
     * @param id the value for iou.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.iou_id
     *
     * @return the value of iou.iou_id
     *
     * @mbggenerated
     */
    public String getIouId() {
        return iouId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.iou_id
     *
     * @param iouId the value for iou.iou_id
     *
     * @mbggenerated
     */
    public void setIouId(String iouId) {
        this.iouId = iouId == null ? null : iouId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.currency
     *
     * @return the value of iou.currency
     *
     * @mbggenerated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.currency
     *
     * @param currency the value for iou.currency
     *
     * @mbggenerated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.amount
     *
     * @return the value of iou.amount
     *
     * @mbggenerated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.amount
     *
     * @param amount the value for iou.amount
     *
     * @mbggenerated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.raise_closing_date
     *
     * @return the value of iou.raise_closing_date
     *
     * @mbggenerated
     */
    public Date getRaiseClosingDate() {
        return raiseClosingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.raise_closing_date
     *
     * @param raiseClosingDate the value for iou.raise_closing_date
     *
     * @mbggenerated
     */
    public void setRaiseClosingDate(Date raiseClosingDate) {
        this.raiseClosingDate = raiseClosingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.promise_repay_date
     *
     * @return the value of iou.promise_repay_date
     *
     * @mbggenerated
     */
    public Date getPromiseRepayDate() {
        return promiseRepayDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.promise_repay_date
     *
     * @param promiseRepayDate the value for iou.promise_repay_date
     *
     * @mbggenerated
     */
    public void setPromiseRepayDate(Date promiseRepayDate) {
        this.promiseRepayDate = promiseRepayDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.promise_repay_term
     *
     * @return the value of iou.promise_repay_term
     *
     * @mbggenerated
     */
    public Integer getPromiseRepayTerm() {
        return promiseRepayTerm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.promise_repay_term
     *
     * @param promiseRepayTerm the value for iou.promise_repay_term
     *
     * @mbggenerated
     */
    public void setPromiseRepayTerm(Integer promiseRepayTerm) {
        this.promiseRepayTerm = promiseRepayTerm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.promise_repay_interest
     *
     * @return the value of iou.promise_repay_interest
     *
     * @mbggenerated
     */
    public BigDecimal getPromiseRepayInterest() {
        return promiseRepayInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.promise_repay_interest
     *
     * @param promiseRepayInterest the value for iou.promise_repay_interest
     *
     * @mbggenerated
     */
    public void setPromiseRepayInterest(BigDecimal promiseRepayInterest) {
        this.promiseRepayInterest = promiseRepayInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.release_address
     *
     * @return the value of iou.release_address
     *
     * @mbggenerated
     */
    public String getReleaseAddress() {
        return releaseAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.release_address
     *
     * @param releaseAddress the value for iou.release_address
     *
     * @mbggenerated
     */
    public void setReleaseAddress(String releaseAddress) {
        this.releaseAddress = releaseAddress == null ? null : releaseAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.loan_usage
     *
     * @return the value of iou.loan_usage
     *
     * @mbggenerated
     */
    public String getLoanUsage() {
        return loanUsage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.loan_usage
     *
     * @param loanUsage the value for iou.loan_usage
     *
     * @mbggenerated
     */
    public void setLoanUsage(String loanUsage) {
        this.loanUsage = loanUsage == null ? null : loanUsage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.payment_type
     *
     * @return the value of iou.payment_type
     *
     * @mbggenerated
     */
    public Byte getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.payment_type
     *
     * @param paymentType the value for iou.payment_type
     *
     * @mbggenerated
     */
    public void setPaymentType(Byte paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.repayment_type
     *
     * @return the value of iou.repayment_type
     *
     * @mbggenerated
     */
    public Byte getRepaymentType() {
        return repaymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.repayment_type
     *
     * @param repaymentType the value for iou.repayment_type
     *
     * @mbggenerated
     */
    public void setRepaymentType(Byte repaymentType) {
        this.repaymentType = repaymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.loan_rate
     *
     * @return the value of iou.loan_rate
     *
     * @mbggenerated
     */
    public BigDecimal getLoanRate() {
        return loanRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.loan_rate
     *
     * @param loanRate the value for iou.loan_rate
     *
     * @mbggenerated
     */
    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.borrower_id
     *
     * @return the value of iou.borrower_id
     *
     * @mbggenerated
     */
    public String getBorrowerId() {
        return borrowerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.borrower_id
     *
     * @param borrowerId the value for iou.borrower_id
     *
     * @mbggenerated
     */
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId == null ? null : borrowerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.lender_id
     *
     * @return the value of iou.lender_id
     *
     * @mbggenerated
     */
    public String getLenderId() {
        return lenderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.lender_id
     *
     * @param lenderId the value for iou.lender_id
     *
     * @mbggenerated
     */
    public void setLenderId(String lenderId) {
        this.lenderId = lenderId == null ? null : lenderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.remark
     *
     * @return the value of iou.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.remark
     *
     * @param remark the value for iou.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.actual_payment_way
     *
     * @return the value of iou.actual_payment_way
     *
     * @mbggenerated
     */
    public Byte getActualPaymentWay() {
        return actualPaymentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.actual_payment_way
     *
     * @param actualPaymentWay the value for iou.actual_payment_way
     *
     * @mbggenerated
     */
    public void setActualPaymentWay(Byte actualPaymentWay) {
        this.actualPaymentWay = actualPaymentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.actual_repayment_way
     *
     * @return the value of iou.actual_repayment_way
     *
     * @mbggenerated
     */
    public Byte getActualRepaymentWay() {
        return actualRepaymentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.actual_repayment_way
     *
     * @param actualRepaymentWay the value for iou.actual_repayment_way
     *
     * @mbggenerated
     */
    public void setActualRepaymentWay(Byte actualRepaymentWay) {
        this.actualRepaymentWay = actualRepaymentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.prefer_payment_way
     *
     * @return the value of iou.prefer_payment_way
     *
     * @mbggenerated
     */
    public Byte getPreferPaymentWay() {
        return preferPaymentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.prefer_payment_way
     *
     * @param preferPaymentWay the value for iou.prefer_payment_way
     *
     * @mbggenerated
     */
    public void setPreferPaymentWay(Byte preferPaymentWay) {
        this.preferPaymentWay = preferPaymentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.prefer_payment_account
     *
     * @return the value of iou.prefer_payment_account
     *
     * @mbggenerated
     */
    public String getPreferPaymentAccount() {
        return preferPaymentAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.prefer_payment_account
     *
     * @param preferPaymentAccount the value for iou.prefer_payment_account
     *
     * @mbggenerated
     */
    public void setPreferPaymentAccount(String preferPaymentAccount) {
        this.preferPaymentAccount = preferPaymentAccount == null ? null : preferPaymentAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.prefer_payment_remark
     *
     * @return the value of iou.prefer_payment_remark
     *
     * @mbggenerated
     */
    public String getPreferPaymentRemark() {
        return preferPaymentRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.prefer_payment_remark
     *
     * @param preferPaymentRemark the value for iou.prefer_payment_remark
     *
     * @mbggenerated
     */
    public void setPreferPaymentRemark(String preferPaymentRemark) {
        this.preferPaymentRemark = preferPaymentRemark == null ? null : preferPaymentRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.assign_user
     *
     * @return the value of iou.assign_user
     *
     * @mbggenerated
     */
    public Byte getAssignUser() {
        return assignUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.assign_user
     *
     * @param assignUser the value for iou.assign_user
     *
     * @mbggenerated
     */
    public void setAssignUser(Byte assignUser) {
        this.assignUser = assignUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.status
     *
     * @return the value of iou.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.status
     *
     * @param status the value for iou.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.type
     *
     * @return the value of iou.type
     *
     * @mbggenerated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.type
     *
     * @param type the value for iou.type
     *
     * @mbggenerated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.overdue_status
     *
     * @return the value of iou.overdue_status
     *
     * @mbggenerated
     */
    public Byte getOverdueStatus() {
        return overdueStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.overdue_status
     *
     * @param overdueStatus the value for iou.overdue_status
     *
     * @mbggenerated
     */
    public void setOverdueStatus(Byte overdueStatus) {
        this.overdueStatus = overdueStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.appeal_status
     *
     * @return the value of iou.appeal_status
     *
     * @mbggenerated
     */
    public Byte getAppealStatus() {
        return appealStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.appeal_status
     *
     * @param appealStatus the value for iou.appeal_status
     *
     * @mbggenerated
     */
    public void setAppealStatus(Byte appealStatus) {
        this.appealStatus = appealStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.pay_time
     *
     * @return the value of iou.pay_time
     *
     * @mbggenerated
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.pay_time
     *
     * @param payTime the value for iou.pay_time
     *
     * @mbggenerated
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.pay_confirm_time
     *
     * @return the value of iou.pay_confirm_time
     *
     * @mbggenerated
     */
    public Date getPayConfirmTime() {
        return payConfirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.pay_confirm_time
     *
     * @param payConfirmTime the value for iou.pay_confirm_time
     *
     * @mbggenerated
     */
    public void setPayConfirmTime(Date payConfirmTime) {
        this.payConfirmTime = payConfirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.repay_time
     *
     * @return the value of iou.repay_time
     *
     * @mbggenerated
     */
    public Date getRepayTime() {
        return repayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.repay_time
     *
     * @param repayTime the value for iou.repay_time
     *
     * @mbggenerated
     */
    public void setRepayTime(Date repayTime) {
        this.repayTime = repayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.repay_confirm_time
     *
     * @return the value of iou.repay_confirm_time
     *
     * @mbggenerated
     */
    public Date getRepayConfirmTime() {
        return repayConfirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.repay_confirm_time
     *
     * @param repayConfirmTime the value for iou.repay_confirm_time
     *
     * @mbggenerated
     */
    public void setRepayConfirmTime(Date repayConfirmTime) {
        this.repayConfirmTime = repayConfirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.payment_contract
     *
     * @return the value of iou.payment_contract
     *
     * @mbggenerated
     */
    public String getPaymentContract() {
        return paymentContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.payment_contract
     *
     * @param paymentContract the value for iou.payment_contract
     *
     * @mbggenerated
     */
    public void setPaymentContract(String paymentContract) {
        this.paymentContract = paymentContract == null ? null : paymentContract.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.repayment_receipt
     *
     * @return the value of iou.repayment_receipt
     *
     * @mbggenerated
     */
    public String getRepaymentReceipt() {
        return repaymentReceipt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.repayment_receipt
     *
     * @param repaymentReceipt the value for iou.repayment_receipt
     *
     * @mbggenerated
     */
    public void setRepaymentReceipt(String repaymentReceipt) {
        this.repaymentReceipt = repaymentReceipt == null ? null : repaymentReceipt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.tx_pay_hash
     *
     * @return the value of iou.tx_pay_hash
     *
     * @mbggenerated
     */
    public String getTxPayHash() {
        return txPayHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.tx_pay_hash
     *
     * @param txPayHash the value for iou.tx_pay_hash
     *
     * @mbggenerated
     */
    public void setTxPayHash(String txPayHash) {
        this.txPayHash = txPayHash == null ? null : txPayHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.tx_pay_block_num
     *
     * @return the value of iou.tx_pay_block_num
     *
     * @mbggenerated
     */
    public Integer getTxPayBlockNum() {
        return txPayBlockNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.tx_pay_block_num
     *
     * @param txPayBlockNum the value for iou.tx_pay_block_num
     *
     * @mbggenerated
     */
    public void setTxPayBlockNum(Integer txPayBlockNum) {
        this.txPayBlockNum = txPayBlockNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.tx_repay_hash
     *
     * @return the value of iou.tx_repay_hash
     *
     * @mbggenerated
     */
    public String getTxRepayHash() {
        return txRepayHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.tx_repay_hash
     *
     * @param txRepayHash the value for iou.tx_repay_hash
     *
     * @mbggenerated
     */
    public void setTxRepayHash(String txRepayHash) {
        this.txRepayHash = txRepayHash == null ? null : txRepayHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.tx_repay_block_num
     *
     * @return the value of iou.tx_repay_block_num
     *
     * @mbggenerated
     */
    public Integer getTxRepayBlockNum() {
        return txRepayBlockNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.tx_repay_block_num
     *
     * @param txRepayBlockNum the value for iou.tx_repay_block_num
     *
     * @mbggenerated
     */
    public void setTxRepayBlockNum(Integer txRepayBlockNum) {
        this.txRepayBlockNum = txRepayBlockNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.ctime
     *
     * @return the value of iou.ctime
     *
     * @mbggenerated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.ctime
     *
     * @param ctime the value for iou.ctime
     *
     * @mbggenerated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iou.utime
     *
     * @return the value of iou.utime
     *
     * @mbggenerated
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iou.utime
     *
     * @param utime the value for iou.utime
     *
     * @mbggenerated
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }
}