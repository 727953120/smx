package com.smx.service.impl;

import com.smx.dao.TInterviewDao;
import com.smx.model.TInterview;
import com.smx.service.TInterviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TInterviewServiceImpl implements TInterviewService {
    @Resource
    private TInterviewDao tInterviewDao;
    public boolean add(TInterview interview) {
        if(interview!=null){
            return tInterviewDao.add(interview);
        }
        return false;
    }

    public boolean update(TInterview interview) {
        if(interview!=null){
            return tInterviewDao.update(interview);
        }
        return false;
    }

    public boolean delete(TInterview interview) {
        if(interview!=null){
            return tInterviewDao.delete(interview);
        }
        return false;
    }

    public List<TInterview> getAll() {
        List<TInterview> tInterviewList=tInterviewDao.getAll();
        if (tInterviewList!=null&&tInterviewList.size()!=0){
            return tInterviewList;
        }
        return null;
    }

    public List<TInterview> getInterview(TInterview interview) {
        if(interview==null){
         return null;
        }
        List<TInterview> tInterviewList=tInterviewDao.getInterview(interview);
        if(tInterviewList!=null&& tInterviewList.size()!=0){
            return tInterviewList;
        }
        return null;
    }

    public TInterview get(TInterview interview) {
        if(interview!=null){
            return tInterviewDao.get(interview);
        }
        return null;
    }

    public TInterview getByReId(TInterview interview) {
        if(interview!=null){
            return tInterviewDao.getByReId(interview);
        }
        return null;
    }
}
