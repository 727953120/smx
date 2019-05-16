package com.smx.controller;

import com.smx.model.TRecruit;
import com.smx.service.TRecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TRecruitController {
    @Resource
    private TRecruitService tRecruitService;
    @RequestMapping("getTRecruits")
    public String getTRecruits(HttpSession session){
    List<TRecruit> tRecruitList=tRecruitService.getTRecruits();
    session.setAttribute("recruits",tRecruitList);
    return "../../index";
    }
    @RequestMapping("/")
    public String toIndex(){
        return "forward:getTRecruits";
    }
}
