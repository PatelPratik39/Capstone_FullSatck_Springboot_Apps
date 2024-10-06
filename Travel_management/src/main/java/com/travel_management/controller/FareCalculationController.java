package com.travel_management.controller;

import com.travel_management.model.FareRequest;
import com.travel_management.model.FareResponse;
import com.travel_management.service.FareCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/fare")
public class FareCalculationController {

    @Autowired
    private final FareCalculationService fareCalculationService;

    public FareCalculationController(FareCalculationService fareCalculationService) {
        this.fareCalculationService = fareCalculationService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<Map<String, Double>> calculateFare(@RequestBody FareRequest fareRequest) {
        double fare = fareCalculationService.calculateFare(
                fareRequest.getNumberOfTravelers(),
                fareRequest.getDistance(),
                fareRequest.getCabType()
        );

        Map<String, Double> response = new HashMap<>();
        response.put("fare", fare);
        return ResponseEntity.ok(response);
    }


//    @PostMapping("/calculate")
//    public ResponseEntity<FareResponse> calculateFare(@RequestBody FareRequest fareRequest) {
//        double fare = fareCalculationService.calculateFare(fareRequest.getNumberOfTravelers(), fareRequest.getDistance());
//        return ResponseEntity.ok(new FareResponse(fare));
//    }
}

