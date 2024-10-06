package com.travel_management.controller;

import com.travel_management.model.BookingRequest;
import com.travel_management.model.BookingResponse;
import com.travel_management.model.FareRequest;

import com.travel_management.service.FareCalculationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @PostMapping("/cab/book")
    public BookingResponse bookCab(@RequestBody BookingRequest bookingRequest) {
        // Logic for booking the cab goes here
        // Example: Booking logic, fetching details, etc.

        // For demonstration, we're assuming the booking is successful
        String from = bookingRequest.getFrom();
        String to = bookingRequest.getTo();
        int typeOfCab = bookingRequest.getTypeOfCab();

        // Create a response message
        String message = "Luxury Cab Booked From " + from + " to " + to;

        // Return the response with a success code and message
        return new BookingResponse(1, message);
    }

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
