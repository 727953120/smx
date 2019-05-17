package com.smx.model;

import java.io.Serializable;

public class TPosition implements Serializable {
    private Integer pId;
    private Integer dId;
    private String pName;

    public TPosition() {
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "TPosition{" +
                "pId=" + pId +
                ", dId=" + dId +
                ", pName='" + pName + '\'' +
                '}';
    }
}
