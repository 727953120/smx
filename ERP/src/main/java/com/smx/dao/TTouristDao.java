package com.smx.dao;

import com.smx.model.TTourist;

public interface TTouristDao {
    boolean register(TTourist t_tourist);
    TTourist login(TTourist t_tourist);
    TTourist get(TTourist t_tourist);
}
