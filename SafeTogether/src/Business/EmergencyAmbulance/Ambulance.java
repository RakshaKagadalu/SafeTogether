/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmergencyAmbulance;

import Business.Roles.Driver_Ambulance;
import Business.UserAcc.UserAcc;

/**
 *
 * @author raksh
 */
public class Ambulance extends UserAcc {
   
    String user_Id;
    String pwd;
    String ambulanceServName;
    String nameDriver;
    String phNum;

    public Ambulance(String user_Id, String pwd, String ambulanceServName, String nameDriver, String phNum, String firstName, String lastName, String email, String phoneNumber, String userId, String password, String location) {
        
        this.user_Id = user_Id;
        this.pwd = pwd;
        this.ambulanceServName = ambulanceServName;
        this.nameDriver = nameDriver;
        this.phNum = phNum;
        setUserName(user_Id);
        setPwd(pwd);
        setRole(new Driver_Ambulance());
    }

    public String getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAmbulanceServName() {
        return ambulanceServName;
    }

    public void setAmbulanceServName(String ambulanceServName) {
        this.ambulanceServName = ambulanceServName;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }



    
}
