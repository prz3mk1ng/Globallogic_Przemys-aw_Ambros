package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Plane implements Vehicle {

    private String brand;
    private double maxSpeed;

    public String getType() {return "PLANE";}

    public String getBrand() {return brand;}

    public double getMaxSpeed() {return maxSpeed;}

}