package com.smx.model;

import java.io.Serializable;

public class TTrain implements Serializable {
    private Integer trainId;
    private String trainTitle;
    private String TrainContent;
    private Integer sId;
    private String trainStatTime;
    private String trainEndTime;
    private String trainPlace;
    private Integer trainState;

    public TTrain() {
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public String getTrainTitle() {
        return trainTitle;
    }

    public void setTrainTitle(String trainTitle) {
        this.trainTitle = trainTitle;
    }

    public String getTrainContent() {
        return TrainContent;
    }

    public void setTrainContent(String trainContent) {
        TrainContent = trainContent;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getTrainStatTime() {
        return trainStatTime;
    }

    public void setTrainStatTime(String trainStatTime) {
        this.trainStatTime = trainStatTime;
    }

    public String getTrainEndTime() {
        return trainEndTime;
    }

    public void setTrainEndTime(String trainEndTime) {
        this.trainEndTime = trainEndTime;
    }

    public String getTrainPlace() {
        return trainPlace;
    }

    public void setTrainPlace(String trainPlace) {
        this.trainPlace = trainPlace;
    }

    public Integer getTrainState() {
        return trainState;
    }

    public void setTrainState(Integer trainState) {
        this.trainState = trainState;
    }

    @Override
    public String toString() {
        return "TTrain{" +
                "trainId=" + trainId +
                ", trainTitle='" + trainTitle + '\'' +
                ", TrainContent='" + TrainContent + '\'' +
                ", sId=" + sId +
                ", trainStatTime='" + trainStatTime + '\'' +
                ", trainEndTime='" + trainEndTime + '\'' +
                ", trainPlace='" + trainPlace + '\'' +
                ", trainState=" + trainState +
                '}';
    }
}
