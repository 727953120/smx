package com.smx.model;

import java.io.Serializable;

public class TRecord2 implements Serializable {
    private Integer reId;
    private Integer rId;
    private Integer tId;
    private Integer resumeId;
private Integer reState;
    public TRecord2() {
    }

    public Integer getReState() {
        return reState;
    }

    public void setReState(Integer reState) {
        this.reState = reState;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    @Override
    public String toString() {
        String state1="";
        if(reState==0){
            state1="未查看";
        }else{
            state1="已查看，等面试通知";
        }
        return "TRecord2{" +
                "reId=" + reId +
                ", rId=" + rId +
                ", tId=" + tId +
                ", resumeId=" + resumeId +
                ", state1=" + state1 +
                '}';
    }
}
