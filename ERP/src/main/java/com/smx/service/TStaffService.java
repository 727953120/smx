package com.smx.service;

import com.smx.model.TStaff;
import com.smx.model.TStaff1;

import java.util.List;

public interface TStaffService {
    boolean add(TStaff tStaff);
    boolean update(TStaff tStaff);
    TStaff get(TStaff tStaff);
    List<TStaff> getAll();
    TStaff login(TStaff tStaff);
    List<TStaff> getByPid(TStaff tStaff);

}
