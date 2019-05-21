package com.smx.service.impl;

import com.smx.dao.TDepartmentDao;
import com.smx.model.TDepartment;
import com.smx.service.TDepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TDepartmentServiceImpl implements TDepartmentService {
    @Resource
    private TDepartmentDao tDepartmentDao;
    public boolean add(TDepartment tDepartment) {
        if(tDepartment!=null){
            return tDepartmentDao.add(tDepartment);
        }
        return false;
    }

    public boolean delete(TDepartment tDepartment) {
        if(tDepartment!=null){
            return tDepartmentDao.delete(tDepartment);
        }
        return false;
    }

    public List<TDepartment> getAll() {
        List<TDepartment> tDepartments=tDepartmentDao.getAll();
        if(tDepartments!=null && tDepartments.size()!=0){
            return tDepartments;
        }
        return null;
    }
}
