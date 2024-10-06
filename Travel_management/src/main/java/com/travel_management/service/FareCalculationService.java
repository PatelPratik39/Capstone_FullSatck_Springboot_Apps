package com.travel_management.service;

import org.springframework.stereotype.Service;

@Service
public class FareCalculationService {

    public double calculateFare(int numberOfTravelers, double distance, int cabType) {
        double fare;

        // Validate cab type
        switch (cabType) {
            case 1: // Sedan
                fare = distance * 10; // Example calculation
                break;
            case 2: // SUV
                fare = distance * 15; // Example calculation
                break;
            case 3: // Luxury
                fare = distance * 20; // Example calculation
                break;
            default:
                throw new IllegalArgumentException("Invalid cab type");
        }

        // Add additional fare calculations based on the number of travelers
        fare *= numberOfTravelers;

        return fare;
    }


//    private static final double BASE_RATE_PER_KM = 10.0;

//    public double calculateFare(int numberOfTravelers, double distance) {
//        return BASE_RATE_PER_KM * distance;
//    }
}
