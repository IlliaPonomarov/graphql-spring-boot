package com.example.graphql.services;


import com.example.graphql.graphqlQueries.VehicleQuery;
import com.example.graphql.models.Vehicle;
import com.example.graphql.repositories.VehicelRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    private VehicelRepositories vehicelRepositories;

    @Autowired
    public VehicleService(VehicelRepositories vehicelRepositories) {
        this.vehicelRepositories = vehicelRepositories;
    }
}
