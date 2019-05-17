package com.smx.controller;

import com.smx.model.TInterview;
import com.smx.model.TTourist;
import com.smx.service.TInterviewService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TInterviewController{
    @Resource
    private TInterviewService tInterviewService;
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
}
