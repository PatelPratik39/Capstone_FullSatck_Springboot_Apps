package com.travel_management;

import com.travel_management.model.Booking;
import com.travel_management.repository.BookingRepository;
import com.travel_management.service.BookingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TravelManagementApplicationTests {

	@Test
	void contextLoads() {
	}

}
