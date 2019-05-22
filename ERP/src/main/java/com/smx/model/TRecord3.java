package com.smx.model;

import java.io.Serializable;

public class TRecord3 implements Serializable {
    private Integer re3Id;
    private Integer trainId;
    private Integer sId;

    public TRecord3() {
    }

    public Integer getRe3Id() {
        return re3Id;
    }

    public void setRe3Id(Integer re3Id) {
        this.re3Id = re3Id;
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "TRecord3{" +
                "re3Id=" + re3Id +
                ", trainId=" + trainId +
                ", sId=" + sId +
                '}';
    }
}
