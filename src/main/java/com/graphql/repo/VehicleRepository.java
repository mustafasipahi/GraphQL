package com.graphql.repo;

import com.graphql.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> getByVehicleTypeLike(String type);
}
