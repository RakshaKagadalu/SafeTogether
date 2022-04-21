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
public class DoctorDir {
      ArrayList<Doctor> docs =new ArrayList<>();

    public ArrayList<Doctor> getDoc() {
        return docs;
    }

    public void setDoc(ArrayList<Doctor> docs) {
        this.docs = docs;
    }
        public void addNewDoc(Doctor doctor)
    {        
       docs.add(doctor);
    }
        
             public void removeDoc(Doctor doctor)
    {        
       docs.remove(doctor);
    }
             
              public Doctor findDoctor(String name){
        
         
         for(Doctor net : docs){
            // if(net.getEmployee().getName().equals(name)){
                  if(net.getFirstName().equals(name)){
                 return net;
             }
         }
         return null;
     }
}
