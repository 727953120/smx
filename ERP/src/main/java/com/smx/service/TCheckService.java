package com.smx.service;

import com.smx.dao.TCheckDao;
import com.smx.model.TCheck;

import java.util.List;

public interface TCheckService {
    boolean addBegine(TCheck tCheck);
    boolean updateEnd(TCheck tCheck);
    List<TCheck> all(TCheck tCheck);
}
