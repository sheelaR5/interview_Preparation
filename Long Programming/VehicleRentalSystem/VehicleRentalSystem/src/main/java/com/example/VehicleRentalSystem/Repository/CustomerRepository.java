package com.example.VehicleRentalSystem.Repository;


import com.example.VehicleRentalSystem.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}