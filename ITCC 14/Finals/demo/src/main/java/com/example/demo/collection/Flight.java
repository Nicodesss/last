package com.example.demo.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


import java.util.List;

@Data
@Builder
@Document(collection ="flights")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Flight {

    @Id
    private String flightId;
    private String departureAirport;
    private String destinationAirport;
    private String departureDate;
    private String departureTime;
    private String arrivalTime;
    private String returnDate;
    private String flightDuration;
    private String delayTime;
    private Boolean cancelled;
    private Boolean isFinished;

    private List<PassengersMap> passengersMaps;


    private List<Moved> ifMoved;

    private List<Cost> cost;
}
