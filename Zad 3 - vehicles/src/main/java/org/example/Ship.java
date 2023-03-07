package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Ship implements Vehicle {

    private String brand;
    private double maxSpeed;

    public String getType() {return "SHIP";}

    public String getBrand() {return brand;}

    public double getMaxSpeed() {return maxSpeed;}

}
