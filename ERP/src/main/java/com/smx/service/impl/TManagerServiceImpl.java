package com.smx.service.impl;

import com.smx.dao.TManagerDao;
import com.smx.model.TManager;
import com.smx.service.TManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TManagerServiceImpl implements TManagerService {
    @Resource
    private TManagerDao tManagerDao;
    public TManager login(TManager tManager) {
      if(tManager!=null){
          return tManagerDao.login(tManager);
      }
      return null;
    }
}
