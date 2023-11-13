package com.example.demo.collection;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
@Builder
public class Moved {
    private Boolean isMoved;
    private String depDate;
    private String rtnDate;
    private String depTime;
    private String arrTime;
}
