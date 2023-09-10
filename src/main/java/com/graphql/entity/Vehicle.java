package com.graphql.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "vehicle")
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "model_code")
    private String modelCode;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "launch_date")
    private Date launchDate;
}
