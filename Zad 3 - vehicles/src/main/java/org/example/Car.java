package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car implements Vehicle {

    private String brand;
    private double maxSpeed;

    public String getType() {return "CAR";}

    public String getBrand() {return brand;}

    public double getMaxSpeed() {return maxSpeed;}

}

