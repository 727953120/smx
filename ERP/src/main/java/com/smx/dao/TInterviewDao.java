package com.smx.dao;

import com.smx.model.TInterview;

import java.util.List;

public interface TInterviewDao {
    boolean add(TInterview interview);
    boolean update(TInterview interview);
    boolean delete(TInterview interview);
    List<TInterview> getAll();
    List<TInterview> getInterview(TInterview interview);
    TInterview get(TInterview interview);

}
