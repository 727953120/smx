package com.smx.dao;

import com.smx.model.TStaff;

import java.util.List;

public interface TStaffDao {
    boolean add(TStaff tStaff);
    boolean update(TStaff tStaff);
    TStaff get(TStaff tStaff);
    List<TStaff> getAll();
    TStaff login(TStaff tStaff);
    List<TStaff> getByPid(TStaff tStaff);
}
