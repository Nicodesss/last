package com.example.demo.collection;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengersMap {

    private int adultPassengers;
    private int childrenPassengers;
    private int infantPassengers;
    private int availableSeats;
    private int occupiedSeats;
}
