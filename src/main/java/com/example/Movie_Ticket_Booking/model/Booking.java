package com.example.Movie_Ticket_Booking.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String CustomerName;
    private int seats;

    @ManyToOne
    private Movie movie;

    private String showTime;

    public String getShowTime() { return showTime; }
    public void setShowTime(String showTime) { this.showTime = showTime; }


    @ElementCollection
    private java.util.List<String> seatNumbers;

    public java.util.List<String> getSeatNumbers() {
        return seatNumbers;
    }
    public void setSeatNumbers(java.util.List<String> seatNumbers) {
        this.seatNumbers = seatNumbers;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
