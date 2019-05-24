package com.smx.controller;

import com.smx.model.TRecord2;
import com.smx.model.TRecruit;
import com.smx.model.TResume;
import com.smx.model.TTourist;
import com.smx.service.TRecord2Service;
import com.smx.service.TRecruitService;
import com.smx.service.TResumeService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TResumeController {
    @Resource
    private TResumeService tResumeService;
    @Resource
    private TRecord2Service tRecord2Service;
    @Resource
    private TRecruitService tRecruitService;
    @RequestMapping("getAll")
    public String getAll(HttpSession session){
        List<TResume> tResumeList=tResumeService.getAll();
        session.setAttribute("tResumes",tResumeList);
        return "showResume";
    }
    @RequestMapping("toResume")
    public  String toResume(){
        return "forward:getAll";
    }
    @RequestMapping("toAddResume")
    public  String toAddResume(){
        return "addResume";
    }
    @RequestMapping("toUpdate")
    public  String toUpdate(Integer resumeId,HttpSession session){
        TResume tResume=new TResume();
        tResume.setResumeId(resumeId);
     TResume tResume1=tResumeService.getResume(tResume);
     session.setAttribute("resume1",tResume1);
        return "update";
    }
    @RequestMapping("AddResume")
    public String AddResume(TResume tResume,HttpSession session){
        System.out.println(tResume);
        tResumeService.add(tResume);
        return "forward:getAll";
    }
    @RequestMapping("updateResume")
    public String updateResume(TResume tResume,HttpSession session){
        tResumeService.update(tResume);
        return "forward:getAll";
    }
    @RequestMapping("getAlreadyPost")
    public String getAlreadyPost(HttpSession session){
     TTourist tTourist= (TTourist) session.getAttribute("t");
        System.out.println(tTourist);
     TRecord2 tRecord2=new TRecord2();
     tRecord2.settId(tTourist.getTid());
      List<TRecord2> tRecord2List=tRecord2Service.getAll(tRecord2);//根据用户id找到所有的投递记录
        session.setAttribute("seeRecord2",tRecord2List);
      List<TRecruit> list=new ArrayList<TRecruit>();
      if(tRecord2List!=null&&tRecord2List.size()!=0){
      for(TRecord2 t:tRecord2List){//遍历记录得到招聘详细的id
          TRecruit tRecruit=new TRecruit();
          tRecruit.setRid(t.getrId());
          TRecruit tRecruit1=tRecruitService.getRecruit(tRecruit);
          list.add(tRecruit1);
      }}
      session.setAttribute("recruitRecord",list);
        return "postRecord";
    }
    @RequestMapping("delete")
    public String delete(Integer resumeId){
        TResume tResume=new TResume();
        tResume.setResumeId(resumeId);
        tResumeService.delete(tResume);
        return "forward:getAll";
    }

}
