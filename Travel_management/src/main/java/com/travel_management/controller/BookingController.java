package com.travel_management.controller;

import com.travel_management.model.FareRequest;

import com.travel_management.service.FareCalculationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private FareCalculationService fareCalculationService;

    @PostMapping("/calculate")
    public ResponseEntity<Map<String, Double>> calculateFare(@RequestBody FareRequest fareRequest) {
        double fare = fareCalculationService.calculateFare(fareRequest.getNumberOfTravelers(),
                fareRequest.getDistance(), fareRequest.getCabType());

        Map<String, Double> response = new HashMap<>();
        response.put("fare", fare);
        return ResponseEntity.ok(response);
    }

//    private final BookingService bookingService;
//    private final FareCalculationService fareCalculationService;
//
//    @Autowired
//    public BookingController(BookingService bookingService, FareCalculationService fareCalculationService) {
//        this.bookingService = bookingService;
//        this.fareCalculationService = fareCalculationService;
//    }
//
//    @PostMapping
//    public ResponseEntity<FareResponse> calculateFare(@RequestBody FareRequest fareRequest) {
//        double fare = fareCalculationService.calculateFare(
//                fareRequest.getNumberOfTravelers(),
//                fareRequest.getDistance(),
//                fareRequest.getCabType() // Make sure to pass cabType
//        );
//
//        return ResponseEntity.ok(new FareResponse(fare));
//    }

}
