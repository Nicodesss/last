package com.example.demo.service;

import com.example.demo.collection.Cost;
import com.example.demo.repository.CostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostImplement implements CostService{


    @Autowired
    private CostRepo costRepo;

    @Override
    public List<Cost> getEconomyPrice(String flightId) {
        return costRepo.findCostByFlightId(flightId);
    }
}
