package com.smx.controller;

import com.smx.model.TRecord2;
import com.smx.model.TRecruit;
import com.smx.model.TResume;
import com.smx.model.TTourist;
import com.smx.service.TRecord2Service;
import com.smx.service.TRecruitService;
import com.smx.service.TResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TRecord2Controller {
    @Resource
    private TRecord2Service tRecord2Service;
    @Resource
    private TRecruitService tRecruitService;
    @Resource
    private TResumeService tResumeService;
    @RequestMapping("toChoose")
    public String toChoose(Integer rid, HttpSession session){
        TRecruit tRecruit=new TRecruit();
        tRecruit.setRid(rid);
        TRecruit tRecruit1=tRecruitService.getRecruit(tRecruit);
        session.setAttribute("tRecruit1",tRecruit1);
        List<TResume> tResumeList=tResumeService.getAll();
        session.setAttribute("tResumes",tResumeList);
        return "chooseResume";
    }
    @RequestMapping("addRecord2")
    public String addRecord2(Integer resumeId,HttpSession session){
        TRecruit tRecruit= (TRecruit) session.getAttribute("tRecruit1");
        TTourist tTourist= (TTourist) session.getAttribute("t");
        TRecord2 tRecord2=new TRecord2();
        tRecord2.setResumeId(resumeId);
        tRecord2.setrId(tRecruit.getRid());
        tRecord2.settId(tTourist.getTid());
        tRecord2Service.addRecord(tRecord2);
        return "success";
    }
}
