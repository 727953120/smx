package com.smx.service.impl;

import com.smx.dao.TRecordDao;
import com.smx.model.TRecord;
import com.smx.service.TRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TRecordServiceImpl implements TRecordService {
    @Resource
    private TRecordDao tRecordDao;
    @Override
    public boolean add(TRecord tRecord) {
        if(tRecord!=null){
            return tRecordDao.add(tRecord);
        }
        return false;
    }

    @Override
    public boolean update(TRecord tRecord) {
        if(tRecord!=null){
            return tRecordDao.update(tRecord);
        }
        return false;
    }

    @Override
    public boolean delete(TRecord tRecord) {
        if(tRecord!=null){
            return tRecordDao.delete(tRecord);
        }
        return false;
    }

    @Override
    public List<TRecord> getAllBySid(TRecord tRecord) {
        if(tRecord==null){
            return null;
        }
        List<TRecord> list=tRecordDao.getAllBySid(tRecord);
        if(list.size()!=0&&list!=null){
            return list;
        }
        return null;
    }

    @Override
    public List<TRecord> getAll() {
        List<TRecord> list=tRecordDao.getAll();
        if(list.size()!=0&&list!=null){
            return list;
        }
        return null;
    }
}
