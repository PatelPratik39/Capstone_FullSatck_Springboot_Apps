package com.travel_management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FareResponse {

    private double fare;

    public FareResponse(double fare) {
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }
}
