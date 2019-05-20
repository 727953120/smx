package com.smx.controller;

import com.smx.model.*;
import com.smx.service.*;
import com.smx.service.impl.TStaffServiceImpl;
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
    TRecord2 tRecord2=new TRecord2();
    tRecord2.setReId(reId);
    TRecord2 record=tRecord2Service.get(tRecord2);
    map.addAttribute("re",record);
        TTourist tTourist=new TTourist();
        tTourist.setTid(record.gettId());
    TTourist tTourist1= tTouristService.get(tTourist);
       map.addAttribute("t1",tTourist1);
    TRecruit tRecruit=new TRecruit();
    tRecruit.setRid(record.getrId());
    TRecruit tRecruit1=tRecruitService.getRecruit(tRecruit);
    map.addAttribute("r1",tRecruit1);
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
public String employStaff(){
        return "employ";
}
    @RequestMapping("addStaff")
    public String addStaff(TStaff tStaff){
        tStaffService.add(tStaff);
        return "collectView";
    }
    @RequestMapping("toTest")
    public String toTest(){
        return "test";
    }
}
