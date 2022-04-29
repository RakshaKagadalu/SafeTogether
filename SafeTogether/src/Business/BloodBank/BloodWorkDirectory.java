/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodBank;
import java.util.*;

/**
 *
 * @author shrikrishnajoisa
 */

public class BloodWorkDirectory {
    
    // Added blood work directory for the list
    ArrayList<BloodWork> bloodWorkList = new ArrayList<BloodWork>();

    // Blood work getter and setter 
    public ArrayList<BloodWork> getBloodWorkList() {
        return bloodWorkList;
    }

    public void setBloodWorkList(ArrayList<BloodWork> bloodWorkList) {
        this.bloodWorkList = bloodWorkList;
    }
    
    // Add item to the blood work list
    public void addBloodWork(BloodWork item) {
        bloodWorkList.add(item);
    }
    
    // removing the blood work from the blood work list to safe storage
    public void removeBloodWork(BloodWork item) {
        bloodWorkList.remove(item);
    }
    
}
