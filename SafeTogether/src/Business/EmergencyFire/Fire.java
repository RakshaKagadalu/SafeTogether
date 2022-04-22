/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmergencyFire;

import Business.Roles.Police_Officer;
import Business.UserAcc.UserAcc;

/**
 *
 * @author arjunbirju
 */
public class Fire extends UserAcc {
    String user_Id;
    String pwd;
    String FireServName;
    String nameFireman;
    String phNum;

    public Fire(String user_Id, String pwd, String FireServName, String nameFireman, String phNum) {
        this.user_Id = user_Id;
        this.pwd = pwd;
        this.FireServName = FireServName;
        this.nameFireman = nameFireman;
        this.phNum = phNum;
        setUserName(user_Id);
        setPwd(pwd);
        setRole(new Police_Officer());
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

    public String getFireServName() {
        return FireServName;
    }

    public void setFireServName(String FireServName) {
        this.FireServName = FireServName;
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
