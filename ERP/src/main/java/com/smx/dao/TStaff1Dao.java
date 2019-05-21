package com.smx.dao;

import com.smx.model.TStaff1;

import java.util.List;

public interface TStaff1Dao {
    boolean add(TStaff1 tStaff1);
    boolean delete(TStaff1 tStaff1);
    boolean update(TStaff1 tStaff1);
    List<TStaff1> getAll();
    List<TStaff1> getByPid(TStaff1 tStaff1);
}
