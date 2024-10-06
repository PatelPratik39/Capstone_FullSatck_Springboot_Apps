package com.travel_management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FareRequest {

    private int numberOfTravelers;
    private double distance;
    private int cabType;
}
