package com.smx.model;

import java.io.Serializable;

public class T_Resume implements Serializable {
    private Integer resume_id;
    private String resume_name;
    private Integer resume_age;
    private String resume_sex;
    private String resume_address;
    private String resume_phone;
    private String resume_email;
    private Integer resume_salaryExpectation;//期望薪资
    private String resume_education;
    private String resume_educationTime;
    private String resume_company;//过去的公司
    private String resume_time;//工作时间
    private String resume_position;//职位
    private String resume_experience;//工作经历
    private Integer t_id;

    public T_Resume() {
    }

    public Integer getResume_id() {
        return resume_id;
    }

    public void setResume_id(Integer resume_id) {
        this.resume_id = resume_id;
    }

    public String getResume_name() {
        return resume_name;
    }

    public void setResume_name(String resume_name) {
        this.resume_name = resume_name;
    }

    public Integer getResume_age() {
        return resume_age;
    }

    public void setResume_age(Integer resume_age) {
        this.resume_age = resume_age;
    }

    public String getResume_sex() {
        return resume_sex;
    }

    public void setResume_sex(String resume_sex) {
        this.resume_sex = resume_sex;
    }

    public String getResume_address() {
        return resume_address;
    }

    public void setResume_address(String resume_address) {
        this.resume_address = resume_address;
    }

    public String getResume_phone() {
        return resume_phone;
    }

    public void setResume_phone(String resume_phone) {
        this.resume_phone = resume_phone;
    }

    public String getResume_email() {
        return resume_email;
    }

    public void setResume_email(String resume_email) {
        this.resume_email = resume_email;
    }

    public Integer getResume_salaryExpectation() {
        return resume_salaryExpectation;
    }

    public void setResume_salaryExpectation(Integer resume_salaryExpectation) {
        this.resume_salaryExpectation = resume_salaryExpectation;
    }

    public String getResume_education() {
        return resume_education;
    }

    public void setResume_education(String resume_education) {
        this.resume_education = resume_education;
    }

    public String getResume_educationTime() {
        return resume_educationTime;
    }

    public void setResume_educationTime(String resume_educationTime) {
        this.resume_educationTime = resume_educationTime;
    }

    public String getResume_company() {
        return resume_company;
    }

    public void setResume_company(String resume_company) {
        this.resume_company = resume_company;
    }

    public String getResume_time() {
        return resume_time;
    }

    public void setResume_time(String resume_time) {
        this.resume_time = resume_time;
    }

    public String getResume_position() {
        return resume_position;
    }

    public void setResume_position(String resume_position) {
        this.resume_position = resume_position;
    }

    public String getResume_experience() {
        return resume_experience;
    }

    public void setResume_experience(String resume_experience) {
        this.resume_experience = resume_experience;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    @Override
    public String toString() {
        return "T_Resume{" +
                "resume_id=" + resume_id +
                ", resume_name='" + resume_name + '\'' +
                ", resume_age=" + resume_age +
                ", resume_sex='" + resume_sex + '\'' +
                ", resume_address='" + resume_address + '\'' +
                ", resume_phone='" + resume_phone + '\'' +
                ", resume_email='" + resume_email + '\'' +
                ", resume_salaryExpectation=" + resume_salaryExpectation +
                ", resume_education='" + resume_education + '\'' +
                ", resume_educationTime='" + resume_educationTime + '\'' +
                ", resume_company='" + resume_company + '\'' +
                ", resume_time='" + resume_time + '\'' +
                ", resume_position='" + resume_position + '\'' +
                ", resume_experience='" + resume_experience + '\'' +
                ", t_id=" + t_id +
                '}';
    }
}
