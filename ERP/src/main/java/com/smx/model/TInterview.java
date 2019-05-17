package com.smx.model;

import java.io.Serializable;

public class TInterview implements Serializable {
    private Integer IId;
    private String IPlace;
    private String IDate;
    private Integer TId;
    private Integer IState;
    private String ICompany;
    public TInterview() {
    }

    public String getICompany() {
        return ICompany;
    }

    public void setICompany(String ICompany) {
        this.ICompany = ICompany;
    }

    public Integer getIId() {
        return IId;
    }

    public void setIId(Integer IId) {
        this.IId = IId;
    }

    public String getIPlace() {
        return IPlace;
    }

    public void setIPlace(String IPlace) {
        this.IPlace = IPlace;
    }

    public String getIDate() {
        return IDate;
    }

    public void setIDate(String IDate) {
        this.IDate = IDate;
    }

    public Integer getTId() {
        return TId;
    }

    public void setTId(Integer TId) {
        this.TId = TId;
    }

    public Integer getIState() {
        return IState;
    }

    public void setIState(Integer IState) {
        this.IState = IState;
    }

    @Override
    public String toString() {
        return "TInterview{" +
                "IId=" + IId +
                ", IPlace='" + IPlace + '\'' +
                ", IDate='" + IDate + '\'' +
                ", TId=" + TId +
                ", IState=" + IState +
                ", ICompany='" + ICompany + '\'' +
                '}';
    }
}

