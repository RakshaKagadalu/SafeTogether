/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Vac;

import java.util.*;

/**
 *
 * @author shrikrishnajoisa
 */
public class VacDirectory {
    
    ArrayList<Vaccinations> vaccinationList = new ArrayList<Vaccinations>();


    public ArrayList<Vaccinations> getVaccinationList() {
        return vaccinationList;
    }

    public void setVaccinationList(ArrayList<Vaccinations> vaccinationList) {
        this.vaccinationList = vaccinationList;
    }
    
    // function to add data from the application
    public void add(Vaccinations vaccinePeople) {
        vaccinationList.add(vaccinePeople);
    }
    
    // function to remove data from the application
    public void remove(Vaccinations vaccinePeople) {
        vaccinationList.remove(vaccinePeople);
    }
    
}
