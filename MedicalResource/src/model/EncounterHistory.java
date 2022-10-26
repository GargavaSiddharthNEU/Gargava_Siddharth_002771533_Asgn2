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
public class EncounterHistory {
    
    private ArrayList<Encounter> encounters;
    
    public EncounterHistory() {
        this.encounters = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(ArrayList<Encounter> encounters) {
        this.encounters = encounters;
    }
    
    public void addEncounters(Encounter enc) {
        this.encounters.add(enc);
    }

    public void updateEncounters(Encounter enc, int index) {
        this.encounters.set(index, enc);
    }
}
