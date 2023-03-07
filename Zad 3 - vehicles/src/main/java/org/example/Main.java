package org.example;


import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VehicleRepositoryImpl repository = new VehicleRepositoryImpl();
        Map<String, List<Vehicle>> vehicles = repository.getSampleVehicles();


        while (true) {
            log.info("Wybierz opcję (CAR, SHIP, PLANE, BICYCLE, ALL, EXIT):");
            String option = scanner.nextLine().toUpperCase();

            if (option.equals("ALL")) {
                for (Map.Entry<String, List<Vehicle>> entry : vehicles.entrySet()) {
                    log.info("Najszybszy pojazd typu " + entry.getKey() + " to:");
                    Vehicle fastestVehicle = getFastestVehicle(entry.getValue());
                    log.info("Pojazd " + fastestVehicle.getType() + " producenta " + fastestVehicle.getBrand()
                            + " (maksymalna prędkość: " + fastestVehicle.getMaxSpeed() + ")");
                }
            }

            else if (vehicles.containsKey(option)) {
                log.info("Najszybszy pojazd typu " + option + " to:");
                Vehicle fastestVehicle = getFastestVehicle(vehicles.get(option));
                log.info("Pojazd " + fastestVehicle.getType() + " producenta " + fastestVehicle.getBrand()
                        + " (maksymalna prędkość: " + fastestVehicle.getMaxSpeed() + ")");
            }

            else if (option.equals("EXIT")){
                break;
            }

            else {
                log.info("Podaj prawidłową opcję.");
            }
        }
    }

    private static Vehicle getFastestVehicle(List<Vehicle> vehicles) {
        Vehicle fastestVehicle = vehicles.get(0);
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMaxSpeed() > fastestVehicle.getMaxSpeed()) {
                fastestVehicle = vehicle;
            }
        }
        return fastestVehicle;
    }
}