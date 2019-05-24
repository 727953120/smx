package com.smx.controller;

import com.smx.dao.TRecord3Dao;
import com.smx.model.*;
import com.smx.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class trainController {
    @Resource
    private TTrainService tTrainService;
    @Resource
    private TStaffService tStaffService;
@Resource
private TRecord3Service tRecord3Service;
@Resource
private TDepartmentService tDepartmentService;
@Resource
private TPositionService tPositionService;
    @RequestMapping("toTrain")
    public String toTrain(HttpSession session) {
      List<TRecord3> tRecord3List=tRecord3Service.getAll();
      List<TTrain> tTrainList=new ArrayList<TTrain>();
      if(tRecord3List!=null&&tRecord3List.size()!=0){
          for(TRecord3 tRecord3:tRecord3List){
              TTrain tTrain=new TTrain();
              tTrain.setTrainId(tRecord3.getTrainId());
          TTrain tTrain1=tTrainService.getById(tTrain);
          boolean a=tTrainList.contains(tTrain1);
          if(!a){
              tTrainList.add(tTrain1);
              System.out.println(tTrainList);
          }
          }
      }
        session.setAttribute("train", tTrainList);
        return "trainInformation";
    }

    @RequestMapping("trainAdd")
    public String trainAdd(TTrain tTrain,Integer [] sId) {
        if (tTrain != null&&sId!=null) {
            tTrainService.add(tTrain);
            List<TTrain> tTrains=tTrainService.getAll();
            TTrain tTrain1=tTrains.get(tTrains.size()-1);
            for(Integer a:sId){
                TRecord3 tRecord3=new TRecord3();
                tRecord3.setTrainId(tTrain1.getTrainId());
                tRecord3.setsId(a);
                tRecord3Service.add(tRecord3);
            }
            return "forward:toTrain";
        }
        return "addTrain";
    }

    @RequestMapping("toAddTrain")
    public String toAddTrain(HttpSession session) {
        List<TStaff> list = tStaffService.getAll();

        session.setAttribute("staffList", list);
        return "addTrain";
    }

    @RequestMapping("deleteTrain")
    public String deleteTrain(TTrain tTrain) throws Exception {
        if (tTrain != null) {
            TTrain tTrain1 = tTrainService.getById(tTrain);
            if (tTrain1.getTrainState() == 0) {
                tTrainService.delete(tTrain);
                TRecord3 tRecord3=new TRecord3();
                tRecord3.setTrainId(tTrain1.getTrainId());
                tRecord3Service.delete(tRecord3);
                return "forward:toTrain";
            }
        }
        return "forward:toTrain";
    }
    @RequestMapping("deleteEndTrain")
    public String deleteEndTrain(TTrain tTrain) throws Exception {
        if (tTrain != null) {
            TTrain tTrain1 = tTrainService.getById(tTrain);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
            if (sdf.parse(tTrain1.getTrainEndTime()).getTime() < new Date().getTime()) {
                tTrainService.delete(tTrain);
                TRecord3 tRecord3=new TRecord3();
                tRecord3.setTrainId(tTrain1.getTrainId());
                tRecord3Service.delete(tRecord3);
                return "forward:toTrain";
            }
        }
        return "forward:toTrain";
    }
    @RequestMapping("postTrain")
    public String postTrain(TTrain tTrain, HttpSession session) {
        TTrain tTrain1 = tTrainService.getById(tTrain);
        session.setAttribute("draft", tTrain1);
        return "post";
    }

    @RequestMapping("release")
    public String release(TTrain tTrain, HttpSession session) {
        tTrain.setTrainState(1);
        tTrainService.update(tTrain);
        return "forward:toTrain";
    }
    @RequestMapping("trainStaff")
    public String trainStaff(TTrain tTrain,HttpSession session){
        TRecord3 tRecord3=new TRecord3();
        tRecord3.setTrainId(tTrain.getTrainId());
      List<TRecord3> tRecord3List=tRecord3Service.getByReId(tRecord3);
      List<TStaff> tStaffList=new ArrayList<TStaff>();
      List<TDepartment> tDepartmentList=new ArrayList<TDepartment>();
      List<TPosition> tPositionList=new ArrayList<TPosition>();
      for(TRecord3 tRecord31:tRecord3List){
          TStaff tStaff=new TStaff();
          tStaff.setsId(tRecord31.getsId());
          TStaff tStaff1=tStaffService.get(tStaff);
          tStaffList.add(tStaff1);
          TDepartment tDepartment=new TDepartment();
          tDepartment.setdId(tStaff1.getdId());
          tDepartmentService.getById(tDepartment);
          tDepartmentList.add(tDepartment);
          TPosition tPosition=new TPosition();
          tPosition.setpId(tStaff1.getpId());
          tPositionService.getByPid(tPosition);
          tPositionList.add(tPosition);
      }
      session.setAttribute("staffTrain",tStaffList);
      session.setAttribute("p",tPositionList);
      session.setAttribute("d",tDepartmentList);
      return "getTrainStaff";
    }
}