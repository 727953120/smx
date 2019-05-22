package com.smx.controller;

import com.smx.model.TCheck;
import com.smx.model.TStaff;
import com.smx.service.TCheckService;
import com.smx.service.TStaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TStaffController {
    @Resource
    private TStaffService tStaffService;
    @Resource
    private TCheckService tCheckService;
    @RequestMapping("entry")
    public String entry(HttpSession session){
        List<TStaff> tStaffList=tStaffService.getAll();
        session.setAttribute("staffs",tStaffList);
        return "showStaff";
    }
    @RequestMapping("sureStaff")
    public String sureStaff(Integer sId){
        TStaff tStaff=new TStaff();
        tStaff.setsId(sId);
        TStaff tStaff1=tStaffService.get(tStaff);
        tStaff1.setsState(1);
        tStaffService.update(tStaff1);
        return "forward:entry";
    }
@RequestMapping("toStaffLogin")
    public String toStaffLogin(){
        return "staffLogin";
}

   @RequestMapping("loginStaff")
    public String staffLogin(TStaff tStaff,HttpSession session){
        if(tStaffService.login(tStaff)!=null){
            TStaff tStaff1=tStaffService.login(tStaff);
            session.setAttribute("staff",tStaff1);
            return "staffMain";
        }
        return "staffLogin";
   }
   @RequestMapping("myselfInformation")
    public  String mySelfInformation(Integer sId, HttpSession session){
        TStaff tStaff=new TStaff();
        tStaff.setsId(sId);
       TStaff tStaff1=tStaffService.get(tStaff);
      session.setAttribute("staffInformation",tStaff1);
       return "look";
   }
   @RequestMapping("toList")
    public String toList(ModelMap map){
    List<TStaff> tStaffList=tStaffService.getAll();
    map.addAttribute("list",tStaffList);
    return "list";
   }
   @RequestMapping("updateStaff")
    public String updateStaff(TStaff tStaff){
        if(tStaff!=null){
            tStaffService.update(tStaff);
        }
        return "err";
   }
   @RequestMapping("toUpdateStaff")
    public String toUpdateStaff(){
        return "staffUpdate";
   }
   @RequestMapping("updateStaffInformation")
    public String updateStaffInformation(TStaff staff){
       System.out.println(staff);
        if(staff!=null){
            tStaffService.update(staff);
            return "forward:myselfInformation?sId="+staff.getsId();
        }
       return "err";
   }
   @RequestMapping("clock")
    public String clock(){
        return "doClock";
   }
   @RequestMapping("toEnd")
   public String toEnd(String cBegine,HttpSession session) throws Exception {
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        TCheck tCheck=new TCheck();
        tCheck.setcBegine(sdf.parse(cBegine));
        if(tCheck.getcBegine().getTime()/1000/3600%24<=100){
            session.setAttribute("morning",tCheck);

        }else if(tCheck.getcBegine().getTime()/1000/3600%24<=11 && tCheck.getcBegine().getTime()/1000/3600%24>9){
           //扣钱的发放
        }
       return "offWork";
   }
   @RequestMapping("workList")
   public String workList(TCheck tCheck){
        tCheckService.add(tCheck);
       return "";
   }
}
