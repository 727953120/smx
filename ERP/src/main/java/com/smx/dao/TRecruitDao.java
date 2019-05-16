package com.smx.dao;

import com.smx.model.TRecruit;

import java.util.List;

public interface TRecruitDao {
    List<TRecruit> getTRecruits();
    TRecruit getRecruit(TRecruit tRecruit);
}
