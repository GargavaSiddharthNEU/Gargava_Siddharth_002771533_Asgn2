/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author siddh
 */
public class Hospital {
    private String HospitalID;
    private String HospitalName;
    //private String Community;
    private DoctorDirectory doctorDirectory;
    private String hospitalAddress;

    public Hospital(String HospitalID, String HospitalName, DoctorDirectory doctorDirectory, String hospitalAddress) {
        this.HospitalID = HospitalID;
        this.HospitalName = HospitalName;
        this.doctorDirectory = doctorDirectory;
        this.hospitalAddress = hospitalAddress;
    }
    
    
    public Hospital() {
        this.doctorDirectory = new DoctorDirectory();
    }
    
    
    public String getHospitalID() {
        return HospitalID;
    }

    public void setHospitalID(String HospitalID) {
        this.HospitalID = HospitalID;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

//    public String getCommunity() {
//        return Community;
//    }
//
//    public void setCommunity(String Community) {
//        this.Community = Community;
//    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }
    
}
