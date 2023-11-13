package com.example.demo.controller;


import com.example.demo.collection.Cost;
import com.example.demo.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cost")
public class CostController {

    @Autowired
    private CostService costService;


    @GetMapping("/{flightId}")
    public List<Cost> getEconomyPriceById(@RequestParam String flightId){
        return costService.getEconomyPrice(flightId);

    }



}
