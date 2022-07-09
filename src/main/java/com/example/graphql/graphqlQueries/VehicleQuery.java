package com.example.graphql.graphqlQueries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.models.Vehicle;
import com.example.graphql.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    private VehicleService vehicleService;


    @Autowired
    public VehicleQuery(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.findAll(count);
    }
    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.findById(id);
    }



}

