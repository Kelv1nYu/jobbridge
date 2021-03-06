package com.galigaigai.jobbridge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by SYunk on 2018/3/13.
 * 公司类
 */
@Entity
public class Company {
    @Id
    @GeneratedValue
    private Long companyId;

    private String userName;
    private String name;
    private String mailbox;
    private String phoneNum;
    private String password;
    private String companyIntroduction;
    private String iconAddress;
    private Integer industryId;
    private String identity;
    private Boolean auditing;

    public Company(){

    }

    public Company(String userName, String name, String mailbox, String phoneNum, String password, String companyIntroduction, String iconAddress, Integer industryId, String identity, Boolean auditing) {
        this.userName = userName;
        this.name = name;
        this.mailbox = mailbox;
        this.phoneNum = phoneNum;
        this.password = password;
        this.companyIntroduction = companyIntroduction;
        this.iconAddress = iconAddress;
        this.industryId = industryId;
        this.identity = identity;
        this.auditing = auditing;
    }

    public Long getCompanyId() {
        return companyId;
    }
    public Boolean getAuditing() {
        return auditing;
    }
    public String getUserName() {
        return userName;
    }
    public String getName() {
        return name;
    }
    public String getMailbox() {
        return mailbox;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public String getPassword() {
        return password;
    }
    public String getCompanyIntroduction() {
        return companyIntroduction;
    }
    public String getIconAddress() {
        return iconAddress;
    }
    public Integer getIndustryId() {
        return industryId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    public void setAuditing(Boolean auditing) {
        this.auditing = auditing;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCompanyIntroduction(String companyIntroduction) {
        this.companyIntroduction = companyIntroduction;
    }
    public void setIconAddress(String iconAddress) {
        this.iconAddress = iconAddress;
    }
    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }
    public String getIdentity() {
        return identity;
    }
    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
