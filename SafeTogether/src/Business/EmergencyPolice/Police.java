/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmergencyPolice;

import Business.Roles.Police_Officer;
import Business.UserAcc.UserAcc;

/**
 *
 * @author arjunbirju
 */
public class Police extends UserAcc {
    String user_Id;
    String pwd;
    String PoliceServName;
    String namePolice;
    String phNum;

    public Police(String user_Id, String pwd, String PoliceServName, String namePolice, String phNum) {
        this.user_Id = user_Id;
        this.pwd = pwd;
        this.PoliceServName = PoliceServName;
        this.namePolice = namePolice;
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

    public String getPoliceServName() {
        return PoliceServName;
    }

    public void setPoliceServName(String PoliceServName) {
        this.PoliceServName = PoliceServName;
    }

    public String getNamePolice() {
        return namePolice;
    }

    public void setNamePolice(String namePolice) {
        this.namePolice = namePolice;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }
}
