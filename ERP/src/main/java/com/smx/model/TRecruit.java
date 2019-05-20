package com.smx.model;

import java.io.Serializable;

public class TRecruit implements Serializable {//招聘信息类
    private Integer rid;
    private String rCompanyName;
    private String rCompanyAddress;
    private String rCompanyProfile;//公司简介
    private String rFringeBenefits;//福利待遇
    private Integer rSalary;
    private String rDepartment;
    private String rPosition;//职位
    private String rRequirements;//岗位要求
    private Integer rState;

    public TRecruit() {
    }

    public Integer getrState() {
        return rState;
    }

    public void setrState(Integer rState) {
        this.rState = rState;
    }

    public String getrDepartment() {
        return rDepartment;
    }

    public void setrDepartment(String rDepartment) {
        this.rDepartment = rDepartment;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getrCompanyName() {
        return rCompanyName;
    }

    public void setrCompanyName(String rCompanyName) {
        this.rCompanyName = rCompanyName;
    }

    public String getrCompanyAddress() {
        return rCompanyAddress;
    }

    public void setrCompanyAddress(String rCompanyAddress) {
        this.rCompanyAddress = rCompanyAddress;
    }

    public String getrCompanyProfile() {
        return rCompanyProfile;
    }

    public void setrCompanyProfile(String rCompanyProfile) {
        this.rCompanyProfile = rCompanyProfile;
    }

    public String getrFringeBenefits() {
        return rFringeBenefits;
    }

    public void setrFringeBenefits(String rFringeBenefits) {
        this.rFringeBenefits = rFringeBenefits;
    }

    public Integer getrSalary() {
        return rSalary;
    }

    public void setrSalary(Integer rSalary) {
        this.rSalary = rSalary;
    }

    public String getrPosition() {
        return rPosition;
    }

    public void setrPosition(String rPosition) {
        this.rPosition = rPosition;
    }

    public String getrRequirements() {
        return rRequirements;
    }

    public void setrRequirements(String rRequirements) {
        this.rRequirements = rRequirements;
    }

    @Override
    public String toString() {
        return "TRecruit{" +
                "rid=" + rid +
                ", rCompanyName='" + rCompanyName + '\'' +
                ", rCompanyAddress='" + rCompanyAddress + '\'' +
                ", rCompanyProfile='" + rCompanyProfile + '\'' +
                ", rFringeBenefits='" + rFringeBenefits + '\'' +
                ", rSalary=" + rSalary +
                ", rDepartment='" + rDepartment + '\'' +
                ", rPosition='" + rPosition + '\'' +
                ", rRequirements='" + rRequirements + '\'' +
                ", rState=" + rState +
                '}';
    }
}
