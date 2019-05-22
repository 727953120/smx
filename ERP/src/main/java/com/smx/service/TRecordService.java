package com.smx.service;

import com.smx.model.TRecord;

import java.util.List;

public interface TRecordService {
    boolean add(TRecord tRecord);
    boolean update(TRecord tRecord);
    boolean delete(TRecord tRecord);
    List<TRecord> getAllBySid(TRecord tRecord);
    List<TRecord> getAll();
}
