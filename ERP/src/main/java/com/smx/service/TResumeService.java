package com.smx.service;

import com.smx.model.TResume;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TResumeService {
    boolean add(TResume tResume);
    boolean update(TResume tResume);
    boolean delete(TResume tResume);
    List<TResume> getAll();
    TResume getResume(TResume tResume);
}
