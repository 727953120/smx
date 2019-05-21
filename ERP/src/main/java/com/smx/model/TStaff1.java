package com.smx.model;

public class TStaff1 {
    private Integer staff1Id;
    private Integer pId;
    private String staff1Name;

    public TStaff1() {
    }

    public Integer getStaff1Id() {
        return staff1Id;
    }

    public void setStaff1Id(Integer staff1Id) {
        this.staff1Id = staff1Id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getStaff1Name() {
        return staff1Name;
    }

    public void setStaff1Name(String staff1Name) {
        this.staff1Name = staff1Name;
    }

    @Override
    public String toString() {
        return "TStaff1{" +
                "staff1Id=" + staff1Id +
                ", pId=" + pId +
                ", staff1Name='" + staff1Name + '\'' +
                '}';
    }
}
