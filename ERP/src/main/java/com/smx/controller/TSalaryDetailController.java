package com.smx.controller;

import com.smx.service.TSalaryDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TSalaryDetailController {
    @Resource
    private TSalaryDetailService tSalaryDetailService;

}
