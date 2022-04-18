/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author arjunbirju
 */
public class DoctorsAppointment_Dir {
    
    ArrayList<DoctorsAppointment> appointments = new ArrayList<>();

    public ArrayList<DoctorsAppointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<DoctorsAppointment> appointments) {
        this.appointments = appointments;
    }
    
    public void removerequest(DoctorsAppointment appointment){
        appointments.remove(appointment);
    }
    
    public void addrequest(DoctorsAppointment appointment){
        appointments.add(appointment);
    }
    
    
    
}
