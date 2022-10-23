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
public class PersonDirectory {
    private ArrayList<Person> persons;
    private Long updatedDateTime;
    
    public PersonDirectory() {
        this.persons = new ArrayList<Person>();
    }
    
    public Person addPersons(){
        Person person = new Person();
        persons.add(person);
        
        return person;
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public Long getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Long updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }
}
