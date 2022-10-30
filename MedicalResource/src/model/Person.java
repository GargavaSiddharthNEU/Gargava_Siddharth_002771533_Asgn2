/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author siddh
 */
public class Person {
    private Long personId;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private int age;
    private Long phoneNumber;
    private House house;
//    private Boolean isPatient;
//    private Boolean isDoctor;
    private String roleType;
    private String assHospital;
    private String assCommunity;

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    
//
//    public Boolean getIsPatient() {
//        return isPatient;
//    }
//
//    public void setIsPatient(Boolean isPatient) {
//        this.isPatient = isPatient;
//    }

    public String getAssHospital() {
        return assHospital;
    }

    public void setAssHospital(String assHospital) {
        this.assHospital = assHospital;
    }

    public String getAssCommunity() {
        return assCommunity;
    }

    public void setAssCommunity(String assCommunity) {
        this.assCommunity = assCommunity;
    }
}
