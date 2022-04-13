/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Blood;
import java.util.*;

/**
 *
 * @author shrikrishnajoisa
 */
public class BloodWork {
    // Blood work class for the hospitals
    String userName;
    String userLocation;
    String userPhone;

    public BloodWork(String userName, String userLocation, String userPhone, String userId, String password) {
        setPassword(password);
        this.userName = userName;
        this.userLocation = userLocation;
        this.userPhone = userPhone;
        this.userId = userId;
        this.password = password;
    }
    
    // Generate the getter and setter method the variables

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Map<String, Integer> getNewMap() {
        return newMap;
    }

    public void setNewMap(Map<String, Integer> newMap) {
        this.newMap = newMap;
    }

    String userId;
    String password;
    Map<String, Integer> newMap = new HashMap<String, Integer>();
    
    
}
