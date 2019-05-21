package com.smx.dao;

import com.smx.model.TDepartment;

import java.util.List;

public interface TDepartmentDao {
    boolean add(TDepartment tDepartment);
    boolean delete(TDepartment tDepartment);
    List<TDepartment> getAll();

}
