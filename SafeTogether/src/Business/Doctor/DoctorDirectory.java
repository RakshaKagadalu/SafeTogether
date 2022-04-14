/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Doctor;

import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class DoctorDirectory {
      ArrayList<Doctor> doc =new ArrayList<>();

    public ArrayList<Doctor> getDoc() {
        return doc;
    }

    public void setDoc(ArrayList<Doctor> doc) {
        this.doc = doc;
    }
        public void addNewDoc(Doctor c)
    {        
       doc.add(c);
    }
}
