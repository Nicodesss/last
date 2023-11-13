package com.example.demo.repository;

import com.example.demo.collection.Cost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostRepo extends MongoRepository<Cost, String> {

    List<Cost> findCostByFlightId(String flightId);
}
