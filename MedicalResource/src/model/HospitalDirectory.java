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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitals;
    
    
    public HospitalDirectory() {
        this.hospitals = new ArrayList<Hospital>();
    }

     public void addHospital(Hospital newHospital){
        
        hospitals.add(newHospital);
        
    }
    
    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
    
    public void deleteHospital(Hospital hospitalObj) {
       this.hospitals.remove(hospitalObj);
    }

    public void updateHospital(Hospital hospital, int index) {
        this.hospitals.set(index, hospital);
    }
    
}
