package com.smx.service;

import com.smx.model.TStaff1;

import java.util.List;

public interface Staff1Service {
    boolean add(TStaff1 tStaff1);
    boolean delete(TStaff1 tStaff1);
    boolean update(TStaff1 tStaff1);
    List<TStaff1> getAll();
    List<TStaff1> getByPid(TStaff1 tStaff1);
}
