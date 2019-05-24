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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
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
      List<TStaff> tStaffList=tStaffService.getAll();
      session.setAttribute("department",tDepartmentList);
      session.setAttribute("position",tPositionList);
      session.setAttribute("staff1",tStaffList);
          return "seeDepartmentAndPosition";
    }
@RequestMapping("toCreateDepartment")
    public String toCreateDepartment(){
        return "createDepartment";
}
@RequestMapping("addDepartment")
    public String addDepartment(TDepartment tDepartment, HttpServletResponse response) throws IOException {
    List<TDepartment> tDepartments = tDepartmentService.getAll();
    List<String> list = new ArrayList<String>();
    if (tDepartments != null) {
        for (TDepartment tDepartment1 : tDepartments) {
            list.add(tDepartment1.getdDepartment());
        }
        if (!list.contains(tDepartment.getdDepartment())) {
            tDepartmentService.add(tDepartment);
            return "forward:getDepartments";
        }else{
            response.getWriter().print("<script>alert('对不起，该部门已存在')</script>");
        }
    }
        tDepartmentService.add(tDepartment);
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
            TStaff tStaff = new TStaff();
            tStaff.setpId(tPosition1.getpId());
            List<TStaff> tStaffList = tStaffService.getByPid(tStaff);
            if (tStaffList == null) {
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
    public String positionCreate(TPosition tPosition,HttpServletResponse response) throws IOException {
     List<TPosition> tPositionList= tPositionService.getAll();
     List<String> list=new ArrayList<String>();
     if(tPositionList!=null){
     for(TPosition tPosition1:tPositionList){
         list.add(tPosition1.getpName());
     }
     if(!list.contains(tPosition.getpName())){
         tPositionService.add(tPosition);
         return "forward:getAllPosition";
     }else {
         response.getWriter().print("<script>alert('对不起，该职位已存在')</script>");
     }
     }
    tPositionService.add(tPosition);
     return "forward:getAllPosition";
}
@RequestMapping("getAllPosition")
    public String getAllPosition(HttpSession session){
    List<TPosition> tPositionList= tPositionService.getAll();
    session.setAttribute("allPosition",tPositionList);
    List<TStaff> list=tStaffService.getAll();
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
        TStaff tStaff=new TStaff();
        tStaff.setpId(pId);
     List<TStaff> list=tStaffService.getByPid(tStaff);
     if(list==null){
        tPositionService.delete(tPosition);
        return "forward:getAllPosition";
     }
     return "deletePosition";
}
}
