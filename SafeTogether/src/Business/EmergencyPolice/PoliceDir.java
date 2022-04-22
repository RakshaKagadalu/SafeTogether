/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmergencyPolice;

import java.util.ArrayList;

/**
 *
 * @author arjunbirju
 */
public class PoliceDir {
    ArrayList<Police> policeList =new ArrayList<>();

    public ArrayList<Police> getPoliceList() {
        return policeList;
    }

    public void setPoliceList(ArrayList<Police> policeList) {
        this.policeList = policeList;
    }

     public void addNewPolice(Police newPolice)
    {        
       policeList.add(newPolice);
    }
        public void removePolice(Police police){
        policeList.remove(police);
    }
}
