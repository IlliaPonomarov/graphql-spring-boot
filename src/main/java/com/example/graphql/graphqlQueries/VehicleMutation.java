package com.example.graphql.graphqlQueries;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.models.Vehicle;
import com.example.graphql.services.VehicleService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleMutation(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public Vehicle save(final String type, final String modelCode, final String brandName, final LocalDate launchDate){
        Vehicle vehicle = new Vehicle(type, modelCode, brandName, launchDate);

        return vehicleService.save(vehicle);
    }


}
