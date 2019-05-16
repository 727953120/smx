package com.smx.service.impl;

import com.smx.dao.TTouristDao;
import com.smx.model.TTourist;
import com.smx.service.TTouristService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TTouristServiceImpl implements TTouristService {
    @Resource
    private TTouristDao ttouristDao;
    public boolean register(TTourist ttourist){
        if(ttourist!=null){
           return ttouristDao.register(ttourist);
        }
        return false;
    }

    public TTourist login(TTourist ttourist) {
        if(ttourist==null){
            return null;
        }
        return ttouristDao.login(ttourist);
    }
}
