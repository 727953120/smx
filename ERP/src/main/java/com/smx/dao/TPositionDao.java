package com.smx.dao;

import com.smx.model.TPosition;

import java.util.List;

public interface TPositionDao {
    boolean add(TPosition tPosition);
    boolean delete(TPosition tPosition);
    List<TPosition> getAll();
    List<TPosition> getByDid(TPosition tPosition);
    TPosition getByPid(TPosition tPosition);
}
