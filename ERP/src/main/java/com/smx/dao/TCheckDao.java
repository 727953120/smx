package com.smx.dao;

import com.smx.model.TCheck;

import java.util.List;

public interface TCheckDao {
    boolean addBegine(TCheck tCheck);
    boolean updateEnd(TCheck tCheck);
    List<TCheck> all(TCheck tCheck);

}
