package com.example.demo.service;


import com.example.demo.collection.Flight;
import com.example.demo.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightImplement implements FlightService{

    @Autowired
    private FlightRepo flightRepo;
    @Override
    public String save(Flight flight) {
        return flightRepo.save(flight).getFlightId();
    }

    @Override
    public void delete(String id) {
        flightRepo.deleteById(id);
    }

    @Override
    public String findOne(String id) {
        return flightRepo.findFlightByFlightId(id);
    }

//    @Override
//    public String getByDepDate(String depDate) {
//        return flightRepo.findFlightByDepartureDate(depDate);
//    }

    @Override
    public List<Flight> allFlights() {
        return flightRepo.findAll();
    }

    @Override
    public List<Flight> getByDepartureDate(String depDate) {
        return flightRepo.findAllByDepartureDate(depDate);
    }

    @Override
    public List<Flight> getCancelled(Boolean getCancelled) {
        return flightRepo.findAllByCancelled(getCancelled);
    }


//    @Override
//    public String getAll(String getAll) {
//        return null;
//    }


}
