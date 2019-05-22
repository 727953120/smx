package com.smx.service.impl;

import com.smx.dao.TCheckDao;
import com.smx.model.TCheck;
import com.smx.service.TCheckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TCheckServiceImpl implements TCheckService {
@Resource
private TCheckDao tCheckDao;
    @Override
    public boolean addBegine(TCheck tCheck) {
        if(tCheck!=null){
           return  tCheckDao.addBegine(tCheck);
        }
        return false;
    }

    @Override
    public boolean updateEnd(TCheck tCheck) {
        if(tCheck!=null){
            return  tCheckDao.updateEnd(tCheck);
        }
        return false;
    }

    @Override
    public List<TCheck> all(TCheck tCheck) {
        if(tCheck==null){
            return null;
        }
     List<TCheck> list=tCheckDao.all(tCheck);
     if(list!=null && list.size()!=0){
         return list;
     }
     return null;
    }


}
