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
    @RequestMapping("toRecruit")
    public String toRecruits(HttpSession session){
       List<TRecruit> tRecruitList=tRecruitService.getAll();
       session.setAttribute("allTRecruits",tRecruitList);
        return "recruit";
    }
    @RequestMapping("postRecruit")
    public String postRecruit(Integer rid) {
       TRecruit tRecruit=new TRecruit();
       tRecruit.setRid(rid);
       tRecruitService.update(tRecruit);
       return "forward:toRecruit";
    }
    @RequestMapping("backRecruit")
    public String backRecruit(Integer rid){
        TRecruit tRecruit=new TRecruit();
        tRecruit.setRid(rid);
        tRecruitService.back(tRecruit);
        return "forward:toRecruit";
    }
    @RequestMapping("deleteRecruit")
    public String deleteRecruit(Integer rid){
        TRecruit tRecruit=new TRecruit();
        tRecruit.setRid(rid);
        tRecruitService.delete(tRecruit);
        return "forward:toRecruit";
    }
    @RequestMapping("postNewRecruit")
    public String postNewRecruit(){
        return "newRecruit";
    }
}
