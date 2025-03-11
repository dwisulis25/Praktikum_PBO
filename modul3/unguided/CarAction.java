/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author LENOVO
 */
public class CarAction {
    public static void main(String[] args) {
        Engine engine1 = new Engine("V6", 320);
        Transmission transmission1 = new Transmission("Manual", 6);
        Car car1 = new Car("Toyota Supra", "Red", 2023, engine1, transmission1);
        
        System.out.println("Car Details:");
        car1.showCarDetails();
    }
}
    
