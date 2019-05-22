package com.smx.service.impl;

import com.smx.dao.TCheckDao;
import com.smx.model.TCheck;
import com.smx.service.TCheckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TCheckServiceImpl implements TCheckService {
    @Resource
    private TCheckDao tCheckDao;
    public boolean add(TCheck tCheck) {
        if(tCheckDao!=null){
            tCheckDao.add(tCheck);
        }
        return false;
    }
}
