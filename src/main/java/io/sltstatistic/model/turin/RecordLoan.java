package io.sltstatistic.model.turin;

import java.math.BigDecimal;
import java.util.Date;

public class RecordLoan {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.borrower_id
     *
     * @mbggenerated
     */
    private String borrowerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.borrower_address
     *
     * @mbggenerated
     */
    private String borrowerAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.lender_id
     *
     * @mbggenerated
     */
    private String lenderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.lender_address
     *
     * @mbggenerated
     */
    private String lenderAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.fee_rate
     *
     * @mbggenerated
     */
    private BigDecimal feeRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.fee
     *
     * @mbggenerated
     */
    private BigDecimal fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.interest_rate
     *
     * @mbggenerated
     */
    private BigDecimal interestRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.interest
     *
     * @mbggenerated
     */
    private BigDecimal interest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.pledge_unit_price
     *
     * @mbggenerated
     */
    private BigDecimal pledgeUnitPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.gas_used
     *
     * @mbggenerated
     */
    private Long gasUsed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.loan_amount
     *
     * @mbggenerated
     */
    private BigDecimal loanAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.due_time
     *
     * @mbggenerated
     */
    private Date dueTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.net_amount
     *
     * @mbggenerated
     */
    private BigDecimal netAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.payable_amount
     *
     * @mbggenerated
     */
    private BigDecimal payableAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.loan_status
     *
     * @mbggenerated
     */
    private Byte loanStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.final_time
     *
     * @mbggenerated
     */
    private Date finalTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.loan_days
     *
     * @mbggenerated
     */
    private Integer loanDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.loan_scene
     *
     * @mbggenerated
     */
    private String loanScene;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.loan_no
     *
     * @mbggenerated
     */
    private String loanNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.ctime
     *
     * @mbggenerated
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.utime
     *
     * @mbggenerated
     */
    private Date utime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record_loan.loan_id
     *
     * @mbggenerated
     */
    private String loanId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.id
     *
     * @return the value of record_loan.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.id
     *
     * @param id the value for record_loan.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.borrower_id
     *
     * @return the value of record_loan.borrower_id
     *
     * @mbggenerated
     */
    public String getBorrowerId() {
        return borrowerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.borrower_id
     *
     * @param borrowerId the value for record_loan.borrower_id
     *
     * @mbggenerated
     */
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId == null ? null : borrowerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.borrower_address
     *
     * @return the value of record_loan.borrower_address
     *
     * @mbggenerated
     */
    public String getBorrowerAddress() {
        return borrowerAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.borrower_address
     *
     * @param borrowerAddress the value for record_loan.borrower_address
     *
     * @mbggenerated
     */
    public void setBorrowerAddress(String borrowerAddress) {
        this.borrowerAddress = borrowerAddress == null ? null : borrowerAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.lender_id
     *
     * @return the value of record_loan.lender_id
     *
     * @mbggenerated
     */
    public String getLenderId() {
        return lenderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.lender_id
     *
     * @param lenderId the value for record_loan.lender_id
     *
     * @mbggenerated
     */
    public void setLenderId(String lenderId) {
        this.lenderId = lenderId == null ? null : lenderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.lender_address
     *
     * @return the value of record_loan.lender_address
     *
     * @mbggenerated
     */
    public String getLenderAddress() {
        return lenderAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.lender_address
     *
     * @param lenderAddress the value for record_loan.lender_address
     *
     * @mbggenerated
     */
    public void setLenderAddress(String lenderAddress) {
        this.lenderAddress = lenderAddress == null ? null : lenderAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.fee_rate
     *
     * @return the value of record_loan.fee_rate
     *
     * @mbggenerated
     */
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.fee_rate
     *
     * @param feeRate the value for record_loan.fee_rate
     *
     * @mbggenerated
     */
    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.fee
     *
     * @return the value of record_loan.fee
     *
     * @mbggenerated
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.fee
     *
     * @param fee the value for record_loan.fee
     *
     * @mbggenerated
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.interest_rate
     *
     * @return the value of record_loan.interest_rate
     *
     * @mbggenerated
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.interest_rate
     *
     * @param interestRate the value for record_loan.interest_rate
     *
     * @mbggenerated
     */
    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.interest
     *
     * @return the value of record_loan.interest
     *
     * @mbggenerated
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.interest
     *
     * @param interest the value for record_loan.interest
     *
     * @mbggenerated
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.pledge_unit_price
     *
     * @return the value of record_loan.pledge_unit_price
     *
     * @mbggenerated
     */
    public BigDecimal getPledgeUnitPrice() {
        return pledgeUnitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.pledge_unit_price
     *
     * @param pledgeUnitPrice the value for record_loan.pledge_unit_price
     *
     * @mbggenerated
     */
    public void setPledgeUnitPrice(BigDecimal pledgeUnitPrice) {
        this.pledgeUnitPrice = pledgeUnitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.gas_used
     *
     * @return the value of record_loan.gas_used
     *
     * @mbggenerated
     */
    public Long getGasUsed() {
        return gasUsed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.gas_used
     *
     * @param gasUsed the value for record_loan.gas_used
     *
     * @mbggenerated
     */
    public void setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.loan_amount
     *
     * @return the value of record_loan.loan_amount
     *
     * @mbggenerated
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.loan_amount
     *
     * @param loanAmount the value for record_loan.loan_amount
     *
     * @mbggenerated
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.due_time
     *
     * @return the value of record_loan.due_time
     *
     * @mbggenerated
     */
    public Date getDueTime() {
        return dueTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.due_time
     *
     * @param dueTime the value for record_loan.due_time
     *
     * @mbggenerated
     */
    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.net_amount
     *
     * @return the value of record_loan.net_amount
     *
     * @mbggenerated
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.net_amount
     *
     * @param netAmount the value for record_loan.net_amount
     *
     * @mbggenerated
     */
    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.payable_amount
     *
     * @return the value of record_loan.payable_amount
     *
     * @mbggenerated
     */
    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.payable_amount
     *
     * @param payableAmount the value for record_loan.payable_amount
     *
     * @mbggenerated
     */
    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.loan_status
     *
     * @return the value of record_loan.loan_status
     *
     * @mbggenerated
     */
    public Byte getLoanStatus() {
        return loanStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.loan_status
     *
     * @param loanStatus the value for record_loan.loan_status
     *
     * @mbggenerated
     */
    public void setLoanStatus(Byte loanStatus) {
        this.loanStatus = loanStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.final_time
     *
     * @return the value of record_loan.final_time
     *
     * @mbggenerated
     */
    public Date getFinalTime() {
        return finalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.final_time
     *
     * @param finalTime the value for record_loan.final_time
     *
     * @mbggenerated
     */
    public void setFinalTime(Date finalTime) {
        this.finalTime = finalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.loan_days
     *
     * @return the value of record_loan.loan_days
     *
     * @mbggenerated
     */
    public Integer getLoanDays() {
        return loanDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.loan_days
     *
     * @param loanDays the value for record_loan.loan_days
     *
     * @mbggenerated
     */
    public void setLoanDays(Integer loanDays) {
        this.loanDays = loanDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.loan_scene
     *
     * @return the value of record_loan.loan_scene
     *
     * @mbggenerated
     */
    public String getLoanScene() {
        return loanScene;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.loan_scene
     *
     * @param loanScene the value for record_loan.loan_scene
     *
     * @mbggenerated
     */
    public void setLoanScene(String loanScene) {
        this.loanScene = loanScene == null ? null : loanScene.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.loan_no
     *
     * @return the value of record_loan.loan_no
     *
     * @mbggenerated
     */
    public String getLoanNo() {
        return loanNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.loan_no
     *
     * @param loanNo the value for record_loan.loan_no
     *
     * @mbggenerated
     */
    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.ctime
     *
     * @return the value of record_loan.ctime
     *
     * @mbggenerated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.ctime
     *
     * @param ctime the value for record_loan.ctime
     *
     * @mbggenerated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.utime
     *
     * @return the value of record_loan.utime
     *
     * @mbggenerated
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.utime
     *
     * @param utime the value for record_loan.utime
     *
     * @mbggenerated
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record_loan.loan_id
     *
     * @return the value of record_loan.loan_id
     *
     * @mbggenerated
     */
    public String getLoanId() {
        return loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record_loan.loan_id
     *
     * @param loanId the value for record_loan.loan_id
     *
     * @mbggenerated
     */
    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }
}