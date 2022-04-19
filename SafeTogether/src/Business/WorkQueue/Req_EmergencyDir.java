/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class Req_EmergencyDir {
    ArrayList<Req_Emergency> emergencyUserList = new ArrayList<Req_Emergency>();
      public void addEmergencyUser(Req_Emergency user){
        emergencyUserList.add(user);
    }
    
    public void removeEmergencyUser(Req_Emergency user){
        emergencyUserList.remove(user);
    }

    public ArrayList<Req_Emergency> getEmergencyUserList() {
        return emergencyUserList;
    }

    public void setEmergencyUserList(ArrayList<Req_Emergency> emergencyUserList) {
        this.emergencyUserList = emergencyUserList;
    }
    
    
}
