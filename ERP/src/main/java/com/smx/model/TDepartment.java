package com.smx.model;

import java.io.Serializable;

public class TDepartment implements Serializable {
    private Integer dId;
    private String dDepartment;
    private String dDate;
    public TDepartment() {
    }

    public String getdDate() {
        return dDate;
    }

    public void setdDate(String dDate) {
        this.dDate = dDate;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdDepartment() {
        return dDepartment;
    }

    public void setdDepartment(String dDepartment) {
        this.dDepartment = dDepartment;
    }

    @Override
    public String toString() {
        return "TDepartment{" +
                "dId=" + dId +
                ", dDepartment='" + dDepartment + '\'' +
                ", dDate='" + dDate + '\'' +
                '}';
    }
}
