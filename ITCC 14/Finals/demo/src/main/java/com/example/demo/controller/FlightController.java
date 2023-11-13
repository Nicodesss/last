package com.example.demo.controller;


import com.example.demo.collection.Flight;
import com.example.demo.repository.FlightRepo;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FlightController {


    @Autowired
    private FlightService flightService;

    @PostMapping
    public String save(@RequestBody Flight flight) {
        return flightService.save(flight);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        flightService.delete(id);
    }


    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public String getFLightById(@PathVariable("id") String id){
        return flightService.findOne(id);
    }

    @GetMapping("flights/departuredate")
   public List<Flight> getByDeptDate(@RequestParam String depDate){
        return flightService.getByDepartureDate(depDate);
   }

    @GetMapping("/flights")
    public ResponseEntity<List<Flight>> getAllFlight(){
        return new ResponseEntity<>(flightService.allFlights(), HttpStatus.OK);
    }

    @GetMapping("/cancelled")
    public List<Flight> getAllCancelled(@RequestParam Boolean getCancelled){
        return flightService.getCancelled(getCancelled);
    }


//    @GetMapping
//    public List<Flight> getAllMoved(@RequestParam Boolean getMoved){
//        return flightService.getMoved(getMoved);
//    }

}

// TODO
/* get all cancelled flights
*  get all moved flights
*  add search params queries
*           includes most params
*
*
*
*
*
* */