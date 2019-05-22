package com.smx.model;

import java.io.Serializable;

public class TRecord implements Serializable {
    private Integer recordId;
    private String recordDate;
    private String recordReason;
    private Integer sId;
    private Double recordMoney;

    public TRecord() {
    }

    public Double getRecordMoney() {
        return recordMoney;
    }

    public void setRecordMoney(Double recordMoney) {
        this.recordMoney = recordMoney;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getRecordReason() {
        return recordReason;
    }

    public void setRecordReason(String recordReason) {
        this.recordReason = recordReason;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "TRecord{" +
                "recordId=" + recordId +
                ", recordDate='" + recordDate + '\'' +
                ", recordReason='" + recordReason + '\'' +
                ", sId=" + sId +
                ", recordMoney=" + recordMoney +
                '}';
    }
}
