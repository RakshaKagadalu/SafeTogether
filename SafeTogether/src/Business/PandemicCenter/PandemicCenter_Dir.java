/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PandemicCenter;

import java.util.ArrayList;

/**
 *
 * @author arjunbirju
 */



public class PandemicCenter_Dir {
    ArrayList<PandemicCenter> pandemicdirectory =new ArrayList<>();

    public ArrayList<PandemicCenter> getPandemicdirectory() {
        return pandemicdirectory;
    }

    public void setPandemicdirectory(ArrayList<PandemicCenter> pandemicdirectory) {
        this.pandemicdirectory = pandemicdirectory;
    }

    public void addPandemicCenter(PandemicCenter center)
    {        
       pandemicdirectory.add(center);
    }
    
    public void removePandemicCenter(PandemicCenter customer){
        pandemicdirectory.remove(customer);
    }
}
