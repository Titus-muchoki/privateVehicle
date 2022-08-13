package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static <Vehicle> void main(String[] args){
        boolean programRunning = true;

        Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
        Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
        Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
        Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
        Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

        ArrayList<Vehicle> allVehicles = new ArrayList<Vehicle>();

        allVehicles.add(hatchback);
        allVehicles.add(suv);
        allVehicles.add(sedan);
        allVehicles.add(truck);
        allVehicles.add(crossover);
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to our car dealership. What would you like to do? Enter one of the following options: All Vehicles, Search Price, Add Vehicle, or Exit");

            try {

                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("All Vehicles")) {
                    for (Vehicle individualVehicle : allVehicles) {
                        System.out.println("----------------------");
                        System.out.println(individualVehicle.getClass());
                        System.out.println(individualVehicle.getClass());
                        System.out.println(individualVehicle.getClass());
                        System.out.println(individualVehicle.getClass());
                        System.out.println(individualVehicle.getClass());
                    }
                } else if (navigationChoice.equals("Search Price")) {
                    System.out.println("What is your maximum budget for a vehicle?");
                    String stringUserMaxBudget = bufferedReader.readLine();
                    int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
                    System.out.println("Alright, here's what we have in your price range:");
                    for (Vehicle individualVehicle : allVehicles) {
                        if (individualVehicle.getClass(userMaxBudget)) {
                            System.out.println("----------------------");
                            System.out.println(individualVehicle.getClass());
                            System.out.println(individualVehicle.getClass());
                            System.out.println(individualVehicle.getClass());
                            System.out.println(individualVehicle.getClass());
                            System.out.println(individualVehicle.getClass());
                        }
                    }
                } else if (navigationChoice.equals("Add Vehicle")) {
                    System.out.println("Alright, let's add a vehicle! What getYear() was this vehicle made?");
                    int userVehicleYear = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Great! What make or getBrand() is the vehicle?");
                    String userVehicleBrand = bufferedReader.readLine();
                    System.out.println("Got it! What getModel is it?");
                    String userVehicleModel = bufferedReader.readLine();
                    System.out.println("And how many getMiles() does it have on it?");
                    int userVehicleMiles = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Finally, what's its price?");
                    int userVehiclePrice = Integer.parseInt(bufferedReader.readLine());
                    Vehicle userVehicle = new Vehicle(userVehicleYear, userVehicleBrand, userVehicleModel, userVehicleMiles, userVehiclePrice);
                    allVehicles.add(userVehicle);

                    System.out.println("Alright, here's your new vehicle:");
                    System.out.println("----------------------");
                    System.out.println(userVehicle.getClass());
                    System.out.println(userVehicle.getClass());
                    System.out.println(userVehicle.getClass());
                    System.out.println(userVehicle.getClass());
                    System.out.println(userVehicle.getClass());
                } else if (navigationChoice.equals("Exit")){
                    System.out.println("Goodbye!");
                    programRunning = false;

                }
                else {
                    System.out.println("I'm sorry, we don't recognize your input");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
    
