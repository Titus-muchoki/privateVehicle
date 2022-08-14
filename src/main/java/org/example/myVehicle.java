package org.example;

import java.util.Scanner;

public class  myVehicle{
    private int year;
    private String brand;
    private String model;
    private int kilometers;
    private  int price;
    public myVehicle(int year, int brand, int model, int kilometers, int price){
        this.year = year;
        this.brand= String.valueOf(brand);
        this.model = String.valueOf(model);
        this.kilometers = kilometers;
        this.price = price;

    }

    public myVehicle(int year, String subaru, String legacy, int kilometers, int price) {
    }


    public String setBrand(String brand){
        return brand;
    }
    public int setPrice(int price){
        return price;
    }
    public boolean worthBuying(int maxPrice){
        return (price < maxPrice);
    }
    public int getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
 public int getKilometers(){
        return kilometers;
 }
}
