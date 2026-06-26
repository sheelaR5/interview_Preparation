package com.example.VehicleRentalSystem.Repository;


import com.example.VehicleRentalSystem.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}