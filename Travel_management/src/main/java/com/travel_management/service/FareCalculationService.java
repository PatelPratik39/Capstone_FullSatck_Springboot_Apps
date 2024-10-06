package com.travel_management.service;

import org.springframework.stereotype.Service;

@Service
public class FareCalculationService {

    public double calculateFare(int numberOfTravelers, double distance, int cabType) {
        double baseFare;

        switch (cabType) {
            case 1:
                baseFare = 10.0; // Example fare for cab type 1
                break;
            case 2:
                baseFare = 15.0; // Example fare for cab type 2
                break;
            case 3:
                baseFare = 20.0; // Example fare for cab type 3
                break;
            default:
                throw new IllegalArgumentException("Invalid cab type"); // This will be triggered if the cabType is not valid
        }

        return baseFare * distance * numberOfTravelers; // Example fare calculation
    }



//    private static final double BASE_RATE_PER_KM = 10.0;

//    public double calculateFare(int numberOfTravelers, double distance) {
//        return BASE_RATE_PER_KM * distance;
//    }
}
