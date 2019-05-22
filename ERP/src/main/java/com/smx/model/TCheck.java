package com.smx.model;

import java.io.Serializable;
import java.util.Date;

public class TCheck implements Serializable {
    private Integer cId;
    private String cBegine;
    private String cEnd;
    private Integer sId;

    public TCheck() {
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcBegine() {
        return cBegine;
    }

    public void setcBegine(String cBegine) {
        this.cBegine = cBegine;
    }

    public String getcEnd() {
        return cEnd;
    }

    public void setcEnd(String cEnd) {
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
