package com.smx.model;

import java.io.Serializable;

public class TDisagree implements Serializable {
    private Integer disId;
    private Integer sId;
    private Integer recordId;
    private String disContent;
    private Integer disType;

    public TDisagree() {
    }

    public Integer getDisType() {
        return disType;
    }

    public void setDisType(Integer disType) {
        this.disType = disType;
    }

    public Integer getDisId() {
        return disId;
    }

    public void setDisId(Integer disId) {
        this.disId = disId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getDisContent() {
        return disContent;
    }

    public void setDisContent(String disContent) {
        this.disContent = disContent;
    }
    @Override
    public String toString() {
        return "TDisagree{" +
                "disId=" + disId +
                ", sId=" + sId +
                ", recordId=" + recordId +
                ", disContent='" + disContent + '\'' +
                ", disType=" + disType +
                '}';
    }
}
