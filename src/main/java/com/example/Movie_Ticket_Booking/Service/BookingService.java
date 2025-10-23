package com.example.Movie_Ticket_Booking.Service;

import com.example.Movie_Ticket_Booking.Repository.BookingRepository;
import com.example.Movie_Ticket_Booking.model.Booking;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public  Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
}

