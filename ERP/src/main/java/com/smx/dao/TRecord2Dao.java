package com.smx.dao;

import com.smx.model.TRecord2;

import java.util.List;

public interface TRecord2Dao {
    boolean addRecord(TRecord2 tRecord2);
    List<TRecord2> getAll(TRecord2 tRecord2);
    List<TRecord2> getInterviews();
    boolean update(TRecord2 tRecord2);
    TRecord2 get(TRecord2 tRecord2);
}
