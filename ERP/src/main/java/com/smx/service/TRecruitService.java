package com.smx.service;

import com.smx.model.TRecruit;

import java.util.List;

public interface TRecruitService {
    List<TRecruit> getTRecruits();
    TRecruit getRecruit(TRecruit tRecruit);
    List<TRecruit> getAll();
    boolean update(TRecruit tRecruit);
    boolean back(TRecruit tRecruit);
    boolean delete(TRecruit tRecruit);
}
