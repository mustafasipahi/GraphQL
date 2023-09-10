package com.graphql.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.entity.Vehicle;
import com.graphql.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {

    private final VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicles(String type) {
        return vehicleRepository.getByVehicleTypeLike(type);
    }

    public Optional<Vehicle> getById(Long id) {
        return vehicleRepository.findById(id);
    }
}
