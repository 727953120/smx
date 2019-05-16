package com.smx.service.impl;

import com.smx.dao.TRecord2Dao;
import com.smx.model.TRecord2;
import com.smx.service.TRecord2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TRecord2ServiceImpl implements TRecord2Service {
    @Resource
    private TRecord2Dao tRecord2Dao;
    public boolean addRecord(TRecord2 tRecord2) {
        if(tRecord2!=null){
            return tRecord2Dao.addRecord(tRecord2);
        }
        return false;
    }

    public List<TRecord2> getAll(TRecord2 tRecord2) {
        if(tRecord2==null){
            return null;
        }
        List<TRecord2> tRecord2List=tRecord2Dao.getAll(tRecord2);
        if(tRecord2List!=null&&tRecord2List.size()!=0){
            return tRecord2List;
        }
        return null;
    }
}
