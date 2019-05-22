package com.smx.service.impl;

import com.smx.dao.TRecord3Dao;
import com.smx.model.TRecord3;
import com.smx.service.TRecord3Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TRecord3ServiceImpl implements TRecord3Service {
    @Resource
    private TRecord3Dao tRecord3Dao;
    public boolean add(TRecord3 tRecord3) {
        if(tRecord3!=null){
            return tRecord3Dao.add(tRecord3);
        }
        return false;
    }

    public boolean update(TRecord3 tRecord3) {
        if(tRecord3!=null){
            return tRecord3Dao.update(tRecord3);
        }
        return false;
    }

    public boolean delete(TRecord3 tRecord3) {
        if(tRecord3!=null){
            return tRecord3Dao.delete(tRecord3);
        }
        return false;
    }

    public List<TRecord3> getAll() {
        List<TRecord3> list=tRecord3Dao.getAll();
        if(list!=null&&list.size()!=0){
            return list;
        }
        return null;
    }

    public List<TRecord3> getBySId(TRecord3 tRecord3) {
        if(tRecord3==null){
            return null;
        }
        List<TRecord3> list=tRecord3Dao.getBySId(tRecord3);
        if(list!=null&&list.size()!=0){
            return list;
        }
        return null;
    }

    public TRecord3 getById(TRecord3 tRecord3) {
        if(tRecord3==null){
            return null;
        }
        TRecord3 tRecord31=tRecord3Dao.getById(tRecord3);
        return tRecord31;
    }

    public List<TRecord3> getByReId(TRecord3 tRecord3) {
        if(tRecord3==null){
            return null;
        }
        List<TRecord3> list=tRecord3Dao.getByReId(tRecord3);
        if(list!=null&&list.size()!=0){
            return list;
        }
        return null;
    }
}
