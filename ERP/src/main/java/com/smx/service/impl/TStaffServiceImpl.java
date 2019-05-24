package com.smx.service.impl;

import com.smx.dao.TStaffDao;
import com.smx.model.TStaff;
import com.smx.service.TStaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TStaffServiceImpl implements TStaffService {
    @Resource
    private TStaffDao tStaffDao;
    public boolean add(TStaff tStaff) {
        if(tStaff!=null){
           return tStaffDao.add(tStaff);
        }
        return false;
    }

    public boolean update(TStaff tStaff) {
        if(tStaff!=null){
            return tStaffDao.update(tStaff);
        }
        return false;
    }

    public TStaff get(TStaff tStaff) {
        if(tStaff!=null){
            return tStaffDao.get(tStaff);
        }
        return null;
    }

    public List<TStaff> getAll() {
        List<TStaff> tStaffList=tStaffDao.getAll();
        if(tStaffList!=null&&tStaffList.size()!=0){
            return  tStaffList;
        }
        return null;
    }

    public TStaff login(TStaff tStaff) {
        if(tStaff!=null){
            return tStaffDao.login(tStaff);
        }
        return null;
    }

    @Override
    public List<TStaff> getByPid(TStaff tStaff) {
        if(tStaff==null){
            return null;
        }
        List<TStaff> tStaffList=tStaffDao.getByPid(tStaff);
        if(tStaffList!=null&&tStaffList.size()!=0){
            return  tStaffList;
        }
        return null;
    }
}
