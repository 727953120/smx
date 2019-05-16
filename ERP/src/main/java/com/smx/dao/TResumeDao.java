package com.smx.dao;

import com.smx.model.TResume;

import java.util.List;

public interface TResumeDao {
    boolean add(TResume tResume);
    boolean update(TResume tResume);
    boolean delete(TResume tResume);
    List<TResume> getAll();
    TResume getResume(TResume tResume);

}
