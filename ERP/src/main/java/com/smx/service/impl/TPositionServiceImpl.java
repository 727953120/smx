package com.smx.service.impl;

import com.smx.dao.TPositionDao;
import com.smx.model.TPosition;
import com.smx.service.TPositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TPositionServiceImpl implements TPositionService {
    @Resource
    private TPositionDao tPositionDao;
    public boolean add(TPosition tPosition) {
        if(tPosition!=null){
            return tPositionDao.add(tPosition);
        }
        return false;
    }

    public boolean delete(TPosition tPosition) {
        if(tPosition!=null){
            return tPositionDao.delete(tPosition);
        }
        return false;
    }

    public List<TPosition> getAll() {
        List<TPosition> tPositionList=tPositionDao.getAll();
        if(tPositionList!=null && tPositionList.size()!=0){
            return tPositionList;
        }
        return null;
    }

    public List<TPosition> getByDid(TPosition tPosition) {
        if(tPosition==null){
            return null;
        }
        List<TPosition> tPositionList=tPositionDao.getByDid(tPosition);
        if(tPositionList!=null && tPositionList.size()!=0){
            return tPositionDao.getByDid(tPosition);
        }
        return null;
    }

    @Override
    public TPosition getByPid(TPosition tPosition) {
        if(tPosition!=null){
           return tPositionDao.getByPid(tPosition);
        }
        return null;
    }


}
