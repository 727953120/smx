package com.smx.dao;

import com.smx.model.TTrain;

import java.util.List;

public interface TTrainDao {
    boolean add(TTrain tTrain);
    boolean  update(TTrain tTrain);
    boolean delete(TTrain tTrain);
    List<TTrain> getAll();
    TTrain getById(TTrain tTrain);

}
