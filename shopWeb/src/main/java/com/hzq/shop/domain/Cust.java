package com.hzq.shop.domain;

import java.util.Date;

public class Cust {
    private Long custDetailId;

    private String custSstatus;

    private String custPassMsg;

    private String custPassMsgAnswer;

    private String custEmail;

    private String custTrueName;

    private String custIdentity;

    private String custTel;

    private String custSex;

    private Long addrId;

    private String postCode;

    private Integer vipLever;

    private String loginName;

    private String loginPass;

    private String custRole;

    private Date registerDate;

    private Date lastLoginDate;

    private String isActivity;

    public Long getCustDetailId() {
        return custDetailId;
    }

    public void setCustDetailId(Long custDetailId) {
        this.custDetailId = custDetailId;
    }

    public String getCustSstatus() {
        return custSstatus;
    }

    public void setCustSstatus(String custSstatus) {
        this.custSstatus = custSstatus == null ? null : custSstatus.trim();
    }

    public String getCustPassMsg() {
        return custPassMsg;
    }

    public void setCustPassMsg(String custPassMsg) {
        this.custPassMsg = custPassMsg == null ? null : custPassMsg.trim();
    }

    public String getCustPassMsgAnswer() {
        return custPassMsgAnswer;
    }

    public void setCustPassMsgAnswer(String custPassMsgAnswer) {
        this.custPassMsgAnswer = custPassMsgAnswer == null ? null : custPassMsgAnswer.trim();
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail == null ? null : custEmail.trim();
    }

    public String getCustTrueName() {
        return custTrueName;
    }

    public void setCustTrueName(String custTrueName) {
        this.custTrueName = custTrueName == null ? null : custTrueName.trim();
    }

    public String getCustIdentity() {
        return custIdentity;
    }

    public void setCustIdentity(String custIdentity) {
        this.custIdentity = custIdentity == null ? null : custIdentity.trim();
    }

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel == null ? null : custTel.trim();
    }

    public String getCustSex() {
        return custSex;
    }

    public void setCustSex(String custSex) {
        this.custSex = custSex == null ? null : custSex.trim();
    }

    public Long getAddrId() {
        return addrId;
    }

    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public Integer getVipLever() {
        return vipLever;
    }

    public void setVipLever(Integer vipLever) {
        this.vipLever = vipLever;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass == null ? null : loginPass.trim();
    }

    public String getCustRole() {
        return custRole;
    }

    public void setCustRole(String custRole) {
        this.custRole = custRole == null ? null : custRole.trim();
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getIsActivity() {
        return isActivity;
    }

    public void setIsActivity(String isActivity) {
        this.isActivity = isActivity == null ? null : isActivity.trim();
    }
}