package com.smx.controller;

import com.smx.model.TTourist;
import com.smx.service.TTouristService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class TTouristController {
    @Resource
    private TTouristService t_touristService;
@RequestMapping("login")
   public String login(TTourist tTourist, HttpSession session){
    TTourist tTourist1=t_touristService.login(tTourist);
    if(tTourist1!=null){
        session.setAttribute("t",tTourist1);
        return "success";
    }
    return "../../index";
   }
   @RequestMapping("register")
   public String register(TTourist tTourist,HttpSession session){
       System.out.println(tTourist);
    t_touristService.register(tTourist);
    return "login";
   }
@RequestMapping("toLogin")
    public String toLogin(){
    return "login";
}
    @RequestMapping("toRegister")
    public String toRegister(){
        return "register";
    }
}
