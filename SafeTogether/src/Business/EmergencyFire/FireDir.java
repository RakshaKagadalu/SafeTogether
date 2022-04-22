/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmergencyFire;

import Business.EmergencyFire.Fire;
import java.util.ArrayList;

/**
 *
 * @author arjunbirju
 */
public class FireDir {
    ArrayList<Fire> fireEngines =new ArrayList<Fire>();

    public ArrayList<Fire> getFireEngines() {
        return fireEngines;
    }

    public void setFireEngines(ArrayList<Fire> fireEngines) {
        this.fireEngines = fireEngines;
    }
    
     public void addNewFire(Fire newFire)
    {        
       fireEngines.add(newFire);
    }
        public void removeFire(Fire fire){
        fireEngines.remove(fire);
    }
}
