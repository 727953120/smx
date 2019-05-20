package com.smx.service;


import com.smx.model.TTourist;

public interface TTouristService {
    boolean register(TTourist ttourist);
    TTourist login(TTourist ttourist);
    TTourist get(TTourist t_tourist);
}
