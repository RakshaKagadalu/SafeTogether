/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Laboratory;
import Business.UserAcc.UserAcc;
import java.util.*;

/**
 *
 * @author shrikrishnajoisa
 */
public class BloodWork extends UserAcc{
    // Blood work class for the hospitals
    
     Map<String, Integer> labMap = new HashMap<String, Integer>();
     String userId;
    String password;
    String userNames;
    String userLocation;
    String userPhone;
   
       
    public BloodWork(String userNames, String userLocation, String userPhone, String userId, String password) {
        setUserName(userNames);
        setPwd(password);
        this.userNames = userNames;
        this.userLocation = userLocation;
        this.userPhone = userPhone;
        this.userId = userId;
        this.password = password;
    }
    
    // Generate the getter and setter method the variables
    public String getUserNames() {
        return userNames;
    }

    public void setUserNames(String userName) {
        this.userNames = userName;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

   
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Integer> getLabMap() {
        return labMap;
    }

    public void setLabMap(Map<String, Integer> labMap) {
        this.labMap = labMap;
    }

 

}
