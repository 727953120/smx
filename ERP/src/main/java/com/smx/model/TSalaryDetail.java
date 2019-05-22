package com.smx.model;

import java.io.Serializable;

public class TSalaryDetail implements Serializable {
    private Integer salaryId;
    private Integer salaryBase;
    private Integer salaryAchievements;
    private Integer salaryOverTime;
    private Integer salaryRecordMoney;
    private Integer salarySocialSecurity;
    private Double salaryAll;
    private Integer sId;
    private String date;

    public TSalaryDetail() {
    }

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public Integer getSalaryBase() {
        return salaryBase;
    }

    public void setSalaryBase(Integer salaryBase) {
        this.salaryBase = salaryBase;
    }

    public Integer getSalaryAchievements() {
        return salaryAchievements;
    }

    public void setSalaryAchievements(Integer salaryAchievements) {
        this.salaryAchievements = salaryAchievements;
    }

    public Integer getSalaryOverTime() {
        return salaryOverTime;
    }

    public void setSalaryOverTime(Integer salaryOverTime) {
        this.salaryOverTime = salaryOverTime;
    }

    public Integer getSalaryRecordMoney() {
        return salaryRecordMoney;
    }

    public void setSalaryRecordMoney(Integer salaryRecordMoney) {
        this.salaryRecordMoney = salaryRecordMoney;
    }

    public Integer getSalarySocialSecurity() {
        return salarySocialSecurity;
    }

    public void setSalarySocialSecurity(Integer salarySocialSecurity) {
        this.salarySocialSecurity = salarySocialSecurity;
    }

    public Double getSalaryAll() {
        return salaryAll;
    }

    public void setSalaryAll(Double salaryAll) {
        this.salaryAll = salaryAll;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TSalaryDetail{" +
                "salaryId=" + salaryId +
                ", salaryBase=" + salaryBase +
                ", salaryAchievements=" + salaryAchievements +
                ", salaryOverTime=" + salaryOverTime +
                ", salaryRecordMoney=" + salaryRecordMoney +
                ", salarySocialSecurity=" + salarySocialSecurity +
                ", salaryAll=" + salaryAll +
                ", sId=" + sId +
                ", date='" + date + '\'' +
                '}';
    }
}
