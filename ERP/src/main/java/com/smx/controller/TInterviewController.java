package com.smx.controller;

import com.smx.model.*;
import com.smx.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TInterviewController{
    @Resource
    private TInterviewService tInterviewService;
    @Resource
    private TTouristService tTouristService;
    @Resource
    private TRecord2Service tRecord2Service;
    @Resource
    private TRecruitService tRecruitService;
    @Resource
    private TStaffService tStaffService;
    @Resource
    private TDepartmentService departmentService;
    @Resource
    private TPositionService positionService;
    @Resource
    private TResumeService tResumeService;
    @RequestMapping("getMyInterview")
    public String getMyInterview(Integer tid, HttpSession session){
        TInterview tInterview=new TInterview();
        tInterview.setTId(tid);
        List<TInterview> tInterviewList=tInterviewService.getInterview(tInterview);
        System.out.println(tInterviewList);
        session.setAttribute("myInterview",tInterviewList);
        return "myView";
    }
    @RequestMapping("agree")
    public String agree(Integer IId,HttpSession session){
        TTourist tTourist= (TTourist) session.getAttribute("t");
        Integer tid=tTourist.getTid();
        TInterview tInterview=new TInterview();
        tInterview.setIId(IId);
        TInterview tInterview1= (TInterview) tInterviewService.get(tInterview);
        tInterview1.setIState(1);
        System.out.println(tInterview1);
        tInterviewService.update(tInterview1);
        return "forward:getMyInterview?tid="+tid;
    }
@RequestMapping("postInterview")
    public String postInterview(Integer reId, ModelMap map) {
    System.out.println(reId);
    TRecord2 tRecord2=new TRecord2();
    tRecord2.setReId(reId);
    TRecord2 record=tRecord2Service.get(tRecord2);//得到记录
    map.addAttribute("re",record);
        TTourist tTourist=new TTourist();
        tTourist.setTid(record.gettId());
    TTourist tTourist1= tTouristService.get(tTourist);//得到游客
       map.addAttribute("t1",tTourist1);
    TRecruit tRecruit=new TRecruit();
    tRecruit.setRid(record.getrId());
    TRecruit tRecruit1=tRecruitService.getRecruit(tRecruit);//得到招聘
    System.out.println(tRecruit1);
    map.addAttribute("r1",tRecruit1);
    TPosition tPosition=new TPosition();
    tPosition.setpId(tRecruit1.getpId());
    TPosition tPosition1= positionService.getByPid(tPosition);
    map.addAttribute("p",tPosition1);
    TDepartment tDepartment=new TDepartment();
    tDepartment.setdId(tRecruit1.getdId());
    TDepartment tDepartment1=departmentService.getById(tDepartment);
    map.addAttribute("d",tDepartment1);
    System.out.println(tDepartment1);
    System.out.println("好了");
        return "postView";
}
@RequestMapping("addView")
public String addView(TInterview tInterview){
        tInterviewService.add(tInterview);
        return "allRecord";
}
@RequestMapping("getInterviews")
    public String getAllInterviews(HttpSession session){
        List<TInterview> tInterviewList=tInterviewService.getAll();
        session.setAttribute("managerView",tInterviewList);

        return "collectView";
}
@RequestMapping("employStaff")
public String employStaff(TPosition tPosition,TDepartment tDepartment,TResume tResume,HttpSession session){
    TDepartment tDepartment1= departmentService.getById(tDepartment);
    TPosition tPosition1=   positionService.getByPid(tPosition);
    TResume tResume1=tResumeService.getResume(tResume);
    session.setAttribute("checkOneDepartment",tDepartment1);
    session.setAttribute("checkOnePosition",tPosition1);
    session.setAttribute("checkOneResume",tResume1);
        return "employ";
}
    @RequestMapping("addStaff")
    public String addStaff(TStaff tStaff){
        System.out.println(tStaff);
        tStaffService.add(tStaff);
        return "collectView";
    }
    @RequestMapping("toTest")
    public String toTest(){
        return "test";
    }
}
