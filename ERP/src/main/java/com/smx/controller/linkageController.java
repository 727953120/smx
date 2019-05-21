package com.smx.controller;

import com.smx.model.TDepartment;
import com.smx.model.TPosition;
import com.smx.model.TStaff;
import com.smx.model.TStaff1;
import com.smx.service.Staff1Service;
import com.smx.service.TDepartmentService;
import com.smx.service.TPositionService;
import com.smx.service.TStaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class linkageController {
    @Resource
    private TDepartmentService tDepartmentService;
    @Resource
    private TPositionService tPositionService;
    @Resource
    private TStaffService tStaffService;
    @Resource
    private Staff1Service staff1Service;
    @RequestMapping("getLink")
    public String getLink(HttpSession session){
      List<TDepartment> tDepartmentList=tDepartmentService.getAll();
      List<TPosition> tPositionList=tPositionService.getAll();
      List<TStaff1> tStaff1List=staff1Service.getAll();
      session.setAttribute("department",tDepartmentList);
      session.setAttribute("position",tPositionList);
      session.setAttribute("staff1",tStaff1List);
          return "seeDepartmentAndPosition";
    }
@RequestMapping("toCreateDepartment")
    public String toCreateDepartment(){
        return "createDepartment";
}
@RequestMapping("addDepartment")
    public String addDepartment(TDepartment tDepartment){
      List<TDepartment> tDepartments=tDepartmentService.getAll();
      List<String> list=new ArrayList<String>();
      for(TDepartment tDepartment1:tDepartments){
         list.add(tDepartment1.getdDepartment());
      }
      if(!list.contains(tDepartment.getdDepartment())){
          tDepartmentService.add(tDepartment);
          return "forward:getDepartments";
      }
        return "forward:getDepartments";
      }

@RequestMapping("getDepartments")
    public String getDepartments(HttpSession session){
      List<TDepartment> tDepartments=tDepartmentService.getAll();
      session.setAttribute("depart",tDepartments);
      return "allDepartments";
}
@RequestMapping("toDeleteDepartment")
    public String toDeleteDepartment(HttpSession session){
    List<TDepartment> tDepartmentList=tDepartmentService.getAll();
    session.setAttribute("deleteDepart",tDepartmentList);
    return "deleteDepartment";
}
@RequestMapping("departmentDelete")
    public String departmentDelete(Integer dId) {
    TDepartment tDepartment = new TDepartment();
    tDepartment.setdId(dId);
    TPosition tPosition = new TPosition();
    tPosition.setdId(dId);
    List<TPosition> tPositionList = tPositionService.getByDid(tPosition);
    if(tPositionList!=null) {
        int i=0;
        for (TPosition tPosition1 : tPositionList) {
            TStaff1 tStaff1 = new TStaff1();
            tStaff1.setpId(tPosition1.getpId());
            List<TStaff1> tStaff1List = staff1Service.getByPid(tStaff1);
            if (tStaff1List == null) {
                i++;
                if(i==tPositionList.size()){
                    tDepartmentService.delete(tDepartment);
                    return "forward:toDeleteDepartment";
                }
            }
        }
    }else {
        tDepartmentService.delete(tDepartment);
        return "forward:toDeleteDepartment";
    }
    return "forward:toDeleteDepartment";
}
@RequestMapping("toCreatePosition")
    public  String toCreatePosition(HttpSession session){
    List<TDepartment> tDepartmentList=tDepartmentService.getAll();
    session.setAttribute("deleteDepart",tDepartmentList);
        return "createPosition";
}
@RequestMapping("positionCreate")
    public String positionCreate(TPosition tPosition){
     List<TPosition> tPositionList= tPositionService.getAll();
     List<String> list=new ArrayList<String>();
     for(TPosition tPosition1:tPositionList){
         list.add(tPosition1.getpName());
     }
     if(!list.contains(tPosition.getpName())){
         tPositionService.add(tPosition);
     }
     return "forward:getAllPosition";
}
@RequestMapping("getAllPosition")
    public String getAllPosition(HttpSession session){
    List<TPosition> tPositionList= tPositionService.getAll();
    session.setAttribute("allPosition",tPositionList);
    List<TStaff1> list=staff1Service.getAll();
    session.setAttribute("allStaff1",list);
    return "lookPositions";
}
@RequestMapping("toDeletePosition")
    public String toDeletePosition(HttpSession session){
    List<TPosition> tPositionList= tPositionService.getAll();
    session.setAttribute("allPosition",tPositionList);
    return "deletePosition";
}
@RequestMapping("positionDelete")
    public  String positionDelete(Integer pId){
        TPosition tPosition=new TPosition();
        tPosition.setpId(pId);
        TStaff1 tStaff1=new TStaff1();
        tStaff1.setpId(pId);
     List<TStaff1> list=staff1Service.getByPid(tStaff1);
     if(list==null){
        tPositionService.delete(tPosition);
        return "forward:getAllPosition";
     }
     return "deletePosition";
}
}
