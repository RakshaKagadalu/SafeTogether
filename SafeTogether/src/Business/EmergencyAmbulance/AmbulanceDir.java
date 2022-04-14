/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmergencyAmbulance;

import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class AmbulanceDir {
      ArrayList<Ambulance> ambulances =new ArrayList<Ambulance>();

    public ArrayList<Ambulance> getAmbulances() {
        return ambulances;
    }

    public void setAmbulances(ArrayList<Ambulance> ambulances) {
        this.ambulances = ambulances;
    }
            
       public void addNewAmbulance(Ambulance newAmbulance)
    {        
       ambulances.add(newAmbulance);
    }
        public void removeAmbulance(Ambulance ambulance){
        ambulances.remove(ambulance);
    }
}
