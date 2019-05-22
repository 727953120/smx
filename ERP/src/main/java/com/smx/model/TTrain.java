package com.smx.model;

import java.io.Serializable;
import java.util.Objects;

public class TTrain implements Serializable {
    private Integer trainId;
    private String trainTitle;
    private String trainContent;
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
        return trainContent;
    }

    public void setTrainContent(String trainContent) {
        this.trainContent = trainContent;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TTrain tTrain = (TTrain) o;
        return Objects.equals(trainId, tTrain.trainId) &&
                Objects.equals(trainTitle, tTrain.trainTitle) &&
                Objects.equals(trainContent, tTrain.trainContent) &&
                Objects.equals(trainStatTime, tTrain.trainStatTime) &&
                Objects.equals(trainEndTime, tTrain.trainEndTime) &&
                Objects.equals(trainPlace, tTrain.trainPlace) &&
                Objects.equals(trainState, tTrain.trainState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainId, trainTitle, trainContent, trainStatTime, trainEndTime, trainPlace, trainState);
    }

    @Override
    public String toString() {
        return "TTrain{" +
                "trainId=" + trainId +
                ", trainTitle='" + trainTitle + '\'' +
                ", trainContent='" + trainContent + '\'' +
                ", trainStatTime='" + trainStatTime + '\'' +
                ", trainEndTime='" + trainEndTime + '\'' +
                ", trainPlace='" + trainPlace + '\'' +
                ", trainState=" + trainState +
                '}';
    }
}
