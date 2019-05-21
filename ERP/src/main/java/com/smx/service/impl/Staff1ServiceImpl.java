package com.smx.service.impl;

import com.smx.dao.TStaff1Dao;
import com.smx.model.TStaff1;
import com.smx.service.Staff1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Staff1ServiceImpl implements Staff1Service {
    @Resource
    private TStaff1Dao tStaff1Dao;
    public boolean add(TStaff1 tStaff1) {
        if(tStaff1!=null){
            return tStaff1Dao.add(tStaff1);
        }
        return false;
    }

    public boolean delete(TStaff1 tStaff1) {
        if(tStaff1!=null){
            return tStaff1Dao.delete(tStaff1);
        }
        return false;
    }

    public boolean update(TStaff1 tStaff1) {
        if(tStaff1!=null){
            return tStaff1Dao.update(tStaff1);
        }
        return false;
    }

    public List<TStaff1> getAll() {
       List<TStaff1> tStaff1List= tStaff1Dao.getAll();
        if(tStaff1List!=null&&tStaff1List.size()!=0){
            return tStaff1List;
        }
        return null;
    }

    public List<TStaff1> getByPid(TStaff1 tStaff1) {
        if(tStaff1==null){
            return null;
        }
        List<TStaff1> tStaff1List=tStaff1Dao.getByPid(tStaff1);
        if(tStaff1List!=null &&tStaff1List.size()!=0){
            return tStaff1List;
        }
        return null;
    }
}
