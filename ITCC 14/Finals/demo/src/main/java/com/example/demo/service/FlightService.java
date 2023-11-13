package com.example.demo.service;

import com.example.demo.collection.Flight;

import java.util.List;
import java.util.Optional;

public interface FlightService {
    String save(Flight flight);

    void delete(String id);

    String findOne (String id);

//    String getByDepDate(String depDate);

    List<Flight> allFlights();

    List<Flight> getByDepartureDate(String depDate);

    List<Flight> getCancelled(Boolean getCancelled);

}
