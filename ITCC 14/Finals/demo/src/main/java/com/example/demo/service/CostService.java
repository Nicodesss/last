package com.example.demo.service;

import com.example.demo.collection.Cost;

import java.util.List;

public interface CostService {
    List<Cost> getEconomyPrice(String flightId);
}
