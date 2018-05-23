package edu.uestc.ssmdemo.service;

import edu.uestc.ssmdemo.entity.Producerinfo;

import java.util.List;

public interface ProducerService {
    Producerinfo login(Producerinfo producer);

    String register(Producerinfo producer);

    List<Producerinfo> getListPro();

    void deleteById(Long aLong);

    List<Producerinfo> findBynameOrPhone(Producerinfo producer);
}
