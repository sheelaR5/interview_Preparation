package com.example.VehicleRentalSystem.Service;


import com.example.VehicleRentalSystem.Entity.Booking;
import com.example.VehicleRentalSystem.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repository;

    public List<Booking> getAllBookings() {
        return repository.findAll();
    }

    public Booking saveBooking(Booking booking) {
        return repository.save(booking);
    }

    public Booking getBookingById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteBooking(Long id) {
        repository.deleteById(id);
    }
}
