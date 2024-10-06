package com.travel_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pickupLocation;
    private String dropoffLocation;
    private LocalDateTime dateTime;
    private int numberOfTravelers; // Added field for number of travelers
    private double distance; // Added field for distance
    private double fare; // Added field for fare calculation

}
