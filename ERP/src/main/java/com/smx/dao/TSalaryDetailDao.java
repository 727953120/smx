package com.smx.dao;

import com.smx.model.TSalaryDetail;

import java.util.List;

public interface TSalaryDetailDao {
    boolean add(TSalaryDetail tSalaryDetail);
    List<TSalaryDetail> all();
    List<TSalaryDetail> getBySid(TSalaryDetail tSalaryDetail);

}
