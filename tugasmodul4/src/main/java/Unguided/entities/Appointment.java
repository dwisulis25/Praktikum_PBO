/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class Appointment {
    private final Doctor doctor;
    private final Patient patient;
    private final LocalDate date;
    
    public Appointment(Doctor doctor, Patient patient, LocalDate date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }
    
    public void displayInfo() {
        System.out.println("Appointment Details:");
        System.out.println("Date: " + date);
        doctor.displayInfo();
        patient.displayInfo();
    }
    
}
