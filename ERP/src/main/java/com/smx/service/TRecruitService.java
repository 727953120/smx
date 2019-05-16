package com.smx.service;

import com.smx.model.TRecruit;

import java.util.List;

public interface TRecruitService {
    List<TRecruit> getTRecruits();
    TRecruit getRecruit(TRecruit tRecruit);
}
