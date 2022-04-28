/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raksh
 */
public class Req_Medicine {

    String pharmaName;
    int id;
    String patientId;
    String status;
    Map<String,String> medOrderlist=new HashMap<String,String>();
    Map<String,String> medCostlist=new HashMap<String,String>();
    String DoctorName;

    public String getPharmaName() {
        return pharmaName;
    }

    public void setPharmaName(String pharmaName) {
        this.pharmaName = pharmaName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getStatus() {
        return status;
    }

    public Map<String, String> getMedOrderlist() {
        return medOrderlist;
    }

    public void setMedOrderlist(Map<String, String> medOrderlist) {
        this.medOrderlist = medOrderlist;
    }

    public Map<String, String> getMedCostlist() {
        return medCostlist;
    }

    public void setMedCostlist(Map<String, String> medCostlist) {
        this.medCostlist = medCostlist;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }
    
}
