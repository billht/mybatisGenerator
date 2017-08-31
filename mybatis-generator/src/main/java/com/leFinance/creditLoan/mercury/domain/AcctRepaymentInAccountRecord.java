package com.leFinance.creditLoan.mercury.domain;

import java.util.Date;

public class AcctRepaymentInAccountRecord {
    /**
     * <pre>
     * 自增主键
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.PID
     * </pre>
     * 
     */
    private Long pid;

    /**
     * <pre>
     * 业务链统一UUID
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.UUID
     * </pre>
     * 
     */
    private String uuid;

    /**
     * <pre>
     * 记录创建时间
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CREATION_TIME
     * </pre>
     * 
     */
    private Date creationTime;

    /**
     * <pre>
     * 账户ID
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.USER_ACCOUNT_ID
     * </pre>
     * 
     */
    private String userAccountId;

    /**
     * <pre>
     * 借款申请编号
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.LOAN_APPLY_NO
     * </pre>
     * 
     */
    private String loanApplyNo;

    /**
     * <pre>
     * 账务ID
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.ACCOUNTING_ID
     * </pre>
     * 
     */
    private String accountingId;

    /**
     * <pre>
     * 内部交易编号
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.IN_TRADE_NO
     * </pre>
     * 
     */
    private String inTradeNo;

    /**
     * <pre>
     * 还款申请号
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REPAYMENT_APPLY_NO
     * </pre>
     * 
     */
    private String repaymentApplyNo;

    /**
     * <pre>
     * 回款账户号
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.RECEIVABLE_ACCOUNT_NO
     * </pre>
     * 
     */
    private String receivableAccountNo;

    /**
     * <pre>
     * 账单编号
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.BOOKED_BILL_ID
     * </pre>
     * 
     */
    private String bookedBillId;

    /**
     * <pre>
     * 核心借款（发放）号
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.DD_NO
     * </pre>
     * 
     */
    private String ddNo;

    /**
     * <pre>
     * 核心贷款号
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.LOAN_NO
     * </pre>
     * 
     */
    private String loanNo;

    /**
     * <pre>
     * 交易参考号
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REFERENCE
     * </pre>
     * 
     */
    private String reference;

    /**
     * <pre>
     * 还款状态（0-已申请、1-还款处理中、2-还款成功、3-还款失败、4-入账成功、5-入账失败）
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REPAYMENT_STATUS
     * </pre>
     * 
     */
    private Integer repaymentStatus;

    /**
     * <pre>
     * 回调编号
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_NO
     * </pre>
     * 
     */
    private String callbackNo;

    /**
     * <pre>
     * 回调时间
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALL_BACK_TIME
     * </pre>
     * 
     */
    private Date callBackTime;

    /**
     * <pre>
     * 回调超时Java时间戳
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_OVERTIME
     * </pre>
     * 
     */
    private Long callbackOvertime;

    /**
     * <pre>
     * 调用入账接口返回消息
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.MESSAGE
     * </pre>
     * 
     */
    private String message;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.PID
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.PID
     *
     * @mbggenerated
     */
    public Long getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.PID
     *
     * @param pid the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.PID
     *
     * @mbggenerated
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.UUID
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.UUID
     *
     * @mbggenerated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.UUID
     *
     * @param uuid the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.UUID
     *
     * @mbggenerated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CREATION_TIME
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CREATION_TIME
     *
     * @mbggenerated
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CREATION_TIME
     *
     * @param creationTime the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CREATION_TIME
     *
     * @mbggenerated
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.USER_ACCOUNT_ID
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.USER_ACCOUNT_ID
     *
     * @mbggenerated
     */
    public String getUserAccountId() {
        return userAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.USER_ACCOUNT_ID
     *
     * @param userAccountId the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.USER_ACCOUNT_ID
     *
     * @mbggenerated
     */
    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId == null ? null : userAccountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.LOAN_APPLY_NO
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.LOAN_APPLY_NO
     *
     * @mbggenerated
     */
    public String getLoanApplyNo() {
        return loanApplyNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.LOAN_APPLY_NO
     *
     * @param loanApplyNo the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.LOAN_APPLY_NO
     *
     * @mbggenerated
     */
    public void setLoanApplyNo(String loanApplyNo) {
        this.loanApplyNo = loanApplyNo == null ? null : loanApplyNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.ACCOUNTING_ID
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.ACCOUNTING_ID
     *
     * @mbggenerated
     */
    public String getAccountingId() {
        return accountingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.ACCOUNTING_ID
     *
     * @param accountingId the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.ACCOUNTING_ID
     *
     * @mbggenerated
     */
    public void setAccountingId(String accountingId) {
        this.accountingId = accountingId == null ? null : accountingId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.IN_TRADE_NO
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.IN_TRADE_NO
     *
     * @mbggenerated
     */
    public String getInTradeNo() {
        return inTradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.IN_TRADE_NO
     *
     * @param inTradeNo the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.IN_TRADE_NO
     *
     * @mbggenerated
     */
    public void setInTradeNo(String inTradeNo) {
        this.inTradeNo = inTradeNo == null ? null : inTradeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REPAYMENT_APPLY_NO
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REPAYMENT_APPLY_NO
     *
     * @mbggenerated
     */
    public String getRepaymentApplyNo() {
        return repaymentApplyNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REPAYMENT_APPLY_NO
     *
     * @param repaymentApplyNo the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REPAYMENT_APPLY_NO
     *
     * @mbggenerated
     */
    public void setRepaymentApplyNo(String repaymentApplyNo) {
        this.repaymentApplyNo = repaymentApplyNo == null ? null : repaymentApplyNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.RECEIVABLE_ACCOUNT_NO
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.RECEIVABLE_ACCOUNT_NO
     *
     * @mbggenerated
     */
    public String getReceivableAccountNo() {
        return receivableAccountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.RECEIVABLE_ACCOUNT_NO
     *
     * @param receivableAccountNo the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.RECEIVABLE_ACCOUNT_NO
     *
     * @mbggenerated
     */
    public void setReceivableAccountNo(String receivableAccountNo) {
        this.receivableAccountNo = receivableAccountNo == null ? null : receivableAccountNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.BOOKED_BILL_ID
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.BOOKED_BILL_ID
     *
     * @mbggenerated
     */
    public String getBookedBillId() {
        return bookedBillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.BOOKED_BILL_ID
     *
     * @param bookedBillId the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.BOOKED_BILL_ID
     *
     * @mbggenerated
     */
    public void setBookedBillId(String bookedBillId) {
        this.bookedBillId = bookedBillId == null ? null : bookedBillId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.DD_NO
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.DD_NO
     *
     * @mbggenerated
     */
    public String getDdNo() {
        return ddNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.DD_NO
     *
     * @param ddNo the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.DD_NO
     *
     * @mbggenerated
     */
    public void setDdNo(String ddNo) {
        this.ddNo = ddNo == null ? null : ddNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.LOAN_NO
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.LOAN_NO
     *
     * @mbggenerated
     */
    public String getLoanNo() {
        return loanNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.LOAN_NO
     *
     * @param loanNo the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.LOAN_NO
     *
     * @mbggenerated
     */
    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REFERENCE
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REFERENCE
     *
     * @mbggenerated
     */
    public String getReference() {
        return reference;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REFERENCE
     *
     * @param reference the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REFERENCE
     *
     * @mbggenerated
     */
    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REPAYMENT_STATUS
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REPAYMENT_STATUS
     *
     * @mbggenerated
     */
    public Integer getRepaymentStatus() {
        return repaymentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REPAYMENT_STATUS
     *
     * @param repaymentStatus the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REPAYMENT_STATUS
     *
     * @mbggenerated
     */
    public void setRepaymentStatus(Integer repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_NO
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_NO
     *
     * @mbggenerated
     */
    public String getCallbackNo() {
        return callbackNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_NO
     *
     * @param callbackNo the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_NO
     *
     * @mbggenerated
     */
    public void setCallbackNo(String callbackNo) {
        this.callbackNo = callbackNo == null ? null : callbackNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALL_BACK_TIME
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALL_BACK_TIME
     *
     * @mbggenerated
     */
    public Date getCallBackTime() {
        return callBackTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALL_BACK_TIME
     *
     * @param callBackTime the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALL_BACK_TIME
     *
     * @mbggenerated
     */
    public void setCallBackTime(Date callBackTime) {
        this.callBackTime = callBackTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_OVERTIME
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_OVERTIME
     *
     * @mbggenerated
     */
    public Long getCallbackOvertime() {
        return callbackOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_OVERTIME
     *
     * @param callbackOvertime the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_OVERTIME
     *
     * @mbggenerated
     */
    public void setCallbackOvertime(Long callbackOvertime) {
        this.callbackOvertime = callbackOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.MESSAGE
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.MESSAGE
     *
     * @mbggenerated
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.MESSAGE
     *
     * @param message the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.MESSAGE
     *
     * @mbggenerated
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}