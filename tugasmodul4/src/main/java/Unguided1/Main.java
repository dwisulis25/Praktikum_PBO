/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

import Unguided.entities.Appointment;
import Unguided.entities.Doctor;
import Unguided.entities.Patient;
import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class Main {
     public static void main(String[] args) {
        Doctor doc1 = new Doctor("D001", "Dr. Andi", "Cardiology");
        Patient pat1 = new Patient("P001", "Budi Santoso", 30);
        
        Appointment appointment = new Appointment(doc1, pat1, LocalDate.of(2025, 3, 20));
        appointment.displayInfo();
    }
    
}
