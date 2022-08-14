package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static  void main(String[] args){
        boolean programRunning = true;

        myVehicle hatchback = new myVehicle(1994, "Subaru", "Legacy", 170000, 4000);
        myVehicle suv = new myVehicle(2002, "Ford", "Explorer", 100000, 7000);
        myVehicle sedan = new myVehicle(2015, "Toyota", "Camry", 50000, 30000);
        myVehicle truck = new myVehicle(1999, "Ford", "Ranger", 100000, 4000);
        myVehicle crossover = new myVehicle(1998, "Toyota", "Rav-4", 200000, 3500);

        ArrayList<myVehicle> allVehicles = new ArrayList<myVehicle>();

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
                    for (myVehicle individualVehicle : allVehicles) {
                        System.out.println("----------------------");
                        System.out.println(individualVehicle.getYear());
                        System.out.println(individualVehicle.getBrand());
                        System.out.println(individualVehicle.getModel());
//                        System.out.println(individualVehicle.getMiles());
                        System.out.println(individualVehicle.getPrice());
                    }
                } else if (navigationChoice.equals("Search Price")) {
                    System.out.println("What is your maximum budget for a vehicle?");
                    String stringUserMaxBudget = bufferedReader.readLine();
                    int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
                    System.out.println("Alright, here's what we have in your price range:");
                    for (myVehicle individualVehicle : allVehicles) {
                        if (individualVehicle.worthBuying(userMaxBudget)) {
                            System.out.println("----------------------");
                            System.out.println(individualVehicle.getYear());
                            System.out.println(individualVehicle.getBrand());
                            System.out.println(individualVehicle.getModel());
//                            System.out.println(individualVehicle.getMiles());
                            System.out.println(individualVehicle.getPrice());
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
                    myVehicle userVehicle = new myVehicle(userVehicleYear, userVehicleBrand, userVehicleModel, userVehicleMiles, userVehiclePrice);
                    allVehicles.add(userVehicle);

                    System.out.println("Alright, here's your new vehicle:");
                    System.out.println("----------------------");
                    System.out.println(userVehicle.getYear());
                    System.out.println(userVehicle.getBrand());
                    System.out.println(userVehicle.getModel());
//                    System.out.println(userVehicle.getMiles());
                    System.out.println(userVehicle.getPrice());
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
    
