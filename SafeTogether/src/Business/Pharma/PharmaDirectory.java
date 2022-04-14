/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharma;
import java.util.*;

/**
 *
 * @author shrikrishnajoisa
 */
public class PharmaDirectory {
    ArrayList<Pharma> pharmaArrayList = new ArrayList<Pharma>();
    
    // Getter and Setter for java

    public ArrayList<Pharma> getPharmaArrayList() {
        return pharmaArrayList;
    }

    public void setPharmaArrayList(ArrayList<Pharma> pharmaArrayList) {
        this.pharmaArrayList = pharmaArrayList;
    }
    
    // Adding the items to the pharmaList
    public void addToPharma(Pharma pharmaPerson) {
        pharmaArrayList.add(pharmaPerson);
    }
    
    // Removing the items from the pharmaList
    public void removeFromPharma(Pharma pharmaPerson) {
        pharmaArrayList.remove(pharmaPerson);
    }
}
