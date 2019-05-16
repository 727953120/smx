package com.smx.model;

import com.sun.javafx.beans.IDProperty;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

public class T_Tourist implements Serializable {
    private Integer t_id;
    private String t_name;
    private String t_pass;

    public T_Tourist() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_pass() {
        return t_pass;
    }

    public void setT_pass(String t_pass) {
        this.t_pass = t_pass;
    }

    @Override
    public String toString() {
        return "T_TouristDao{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                ", t_pass='" + t_pass + '\'' +
                '}';
    }
}
