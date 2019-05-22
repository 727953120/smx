package com.smx.service.impl;

import com.smx.dao.TTrainDao;
import com.smx.model.TTrain;
import com.smx.service.TTrainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TTrainServiceImpl implements TTrainService {
    @Resource
    private TTrainDao tTrainDao;
    public boolean add(TTrain tTrain) {
        if(tTrain!=null){
            return tTrainDao.add(tTrain);
        }
        return false;
    }

    public boolean update(TTrain tTrain) {
        if(tTrain!=null){
            return tTrainDao.update(tTrain);
        }
        return false;
    }

    public boolean delete(TTrain tTrain) {
        if(tTrain!=null){
            return tTrainDao.delete(tTrain);
        }
        return false;
    }

    public List<TTrain> getAll() {
        List<TTrain> list=tTrainDao.getAll();
        if(list!=null&&list.size()!=0){
            return list;
        }
        return null;
    }
    public TTrain getById(TTrain tTrain) {
        if(tTrain!=null){
            TTrain tTrain1=tTrainDao.getById(tTrain);
            return tTrain1;
        }
        return null;
    }
}
