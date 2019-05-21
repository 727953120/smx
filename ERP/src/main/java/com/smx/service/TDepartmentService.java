package com.smx.service;

import com.smx.model.TDepartment;

import java.util.List;

public interface TDepartmentService {
    boolean add(TDepartment tDepartment);
    boolean delete(TDepartment tDepartment);
    List<TDepartment> getAll();
}
