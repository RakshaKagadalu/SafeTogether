/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author arjunbirju
 */
public class VacRequest_Dir {
    ArrayList<VacRequest> requests = new ArrayList<VacRequest>();

    public ArrayList<VacRequest> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<VacRequest> requests) {
        this.requests = requests;
    }
    
    public void addRequest(VacRequest user){
        requests.add(user);
    }
    
    public void removeRequest(VacRequest user){
        requests.remove(user);
    }
}
