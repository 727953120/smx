package com.smx.service.impl;

import com.smx.dao.TRecruitDao;
import com.smx.model.TRecruit;
import com.smx.service.TRecruitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TRecruitServiceImpl implements TRecruitService {
    @Resource
    private TRecruitDao tRecruitDao;
    public List<TRecruit> getTRecruits() {
        List<TRecruit> tRecruitList=tRecruitDao.getTRecruits();
        if(tRecruitList!=null&&tRecruitList.size()!=0){
            return tRecruitList;
        }
        return null;
    }

    public TRecruit getRecruit(TRecruit tRecruit) {
        if(tRecruit!=null){
            return tRecruitDao.getRecruit(tRecruit);
        }
        return null;
    }

    public List<TRecruit> getAll() {
        List<TRecruit> tRecruitList=tRecruitDao.getTAll();
        if(tRecruitList!=null&&tRecruitList.size()!=0){
            return tRecruitList;
        }
        return null;
    }

    public boolean update(TRecruit tRecruit) {
        if(tRecruit!=null){
            return tRecruitDao.update(tRecruit);
        }
        return false;
    }

    public boolean back(TRecruit tRecruit) {
        if(tRecruit!=null){
            return tRecruitDao.back(tRecruit);
        }
        return false;
    }

    public boolean delete(TRecruit tRecruit) {
        if(tRecruit!=null){
            return tRecruitDao.delete(tRecruit);
        }
        return false;
    }

    @Override
    public boolean add(TRecruit tRecruit) {
        if(tRecruit!=null){
            return tRecruitDao.add(tRecruit);
        }
        return false;
    }
}
