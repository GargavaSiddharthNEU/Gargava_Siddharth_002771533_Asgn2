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
public class PatientDirectory {
    private ArrayList<Patient> patients;
   
    public PatientDirectory() {
        this.patients = new ArrayList<>();
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    public void addPatients(Patient patient) {
        this.patients.add(patient);
    }

    public void deletePatientEncounter(Patient patientObj, int encounterIndex) {
        int index = 0;
        for (Patient pa : this.patients) {
            if (pa.getName().equals(patientObj.getName())) {
                pa.getEncounterHistory().getEncounters().remove(encounterIndex);
                break;
            }
            index++;
        }
    }

    public void updatePatients(Patient patient, int index) {
        this.patients.set(index, patient);
    }
}
