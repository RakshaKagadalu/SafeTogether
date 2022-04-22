/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PandemicCenter;

import Business.Roles.Admin_PandemicTestCenter;
import Business.UserAcc.UserAcc;

/**
 *
 * @author arjunbirju
 */
public class PandemicCenter extends UserAcc {
    
    String userId;
    String password;
    String location;
    String phoneNumber;
    String name;
    String email;
    String result;

    public PandemicCenter( String name,String location,String userId, String password, String phoneNumber) {
        setUserName(userId);
        setPwd(password);
      setRole(new Admin_PandemicTestCenter());
        this.userId = userId;
        this.password = password;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.name = name;
//        this.email = email;
//        this.result = result;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
}
