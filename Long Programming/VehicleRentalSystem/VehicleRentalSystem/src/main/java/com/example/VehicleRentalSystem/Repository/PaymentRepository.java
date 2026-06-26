package com.example.VehicleRentalSystem.Repository;

import com.example.VehicleRentalSystem.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;



    public interface PaymentRepository extends JpaRepository<Payment, Long> {
    }

