package com.example.graphql.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    private String type;

    @Column(name = "model_code", nullable = false)
    private String modelCode;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "launch_date")
    private LocalDate launchDate;
    private transient  String formattedDate;

    public Vehicle(String type, String modelCode, String brandName, LocalDate launchDate) {
        this.type = type;
        this.modelCode = modelCode;
        this.brandName = brandName;
        this.launchDate = launchDate;
    }

    // Getter and setter
    public String getFormattedDate() {
        return getLaunchDate().toString();
    }

}
