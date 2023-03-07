package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bicycle implements Vehicle{

    private String brand;
    private double maxSpeed;

    public String getType() {return "BICYCLE";}

    public String getBrand() {return brand;}

    public double getMaxSpeed() {return maxSpeed;}

}
