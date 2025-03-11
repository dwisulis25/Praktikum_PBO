/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author LENOVO
 */
public class Car {
    private String brand;
    private String color;
    private int year;
    private Engine engine;
    private Transmission transmission;
    
    public Car(String brand, String color, int year, Engine engine, Transmission transmission) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.transmission = transmission;
    }
    
    public void showCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Engine Type: " + engine.getType() + ", Horsepower: " + engine.getHorsepower());
        System.out.println("Transmission Type: " + transmission.getType() + ", Gears: " + transmission.getGears());
    }
}
