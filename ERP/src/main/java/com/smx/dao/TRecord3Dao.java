package com.smx.dao;

import com.smx.model.TRecord3;

import java.util.List;

public interface TRecord3Dao {
    boolean add(TRecord3 tRecord3);
    boolean update(TRecord3 tRecord3);
    boolean delete(TRecord3 tRecord3);
    List<TRecord3> getAll();
    List<TRecord3> getBySId(TRecord3 tRecord3);
    TRecord3 getById(TRecord3 tRecord3);
    List<TRecord3> getByReId(TRecord3 tRecord3);
}
