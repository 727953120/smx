package com.smx.service.impl;

import com.smx.dao.TResumeDao;
import com.smx.model.TResume;
import com.smx.service.TResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TResumeServiceImpl implements TResumeService {
    @Resource
    private TResumeDao tResumeDao;
    public boolean add(TResume tResume) {
        if(tResume!=null){
            return tResumeDao.add(tResume);
        }
        return false;
    }

    public boolean update(TResume tResume) {
        if(tResume!=null){
            return tResumeDao.update(tResume);
        }
        return false;
    }

    public boolean delete(TResume tResume) {
        if(tResume!=null){
            return tResumeDao.delete(tResume);
        }
        return false;
    }

    public List<TResume> getAll() {
        List<TResume> tResumeList=tResumeDao.getAll();
        if(tResumeList!=null&& tResumeList.size()!=0){
            return tResumeList;
        }
        return null;
    }

    public TResume getResume(TResume tResume) {
        if(tResume==null){
            return null;
        }
        return tResumeDao.getResume(tResume);
    }
}
