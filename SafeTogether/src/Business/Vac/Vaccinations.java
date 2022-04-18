/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Vac;

import Business.UserAcc.UserAcc;
import java.util.logging.Logger;

/**
 *
 * @author shrikrishnajoisa
 */
public class Vaccinations extends UserAcc {
    
    String userID;
    String pwd;
    String phoneNumber;
    String location;
    String name;

    public Vaccinations(String name, String phoneNumber, String location, String userID, String pwd) {
        setUserName(userID);
        setPwd(pwd);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.userID = userID;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

  
    
    
    
       
}
