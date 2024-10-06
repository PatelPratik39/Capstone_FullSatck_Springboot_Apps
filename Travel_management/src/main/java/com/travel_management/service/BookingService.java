package com.travel_management.service;

import com.travel_management.model.Booking;
import com.travel_management.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking bookCab(Booking booking) {
        // Save booking to the database
        return bookingRepository.save(booking);
    }
}
