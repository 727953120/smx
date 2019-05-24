package com.smx.model;

import java.io.Serializable;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TPosition tPosition = (TPosition) o;
        return Objects.equals(pId, tPosition.pId) &&
                Objects.equals(dId, tPosition.dId) &&
                Objects.equals(pName, tPosition.pName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pId, dId, pName);
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
