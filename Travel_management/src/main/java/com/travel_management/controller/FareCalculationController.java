package com.travel_management.controller;

import com.travel_management.model.FareRequest;
import com.travel_management.model.FareResponse;
import com.travel_management.service.FareCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fare")
public class FareCalculationController {

    @Autowired
    private final FareCalculationService fareCalculationService;

    public FareCalculationController(FareCalculationService fareCalculationService) {
        this.fareCalculationService = fareCalculationService;
    }

    @PostMapping("/calculate")
    public FareResponse calculateFare(@RequestBody FareRequest request) {
        double fare = fareCalculationService.calculateFare(request.getNumberOfTravelers(), request.getDistance(), request.getCabType());
        return new FareResponse(fare);
    }

//    @PostMapping("/calculate")
//    public ResponseEntity<FareResponse> calculateFare(@RequestBody FareRequest fareRequest) {
//        double fare = fareCalculationService.calculateFare(fareRequest.getNumberOfTravelers(), fareRequest.getDistance());
//        return ResponseEntity.ok(new FareResponse(fare));
//    }
}

