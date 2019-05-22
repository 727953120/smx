package com.smx.service.impl;

import com.smx.dao.TSalaryDetailDao;
import com.smx.model.TSalaryDetail;
import com.smx.service.TSalaryDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TSalaryDetailServiceImpl implements TSalaryDetailService {
   @Resource
   private TSalaryDetailDao tSalaryDetailDao;

    @Override
    public boolean add(TSalaryDetail tSalaryDetail) {
        if(tSalaryDetail!=null){
            return tSalaryDetailDao.add(tSalaryDetail);
        }
        return false;
    }

    @Override
    public List<TSalaryDetail> all() {
        List<TSalaryDetail> list=tSalaryDetailDao.all();
        if(list!=null && list.size()!=0){
            return list;
        }
        return null;
    }

    @Override
    public List<TSalaryDetail> getBySid(TSalaryDetail tSalaryDetail) {
        if(tSalaryDetail==null){
            return null;
        }
        List<TSalaryDetail> list=tSalaryDetailDao.getBySid(tSalaryDetail);
        if(list!=null && list.size()!=0){
            return list;
        }
        return null;
    }
}
