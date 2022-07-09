package com.example.graphql.services;


import com.example.graphql.graphqlQueries.VehicleQuery;
import com.example.graphql.models.Vehicle;
import com.example.graphql.repositories.VehicelRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;
import java.util.stream.Collectors;


@Service
@Transactional(readOnly = true)
public class VehicleService {

    private VehicelRepositories vehicelRepositories;

    @Autowired
    public VehicleService(VehicelRepositories vehicelRepositories) {
        this.vehicelRepositories = vehicelRepositories;
    }

    public List<Vehicle> findAll(final int count){
        return vehicelRepositories.findAll()
                .stream()
                .limit(count)
                .collect(Collectors.toList());
    }

    public Optional<Vehicle> findById(int id){
        return vehicelRepositories.findById(id);
    }


    @Transactional
    public Vehicle save(Vehicle vehicle) {
        return this.vehicelRepositories.save(vehicle);
    }
}
