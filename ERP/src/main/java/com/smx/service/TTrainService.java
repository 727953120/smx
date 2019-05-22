package com.smx.service;

import com.smx.model.TTrain;

import java.util.List;

public interface TTrainService {
    boolean add(TTrain tTrain);
    boolean  update(TTrain tTrain);
    boolean delete(TTrain tTrain);
    List<TTrain> getAll();
    TTrain getById(TTrain tTrain);

}
