package com.example.demo.collection;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cost {

    private String flightId;
    private int economy;
    private int business;
    private int first;
}
