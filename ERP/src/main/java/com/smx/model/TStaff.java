package com.smx.model;

import java.io.Serializable;
import java.util.Date;

public class TStaff implements Serializable {
    private Integer sId;
    private String sName;
    private String sPass;
    private String sSex;
    private String sPhone;
    private String sEmail;
    private String sBankCard;
    private String sDate;
    private Integer sState;
    private String sDepartment;
    private String sPosition;
    private Double sMoney;

    public TStaff() {
    }

    public Double getsMoney() {
        return sMoney;
    }

    public void setsMoney(Double sMoney) {
        this.sMoney = sMoney;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPass() {
        return sPass;
    }

    public void setsPass(String sPass) {
        this.sPass = sPass;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsBankCard() {
        return sBankCard;
    }

    public void setsBankCard(String sBankCard) {
        this.sBankCard = sBankCard;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public Integer getsState() {
        return sState;
    }

    public void setsState(Integer sState) {
        this.sState = sState;
    }

    public String getsDepartment() {
        return sDepartment;
    }

    public void setsDepartment(String sDepartment) {
        this.sDepartment = sDepartment;
    }

    public String getsPosition() {
        return sPosition;
    }

    public void setsPosition(String sPosition) {
        this.sPosition = sPosition;
    }

    @Override
    public String toString() {
        return "TStaff{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sPass='" + sPass + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sPhone='" + sPhone + '\'' +
                ", sEmail='" + sEmail + '\'' +
                ", sBankCard='" + sBankCard + '\'' +
                ", sDate='" + sDate + '\'' +
                ", sState=" + sState +
                ", sDepartment='" + sDepartment + '\'' +
                ", sPosition='" + sPosition + '\'' +
                ", sMoney=" + sMoney +
                '}';
    }
}
