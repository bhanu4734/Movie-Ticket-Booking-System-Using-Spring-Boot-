package com.example.Movie_Ticket_Booking.Repository;

import com.example.Movie_Ticket_Booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
