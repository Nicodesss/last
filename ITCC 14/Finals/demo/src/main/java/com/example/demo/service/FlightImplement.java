package com.grouph.flightairlineapi.service;


import com.grouph.flightairlineapi.collection.Flight;
import com.grouph.flightairlineapi.repository.FlightRepo;
import org.springframework.stereotype.Service;

@Service
public class FlightImplement implements FlightService{

    private FlightRepo flightRepo;
    @Override
    public String save(Flight flight) {
        return flightRepo.save(flight).getFlight_ID();
    }
}
