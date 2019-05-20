package com.smx.service;

import com.smx.model.TInterview;

import java.util.List;

public interface TInterviewService {
    boolean add(TInterview interview);
    boolean update(TInterview interview);
    boolean delete(TInterview interview);
    List<TInterview> getAll();
    List<TInterview> getInterview(TInterview interview);
    TInterview get(TInterview interview);
    TInterview getByReId(TInterview interview);
}
