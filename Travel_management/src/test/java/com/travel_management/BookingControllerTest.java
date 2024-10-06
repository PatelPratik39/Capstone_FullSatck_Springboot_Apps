package com.travel_management;


import com.travel_management.model.FareRequest;
import com.travel_management.model.FareResponse;
import com.travel_management.service.FareCalculationService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BookingControllerTest {

    private FareCalculationService fareCalculationService;

    public void setFareCalculationService(FareCalculationService fareCalculationService) {
        this.fareCalculationService = fareCalculationService;
    }

    @PostMapping("/api/fare/calculate")
    public ResponseEntity<FareResponse> calculateFare(@RequestBody FareRequest fareRequest) {
        double fare = fareCalculationService.calculateFare(
                fareRequest.getNumberOfTravelers(),
                fareRequest.getDistance(),
                fareRequest.getCabType()
        );

        return ResponseEntity.ok(new FareResponse(fare));
    }
}
