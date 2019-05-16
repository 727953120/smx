package com.smx.model;

import com.sun.javafx.beans.IDProperty;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

public class TTourist implements Serializable {
    private Integer tid;
    private String tName;
    private String tPass;

    public TTourist() {
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPass() {
        return tPass;
    }

    public void settPass(String tPass) {
        this.tPass = tPass;
    }

    @Override
    public String toString() {
        return "TTourist{" +
                "tid=" + tid +
                ", tName='" + tName + '\'' +
                ", tPass='" + tPass + '\'' +
                '}';
    }
}
