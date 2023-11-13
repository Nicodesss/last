package com.example.demo.repository;

import com.example.demo.collection.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepo extends MongoRepository<Flight, String> {

      String findFlightByFlightId(String id);

      List<Flight> findAllByDepartureDate(String depDate);

      List<Flight> findAllByCancelled(Boolean getCancelled);



}
