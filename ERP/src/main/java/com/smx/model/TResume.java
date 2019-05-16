package com.smx.model;

import java.io.Serializable;

public class  TResume implements Serializable {
    private Integer resumeId;
    private String resumeName;
    private Integer resumeAge;
    private String resumeSex;
    private String resumeAddress;
    private String resumePhone;
    private String resumeEmail;
    private Integer resumeSalaryExpectation;//期望薪资
    private String resumeEducation;
    private String resumeEducationTime;
    private String resumeCompany;//过去的公司
    private String resumeTime;//工作时间
    private String resumePosition;//职位
    private String resumeExperience;//工作经历
    private Integer tId;
    private Integer resumeState;

    public TResume() {
    }

    public Integer getResumeState() {
        return resumeState;
    }

    public void setResumeState(Integer resumeState) {
        this.resumeState = resumeState;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    public Integer getResumeAge() {
        return resumeAge;
    }

    public void setResumeAge(Integer resumeAge) {
        this.resumeAge = resumeAge;
    }

    public String getResumeSex() {
        return resumeSex;
    }

    public void setResumeSex(String resumeSex) {
        this.resumeSex = resumeSex;
    }

    public String getResumeAddress() {
        return resumeAddress;
    }

    public void setResumeAddress(String resumeAddress) {
        this.resumeAddress = resumeAddress;
    }

    public String getResumePhone() {
        return resumePhone;
    }

    public void setResumePhone(String resumePhone) {
        this.resumePhone = resumePhone;
    }

    public String getResumeEmail() {
        return resumeEmail;
    }

    public void setResumeEmail(String resumeEmail) {
        this.resumeEmail = resumeEmail;
    }

    public Integer getResumeSalaryExpectation() {
        return resumeSalaryExpectation;
    }

    public void setResumeSalaryExpectation(Integer resumeSalaryExpectation) {
        this.resumeSalaryExpectation = resumeSalaryExpectation;
    }

    public String getResumeEducation() {
        return resumeEducation;
    }

    public void setResumeEducation(String resumeEducation) {
        this.resumeEducation = resumeEducation;
    }

    public String getResumeEducationTime() {
        return resumeEducationTime;
    }

    public void setResumeEducationTime(String resumeEducationTime) {
        this.resumeEducationTime = resumeEducationTime;
    }

    public String getResumeCompany() {
        return resumeCompany;
    }

    public void setResumeCompany(String resumeCompany) {
        this.resumeCompany = resumeCompany;
    }

    public String getResumeTime() {
        return resumeTime;
    }

    public void setResumeTime(String resumeTime) {
        this.resumeTime = resumeTime;
    }

    public String getResumePosition() {
        return resumePosition;
    }

    public void setResumePosition(String resumePosition) {
        this.resumePosition = resumePosition;
    }

    public String getResumeExperience() {
        return resumeExperience;
    }

    public void setResumeExperience(String resumeExperience) {
        this.resumeExperience = resumeExperience;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    @Override
    public String toString() {
        return "TResumeDao{" +
                "resumeId=" + resumeId +
                ", resumeName='" + resumeName + '\'' +
                ", resumeAge=" + resumeAge +
                ", resumeSex='" + resumeSex + '\'' +
                ", resumeAddress='" + resumeAddress + '\'' +
                ", resumePhone='" + resumePhone + '\'' +
                ", resumeEmail='" + resumeEmail + '\'' +
                ", resumeSalaryExpectation=" + resumeSalaryExpectation +
                ", resumeEducation='" + resumeEducation + '\'' +
                ", resumeEducationTime='" + resumeEducationTime + '\'' +
                ", resumeCompany='" + resumeCompany + '\'' +
                ", resumeTime='" + resumeTime + '\'' +
                ", resumePosition='" + resumePosition + '\'' +
                ", resumeExperience='" + resumeExperience + '\'' +
                ", tId=" + tId +
                ", resumeState=" + resumeState +
                '}';
    }
}
