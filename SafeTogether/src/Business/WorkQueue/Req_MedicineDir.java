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
public class Req_MedicineDir {
    ArrayList<Req_Medicine> medReqDir = new ArrayList<Req_Medicine>();
    
      public void addUeserReq(Req_Medicine user){
        medReqDir.add(user);
    }
    
    public void removeUserReq(Req_Medicine user){
        medReqDir.remove(user);
    }

    public ArrayList<Req_Medicine> getMedReqDir() {
        return medReqDir;
    }

    public void setMedReqDir(ArrayList<Req_Medicine> medReqDir) {
        this.medReqDir = medReqDir;
    }
    
}
