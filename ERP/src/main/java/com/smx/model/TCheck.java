package com.smx.model;

import java.io.Serializable;
import java.util.Date;

public class TCheck implements Serializable {
    private Integer cId;
    private Date cBegine;
    private Date cEnd;
    private Integer sId;

    public TCheck() {
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Date getcBegine() {
        return cBegine;
    }

    public void setcBegine(Date cBegine) {
        this.cBegine = cBegine;
    }

    public Date getcEnd() {
        return cEnd;
    }

    public void setcEnd(Date cEnd) {
        this.cEnd = cEnd;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "TCheck{" +
                "cId=" + cId +
                ", cBegine=" + cBegine +
                ", cEnd=" + cEnd +
                ", sId=" + sId +
                '}';
    }
}
