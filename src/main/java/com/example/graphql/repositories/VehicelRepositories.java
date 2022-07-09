package com.example.graphql.repositories;

import com.example.graphql.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicelRepositories extends JpaRepository<Vehicle, Integer> {
}
