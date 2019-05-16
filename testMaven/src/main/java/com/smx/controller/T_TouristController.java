package com.smx.controller;

import com.smx.model.T_Tourist;
import com.smx.service.T_TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class T_TouristController {
    @Resource
    private T_TouristService t_touristService;
@RequestMapping("login")
   public String login(T_Tourist t_tourist, HttpSession session){
    T_Tourist t_tourist1=t_touristService.login(t_tourist);
    if(t_tourist1!=null){
        return "success";
    }
    return "login";
   }
   @RequestMapping("/")
    public String toHomePage(){
    return "homePage";
   }
}
