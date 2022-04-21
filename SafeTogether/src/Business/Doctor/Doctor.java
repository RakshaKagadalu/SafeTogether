/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Doctor;

import Business.Roles.DoctorRole;
import Business.UserAcc.UserAcc;


/**
 *
 * @author raksh
 */
public class Doctor extends UserAcc {
    String userId;
     String accPassword;
    String firstName;
    String specialization;
    String phoneNum;
    String hospital;

    public Doctor(String userId, String accPassword, String firstName, String specialization, String phoneNum, String hospital) {
        setUserName(userId);
        setPwd(accPassword);
        setRole(new DoctorRole());
        this.userId = userId;
        this.accPassword = accPassword;
        this.firstName = firstName;
        this.specialization = specialization;
        this.phoneNum = phoneNum;
        this.hospital = hospital;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

 
    
}
