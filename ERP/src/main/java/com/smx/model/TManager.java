package com.smx.model;

import java.io.Serializable;

public class TManager implements Serializable {
    private Integer mid;
    private String mName;
    private String mPass;
    public TManager() {
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPass() {
        return mPass;
    }

    public void setmPass(String mPass) {
        this.mPass = mPass;
    }

    @Override
    public String toString() {
        return "TManager{" +
                "mid=" + mid +
                ", mName='" + mName + '\'' +
                ", mPass='" + mPass + '\'' +
                '}';
    }
}
