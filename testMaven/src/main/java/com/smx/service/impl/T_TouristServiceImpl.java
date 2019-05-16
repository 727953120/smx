package com.smx.service.impl;

import com.smx.dao.T_TouristDao;
import com.smx.model.T_Tourist;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class T_TouristServiceImpl implements T_TouristDao {
    @Resource
    private T_TouristDao t_touristDao;
    public boolean register(T_Tourist t_tourist){
        if(t_tourist!=null){
            t_touristDao.register(t_tourist);
            return true;
        }
        return false;
    }

    public T_Tourist login(T_Tourist t_tourist) {
        if(t_tourist==null){
            return null;
        }
        T_Tourist t_tourist1=t_touristDao.login(t_tourist);
        return t_tourist1;
    }
}
