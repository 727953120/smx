package com.smx.service;

import com.smx.model.TSalaryDetail;

import java.util.List;

public interface TSalaryDetailService {
    boolean add(TSalaryDetail tSalaryDetail);
    List<TSalaryDetail> all();
    List<TSalaryDetail> getBySid(TSalaryDetail tSalaryDetail);
}
