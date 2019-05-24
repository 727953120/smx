package com.smx.service;

import com.smx.model.TPosition;

import java.util.List;

public interface TPositionService {
    boolean add(TPosition tPosition);
    boolean delete(TPosition tPosition);
    List<TPosition> getAll();
    List<TPosition> getByDid(TPosition tPosition);
    TPosition getByPid(TPosition tPosition);
}
