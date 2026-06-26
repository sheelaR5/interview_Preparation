package com.example.VehicleRentalSystem.Service;



import com.example.VehicleRentalSystem.Entity.Vehicle;
import com.example.VehicleRentalSystem.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    public List<Vehicle> getAllVehicles() {
        return repository.findAll();
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    public Vehicle getVehicleById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteVehicle(Long id) {
        repository.deleteById(id);
    }
}