package com.smx.model;

import java.io.Serializable;

public class T_Recruit implements Serializable {//招聘信息类
    private Integer r_id;
    private String r_companyName;
    private String r_companyAddress;
    private String r_companyProfile;//公司简介
    private String r_fringeBenefits;//福利待遇
    private Integer r_salary;
    private String r_department;
    private String r_position;//职位
    private String r_requirements;//岗位要求

    public String getR_department() {
        return r_department;
    }

    public void setR_department(String r_department) {
        this.r_department = r_department;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public String getR_companyName() {
        return r_companyName;
    }

    public void setR_companyName(String r_companyName) {
        this.r_companyName = r_companyName;
    }

    public String getR_companyAddress() {
        return r_companyAddress;
    }

    public void setR_companyAddress(String r_companyAddress) {
        this.r_companyAddress = r_companyAddress;
    }

    public String getR_companyProfile() {
        return r_companyProfile;
    }

    public void setR_companyProfile(String r_companyProfile) {
        this.r_companyProfile = r_companyProfile;
    }

    public String getR_fringeBenefits() {
        return r_fringeBenefits;
    }

    public void setR_fringeBenefits(String r_fringeBenefits) {
        this.r_fringeBenefits = r_fringeBenefits;
    }

    public Integer getR_salary() {
        return r_salary;
    }

    public void setR_salary(Integer r_salary) {
        this.r_salary = r_salary;
    }

    public String getR_position() {
        return r_position;
    }

    public void setR_position(String r_position) {
        this.r_position = r_position;
    }

    public String getR_requirements() {
        return r_requirements;
    }

    public void setR_requirements(String r_requirements) {
        this.r_requirements = r_requirements;
    }

    @Override
    public String toString() {
        return "T_Recruit{" +
                "r_id=" + r_id +
                ", r_companyName='" + r_companyName + '\'' +
                ", r_companyAddress='" + r_companyAddress + '\'' +
                ", r_companyProfile='" + r_companyProfile + '\'' +
                ", r_fringeBenefits='" + r_fringeBenefits + '\'' +
                ", r_salary=" + r_salary +
                ", r_department='" + r_department + '\'' +
                ", r_position='" + r_position + '\'' +
                ", r_requirements='" + r_requirements + '\'' +
                '}';
    }
}
