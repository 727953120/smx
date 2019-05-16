package com.smx.dao;

import com.smx.model.T_Tourist;

public interface T_TouristDao {
    boolean register(T_Tourist t_tourist);
    T_Tourist login(T_Tourist t_tourist);
}
