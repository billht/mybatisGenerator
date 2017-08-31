package com.leFinance.creditLoan.mercury.domain;

public class AcctRepaymentInAccountRecordWithBLOBs extends AcctRepaymentInAccountRecord {
    /**
     * <pre>
     * 请求交易平台参数转Json串
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REQ_JSON
     * </pre>
     * 
     */
    private String reqJson;

    /**
     * <pre>
     * 交易平台回调参数Json串
     * 表字段： ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_JSON
     * </pre>
     * 
     */
    private String callbackJson;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REQ_JSON
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REQ_JSON
     *
     * @mbggenerated
     */
    public String getReqJson() {
        return reqJson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REQ_JSON
     *
     * @param reqJson the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.REQ_JSON
     *
     * @mbggenerated
     */
    public void setReqJson(String reqJson) {
        this.reqJson = reqJson == null ? null : reqJson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_JSON
     *
     * @return the value of ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_JSON
     *
     * @mbggenerated
     */
    public String getCallbackJson() {
        return callbackJson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_JSON
     *
     * @param callbackJson the value for ACCT_REPAYMENT_IN_ACCOUNT_RECORD.CALLBACK_JSON
     *
     * @mbggenerated
     */
    public void setCallbackJson(String callbackJson) {
        this.callbackJson = callbackJson == null ? null : callbackJson.trim();
    }
}