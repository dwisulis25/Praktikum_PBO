/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author LENOVO
 */
public class Transmission {
    private String type;
    private int gears;
    
    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }
    
    public String getType() {
        return type;
    }
    
    public int getGears() {
        return gears;
    }
}
    
