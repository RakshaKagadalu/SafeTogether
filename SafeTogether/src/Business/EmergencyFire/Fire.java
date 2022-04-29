/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmergencyFire;

import Business.Roles.Fire_Man;
//import Business.Roles.Police_Officer;
import Business.UserAcc.UserAcc;

/**
 *
 * @author arjunbirju
 */
public class Fire extends UserAcc {
    String user_Id;
    String pwd;
    String FireServLocation;
    String nameFireman;
    String phNum;

    public Fire(String user_Id, String pwd, String FireServLocation, String nameFireman, String phNum) {
        this.user_Id = user_Id;
        this.pwd = pwd;
        this.FireServLocation = FireServLocation;
        this.nameFireman = nameFireman;
        this.phNum = phNum;
        setUserName(user_Id);
        setPwd(pwd);
        setRole(new Fire_Man());
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

    public String getFireServLocation() {
        return FireServLocation;
    }

    public void setFireServLocation(String FireServLocation) {
        this.FireServLocation = FireServLocation;
    }

    public String getNameFireman() {
        return nameFireman;
    }

    public void setNameFireman(String nameFireman) {
        this.nameFireman = nameFireman;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }
    
}
