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
public class Req_BloodDir {
    ArrayList<Req_Blood> bloodReqDir = new ArrayList<Req_Blood>();
    
    public void addUserReq(Req_Blood userReq){
        bloodReqDir.add(userReq);
    }
    
    public void removeUserReq(Req_Blood userReq){
        bloodReqDir.remove(userReq);
    }

    public ArrayList<Req_Blood> getBloodReqDir() {
        return bloodReqDir;
    }

    public void setBloodReqDir(ArrayList<Req_Blood> bloodReqDir) {
        this.bloodReqDir = bloodReqDir;
    }
    
}
