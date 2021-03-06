package com.smx.controller;

import com.smx.model.*;
import com.smx.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TRecord2Controller {
    @Resource
    private TRecord2Service tRecord2Service;
    @Resource
    private TRecruitService tRecruitService;
    @Resource
    private TResumeService tResumeService;
    @Resource
    private TInterviewService interviewService;
    @Resource
    private TDepartmentService departmentService;
    @Resource
    private TPositionService positionService;
    @RequestMapping("toChoose")
    public String toChoose(Integer rid, HttpSession session){
        TRecruit tRecruit=new TRecruit();
        tRecruit.setRid(rid);
        TRecruit tRecruit1=tRecruitService.getRecruit(tRecruit);
        session.setAttribute("tRecruit1",tRecruit1);
        TDepartment tDepartment=new TDepartment();
        tDepartment.setdId(tRecruit1.getdId());
        TDepartment tDepartment1= departmentService.getById(tDepartment);
        session.setAttribute("department3",tDepartment);
        TPosition tPosition=new TPosition();
       tPosition.setpId(tRecruit1.getpId());
        TPosition tPosition1=positionService.getByPid(tPosition);
        session.setAttribute("tPosition3",tPosition1);
        List<TResume> tResumeList=tResumeService.getAll();
        session.setAttribute("tResumes",tResumeList);
        return "chooseResume";
    }
    @RequestMapping("addRecord2")
    public String addRecord2(Integer resumeId,HttpSession session){
        TRecruit tRecruit= (TRecruit) session.getAttribute("tRecruit1");
        TTourist tTourist= (TTourist) session.getAttribute("t");
        TRecord2 tRecord2=new TRecord2();
        tRecord2.setResumeId(resumeId);
        tRecord2.setrId(tRecruit.getRid());
        tRecord2.settId(tTourist.getTid());
        tRecord2Service.addRecord(tRecord2);
        return "success";
    }
    @RequestMapping("getInterviewers")//得到所有的投递记录
    public String getInterviewers(HttpSession session){
       List<TRecord2> tRecord2List=tRecord2Service.getInterviews();
       session.setAttribute("allRecord",tRecord2List);
       return "allRecord";
    }
    @RequestMapping("check")
    public String check(Integer reId,HttpSession session){
        TRecord2 tRecord2=new TRecord2();
        tRecord2.setReId(reId);
        tRecord2Service.update(tRecord2);
        TRecord2 tRecord21=tRecord2Service.get(tRecord2);
        TInterview tInterview=new TInterview();
        tInterview.setReId(tRecord21.getReId());
        TInterview tInterview1=interviewService.getByReId(tInterview);
        session.setAttribute("checkOneInterview",tInterview1);
        TRecruit recruit=new TRecruit();
        recruit.setRid(tRecord21.getrId());
      TRecruit tRecruit=tRecruitService.getRecruit(recruit);
      TDepartment tDepartment=new TDepartment();
      tDepartment.setdId(tRecruit.getdId());
        TDepartment tDepartment1= departmentService.getById(tDepartment);
        session.setAttribute("checkOneDepartment",tDepartment1);
      session.setAttribute("checkOneRecruit",tRecruit);
      TPosition tPosition=new TPosition();
      tPosition.setpId(tRecruit.getpId());
        TPosition tPosition1=  positionService.getByPid(tPosition);
      session.setAttribute("checkOnePosition",tPosition1);
        TResume tResume=new TResume();
        tResume.setResumeId(tRecord21.getResumeId());
        TResume tResume1=tResumeService.getResume(tResume);
        session.setAttribute("checkOneResume",tResume1);

        return "collectResume";
    }
}
