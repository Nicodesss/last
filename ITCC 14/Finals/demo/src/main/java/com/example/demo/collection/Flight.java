package com.grouph.flightairlineapi.collection;

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
    private String flight_ID;
    private String departure_airport;
    private String destination_airport;
    private String departure_date;
    private String departure_time;
    private String arrival_time;
    private String return_date;
    private String flight_duration;
    private String delay_time;
    private Boolean cancelled;
    private Boolean isFinished;
    private Boolean isMoved;
    private int adult_passengers;
    private int children_passengers;
    private int infant_passengers;
    private int available_seats;
    private int occupied_seats;
    private int economy_class_price;
    private int business_class_price;
    private int first_class_price;

//    private List<Review> reviewId;
    @DocumentReference
    private List<Moved> ifMoved;
}
