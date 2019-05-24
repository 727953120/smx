package com.smx.dao;

import com.smx.model.TRecruit;

import java.util.List;

public interface TRecruitDao {
    List<TRecruit> getTRecruits();
    TRecruit getRecruit(TRecruit tRecruit);
    List<TRecruit> getTAll();
    boolean update(TRecruit tRecruit);
    boolean back(TRecruit tRecruit);
    boolean delete(TRecruit tRecruit);
    boolean add(TRecruit tRecruit);
}
