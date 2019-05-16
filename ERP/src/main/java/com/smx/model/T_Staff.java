package com.smx.model;

import java.io.Serializable;
import java.util.Date;

public class T_Staff implements Serializable {
    private Integer s_id;
    private String s_name;
    private String s_pass;
    private String s_sex;
    private String s_phone;
    private String s_email;
    private String s_bankCard;
    private Date s_date;

    public T_Staff() {
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_pass() {
        return s_pass;
    }

    public void setS_pass(String s_pass) {
        this.s_pass = s_pass;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_phone() {
        return s_phone;
    }

    public void setS_phone(String s_phone) {
        this.s_phone = s_phone;
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    public String getS_bankCard() {
        return s_bankCard;
    }

    public void setS_bankCard(String s_bankCard) {
        this.s_bankCard = s_bankCard;
    }

    public Date getS_date() {
        return s_date;
    }

    public void setS_date(Date s_date) {
        this.s_date = s_date;
    }

    @Override
    public String toString() {
        return "T_Staff{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_pass='" + s_pass + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", s_phone='" + s_phone + '\'' +
                ", s_email='" + s_email + '\'' +
                ", s_bankCard='" + s_bankCard + '\'' +
                ", s_date=" + s_date +
                '}';
    }
}
