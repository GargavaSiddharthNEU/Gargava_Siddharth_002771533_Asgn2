/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctors;
    
    
    public DoctorDirectory() {
        this.doctors = new ArrayList<Doctor>();
    }
    
    public void addDoctor(Doctor newDoctor){
        
        doctors.add(newDoctor);
        
        
    }
    
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    
}
