package com.example.Movie_Ticket_Booking.Repository;

import com.example.Movie_Ticket_Booking.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MovieRepository extends JpaRepository<Movie , Long> {
}
