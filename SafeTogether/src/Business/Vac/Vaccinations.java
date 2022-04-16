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

    String name;

    public Vaccinations(String name, String phoneNumber, String location, String userID, String password) {
        setUserName(userID);
        setPwd(password);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.userID = userID;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }
    
    String phoneNumber;
    String location;
    String userID;
    String password;
       
}
