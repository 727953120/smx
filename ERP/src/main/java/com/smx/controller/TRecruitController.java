package com.smx.controller;

import com.smx.model.TDepartment;
import com.smx.model.TPosition;
import com.smx.model.TRecruit;
import com.smx.service.TDepartmentService;
import com.smx.service.TPositionService;
import com.smx.service.TRecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TRecruitController {
    @Resource
    private TRecruitService tRecruitService;
    @Resource
    private TDepartmentService tDepartmentService;
    @Resource
    private TPositionService tPositionService;
    @RequestMapping("getTRecruits")
    public String getTRecruits(HttpSession session,HttpServletResponse response) throws IOException {
    List<TRecruit> tRecruitList=tRecruitService.getTRecruits();
    TPosition tPosition=new TPosition();
    TDepartment tDepartment=new TDepartment();
    List<TDepartment> tDepartmentList=new ArrayList<>();
    List<TPosition> tPositionList=new ArrayList<>();
    if(tRecruitList!=null&&tRecruitList.size()!=0){
        for(TRecruit tRecruit:tRecruitList){
            tDepartment.setdId(tRecruit.getdId());
            tPosition.setpId(tRecruit.getpId());
            TPosition tPosition1=  tPositionService.getByPid(tPosition);
            TDepartment tDepartment1=tDepartmentService.getById(tDepartment);
            tDepartmentList.add(tDepartment1);
              tPositionList.add(tPosition1);
        }
        }
        session.setAttribute("recruits",tRecruitList);
        session.setAttribute("dpts",tDepartmentList);
        session.setAttribute("psts",tPositionList);
    return "../../index";
    }
    @RequestMapping("/")
    public String toIndex(){
        return "forward:getTRecruits";
    }
    @RequestMapping("toRecruit")
    public String toRecruits(HttpSession session){
        List<TRecruit> tRecruitList=tRecruitService.getAll();
        TPosition tPosition=new TPosition();
        TDepartment tDepartment=new TDepartment();
        List<TDepartment> tDepartmentList=new ArrayList<>();
        List<TPosition> tPositionList=new ArrayList<>();
        if(tRecruitList!=null&&tRecruitList.size()!=0){
            for(TRecruit tRecruit:tRecruitList){
                tDepartment.setdId(tRecruit.getdId());
                tPosition.setpId(tRecruit.getpId());
                TPosition tPosition1=  tPositionService.getByPid(tPosition);
                TDepartment tDepartment1=tDepartmentService.getById(tDepartment);
                tDepartmentList.add(tDepartment1);
                tPositionList.add(tPosition1);
            }
        }
        session.setAttribute("dpts",tDepartmentList);
        session.setAttribute("psts",tPositionList);
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
    @RequestMapping("draft")
    public String draft(HttpSession session){
     List<TDepartment> tDepartmentList=tDepartmentService.getAll();
     List<TPosition> tPositionList=tPositionService.getAll();
     session.setAttribute("departmentList",tDepartmentList);
     session.setAttribute("positionList",tPositionList);
        return "draftRecruit";
    }
    @RequestMapping("addRecruit")
    public String addRecruit(TRecruit tRecruit, HttpSession session, HttpServletResponse response) throws IOException {
        System.out.println(tRecruit);
        List<TPosition> list= (List<TPosition>) session.getAttribute("positionList");
            TPosition tPosition=new TPosition();
            tPosition.setpId(tRecruit.getpId());
        TPosition tPosition1= tPositionService.getByPid(tPosition);
        if(!list.contains(tPosition1)){
            tRecruitService.add(tRecruit);
        }else {
            response.getWriter().print("<script>alert('对不起，该职位已存在')</script>");
        }
        return "forward:toRecruit";
    }
}
