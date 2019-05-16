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
}
