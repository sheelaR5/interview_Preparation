package com.example.VehicleRentalSystem.Repository;


import com.example.VehicleRentalSystem.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}