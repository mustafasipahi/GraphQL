package com.graphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.dto.VehicleDto;
import com.graphql.entity.Vehicle;
import com.graphql.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDto vehicleDto) {
        return vehicleRepository.save(convert(vehicleDto));
    }

    private Vehicle convert(VehicleDto vehicleDto) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrandName(vehicleDto.getBrandName());
        vehicle.setLaunchDate(new Date());
        vehicle.setModelCode(vehicleDto.getModelCode());
        vehicle.setVehicleType(vehicleDto.getVehicleType());
        return vehicle;
    }
}
