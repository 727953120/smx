package com.smx.controller;

import com.smx.model.TCheck;
import com.smx.model.TRecord;
import com.smx.model.TSalaryDetail;
import com.smx.model.TStaff;
import com.smx.service.TCheckService;
import com.smx.service.TRecordService;
import com.smx.service.TSalaryDetailService;
import com.smx.service.TStaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.nio.channels.FileChannel;
import java.sql.Timestamp;
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
    @Resource
    private TSalaryDetailService tSalaryDetailService;
    @Resource
    private TRecordService tRecordService;
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
    public String clock(HttpSession session) throws Exception {
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
       Date date=new Date();
       TStaff tStaff= (TStaff) session.getAttribute("staff");
       String date1=sdf.format(date);
       String date6=sdf1.format(date);
       TCheck tCheck1=new TCheck();
       tCheck1.setsId(tStaff.getsId());
       List<TCheck> list=tCheckService.all(tCheck1);
       if((date.getTime()-sdf.parse(date1).getTime())/1000/3600.0>11){
           if(list!=null){
           for(TCheck tCheck2:list){
               Date date7=sdf.parse(tCheck2.getcBegine());
               String date8=sdf.format(date7);
               if(!date8.equals(date1)){
           TCheck tCheck=new TCheck();
           tCheck.setsId(tStaff.getsId());
           tCheck.setcBegine(date1);
           tCheckService.addBegine(tCheck);
               TRecord tRecord=new TRecord();
               tRecord.setsId(tStaff.getsId());
               tRecord.setRecordDate(date6);
               tRecord.setRecordReason("矿工");
               tRecord.setRecordMoney( -tStaff.getsMoney());
               tRecordService.add(tRecord);
               session.setAttribute("type",1);}else {
                   session.setAttribute("type",1);
               }
           }}else {
               TCheck tCheck=new TCheck();
               tCheck.setsId(tStaff.getsId());
               tCheck.setcBegine(date1);
               tCheckService.addBegine(tCheck);
               TRecord tRecord=new TRecord();
               tRecord.setsId(tStaff.getsId());
               tRecord.setRecordDate(date6);
               tRecord.setRecordReason("矿工");
               tRecord.setRecordMoney( -tStaff.getsMoney());
               tRecordService.add(tRecord);
               session.setAttribute("type",1);
           }
       }else{
     if(list!=null){
            for(TCheck tCheck:list){
                    Date date2=sdf.parse(tCheck.getcBegine());
                    String date3=sdf.format(date2);
            if(tCheck.getcEnd()==null){
                    if(date3.equals(date1)){
                             return "forward:toEnd?sId="+tCheck.getsId()+"&cId="+tCheck.getcId()+"&cBegine="+tCheck.getcBegine();
                    }
                }
                if(tCheck.getcEnd()!=null){
                     Date date4 = sdf.parse(tCheck.getcEnd());
                            String date5 = sdf.format(date4);
                         if (date3.equals(date1) && date5.equals(date1)) {
                                return "forward:workList?sId=" + tCheck.getsId() + "&cId=" + tCheck.getcId() + "&cBegine=" + tCheck.getcBegine() + "&cEnd=" + tCheck.getcEnd();
                            }
                    }
         }
     }}
         return "doClock";

   }
   @RequestMapping("toEnd")
   public String toEnd(TCheck tCheck,HttpSession session) throws Exception {
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        if((sdf.parse(tCheck.getcBegine()).getTime()-sdf1.parse(tCheck.getcBegine()).getTime())/1000/3600.0<=9){
            tCheckService.addBegine(tCheck);
            List<TCheck> tChecks=tCheckService.all(tCheck);
            TCheck tCheck1=tChecks.get(tChecks.size()-1);
            session.setAttribute("morning",tCheck1);
        }else if((sdf.parse(tCheck.getcBegine()).getTime()-sdf1.parse(tCheck.getcBegine()).getTime())/1000/3600.0<=11 && (sdf.parse(tCheck.getcBegine()).getTime()-sdf1.parse(tCheck.getcBegine()).getTime())/1000/3600.0>9) {
            tCheckService.addBegine(tCheck);
            TRecord tRecord = new TRecord();
            tRecord.setsId(tCheck.getsId());
            tRecord.setRecordDate(tCheck.getcBegine());
            tRecord.setRecordReason("迟到" + ((sdf.parse(tCheck.getcBegine()).getTime() - sdf1.parse(tCheck.getcBegine()).getTime()) / 1000 / 3600.0 - 9) + "小时");
            tRecord.setRecordMoney(1.0);
            tRecordService.add(tRecord);
        }
       return "offWork";
   }
   @RequestMapping("workList")
   public String workList(TCheck tCheck,HttpSession session) throws Exception {
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
       if((sdf.parse(tCheck.getcEnd()).getTime()-sdf1.parse(tCheck.getcEnd()).getTime())/1000/3600.0>=18){
           tCheckService.updateEnd(tCheck);
           session.setAttribute("morning",tCheck);
       }else if((sdf.parse(tCheck.getcEnd()).getTime()-sdf1.parse(tCheck.getcEnd()).getTime())/1000/3600.0<18 &&(sdf.parse(tCheck.getcEnd()).getTime()-sdf1.parse(tCheck.getcEnd()).getTime())/1000/3600.0>=16){
           tCheckService.updateEnd(tCheck);
           session.setAttribute("morning",tCheck);
           TRecord tRecord=new TRecord();
           tRecord.setsId(tCheck.getsId());
           tRecord.setRecordDate(tCheck.getcEnd());
           tRecord.setRecordReason("早退"+((sdf.parse(tCheck.getcEnd()).getTime()-sdf1.parse(tCheck.getcEnd()).getTime())/1000/3600.0-18)+"小时");
           tRecord.setRecordMoney(-Math.ceil(3)*50);
           tRecordService.add(tRecord);
       }else if((sdf.parse(tCheck.getcEnd()).getTime()-sdf1.parse(tCheck.getcEnd()).getTime())/1000/3600.0<16){
           tCheckService.updateEnd(tCheck);
           TRecord tRecord=new TRecord();
           tRecord.setsId(tCheck.getsId());
           tRecord.setRecordDate(tCheck.getcEnd());
           tRecord.setRecordReason("矿工");
           TStaff tStaff=new TStaff();
           tStaff.setsId(tCheck.getsId());
           TStaff tStaff1=tStaffService.get(tStaff);
           tRecord.setRecordMoney( -tStaff1.getsMoney());
           tRecordService.add(tRecord);
           tCheckService.updateEnd(tCheck);
           session.setAttribute("morning",tCheck);
       }
       return "todayTimeRecord";
   }
}
