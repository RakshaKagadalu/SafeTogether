/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CDC;

import java.util.ArrayList;

/**
 *
 * @author shrikrishnajoisa
 */
public class CDCDirectory {
    
    // Storing the CDCDiretory
    ArrayList<CDC> cdcList = new ArrayList<CDC>();

    public ArrayList<CDC> getCdcList() {
        return cdcList;
    }

    public void setCdcList(ArrayList<CDC> cdcList) {
        this.cdcList = cdcList;
    }
    
    // Adding and removing items from the new array list
    public void addCDCPeople (CDC official) {
        cdcList.add(official);
    }
    
    // Removing people from the array list
    public void cdcPeople(CDC official) {
        cdcList.remove(official);
    }
        
}
