/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.CDC.CDCDirectory;
import Business.Doctor.DoctorDir;
import Business.EmergencyAmbulance.AmbulanceDir;
import Business.PandemicCenter.PandemicCenter_Dir;
import Business.Pharma.PharmaDirectory;
import Business.Roles.Roles;
import Business.UserAcc.UserAccDir;
import Business.Vac.VacDirectory;
import Business.WorkQueue.DoctorsAppointment_Dir;
import Business.WorkQueue.DonateBlood_Dir;
import Business.WorkQueue.VacRequest_Dir;
import Business.WorkQueue.WorkQueue;
import Business.user.User_Directory;
import java.util.ArrayList;

/**
 *
 * @author arjunbirju
 */
abstract class Organization{
     private String name;
    private WorkQueue workQueue;
   
    private UserAccDir userAccDir;
    User_Directory userDir;
    DoctorDir doctorDir; 
    PharmaDirectory pharmaDir;
    CDCDirectory cDCDir;
    AmbulanceDir ambulanceDir ;
    PandemicCenter_Dir pandemicCenterDir;
    DonateBlood_Dir donateBloodDir;
    VacDirectory vaccDir;
    VacRequest_Dir vaccReqDir;
    DoctorsAppointment_Dir docAppDir;
    
    
//     report_emergency_directory report_emergency_directory;
//     medrequest_directory medrequest_directory;
//     bloodbank_directory bloodbankdirectory;
//     app_check appcheck;
//     Covid19_directory cdd;
//     request_blood_directory rbd;
     
     private int organizationID;
    private static int counter=0; 
     
     
     public enum Type{
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        userAccDir = new UserAccDir();
        userDir =new User_Directory();
        doctorDir = new DoctorDir();
        pharmaDir = new PharmaDirectory();
        cDCDir = new CDCDirectory();
        ambulanceDir = new AmbulanceDir();
        pandemicCenterDir=new PandemicCenter_Dir();
        donateBloodDir=new DonateBlood_Dir();
        vaccDir =new VacDirectory();
        vaccReqDir=new VacRequest_Dir();
        docAppDir = new DoctorsAppointment_Dir();
        
        
//        cdd = new Covid19_directory();
//        rbd=new request_blood_directory();
//         report_emergency_directory = new report_emergency_directory();
//        bloodbankdirectory = new bloodbank();
//        medrequest_directory = new medrequest_directory();
//        appcheck = new app_check();
        
        organizationID = counter;
        ++counter;
    }
  public Organization(){
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccDir getUserAccDir() {
        if(userAccDir==null)
        {
            userAccDir =new UserAccDir();
        }
        return userAccDir;
    }

    public void setUserAccDir(UserAccDir userAccDir) {
        this.userAccDir = userAccDir;
    }
    
    public UserAccDir getUserAccountDirectory() {
        return userAccDir;
    }

    public User_Directory getUserDir() {
       
         if(userDir==null)
        {
            userDir =new User_Directory();
        }
           
        return userDir;
    }

    public void setUserDir(User_Directory userDir) {
        this.userDir = userDir;
    }

    public DoctorDir getDoctorDir() {
        if(doctorDir==null)
        {
            doctorDir = new DoctorDir();
        }
        
        return doctorDir;
    }

    public void setDoctorDir(DoctorDir doctorDir) {
        this.doctorDir = doctorDir;
    }

    public PharmaDirectory getPharmaDir() {
        if(pharmaDir==null)
        {
            pharmaDir = new PharmaDirectory();
        }
        return pharmaDir;
    }

    public void setPharmaDir(PharmaDirectory pharmaDir) {
        this.pharmaDir = pharmaDir;
    }

    public CDCDirectory getcDCDir() {
        if(cDCDir==null)
        {
            cDCDir = new CDCDirectory();
        }
        
        return cDCDir;
    }

    public void setcDCDir(CDCDirectory cDCDir) {
        this.cDCDir = cDCDir;
    }

    public AmbulanceDir getAmbulanceDir() {
        if(ambulanceDir==null)
        {
            ambulanceDir = new AmbulanceDir();
        }
        
        return ambulanceDir;
    }

    public void setAmbulanceDir(AmbulanceDir ambulanceDir) {
        this.ambulanceDir = ambulanceDir;
    }

    public PandemicCenter_Dir getPandemicCenterDir() {
        if(pandemicCenterDir ==null)
        {
            pandemicCenterDir = new PandemicCenter_Dir();        
        }
        return pandemicCenterDir;
    }

    public void setPandemicCenterDir(PandemicCenter_Dir pandemicCenterDir) {
        this.pandemicCenterDir = pandemicCenterDir;
    }

    public DonateBlood_Dir getDonateBloodDir() {
         if(donateBloodDir==null)
        {
            donateBloodDir = new DonateBlood_Dir();
        }
        
        return donateBloodDir;
    }

    public void setDonateBloodDir(DonateBlood_Dir donateBloodDir) {
        this.donateBloodDir = donateBloodDir;
    }

    public VacDirectory getVaccDir() {
          if(vaccDir==null)
        {
            vaccDir = new VacDirectory();        
        }
        return vaccDir;
    }

    public void setVaccDir(VacDirectory vaccDir) {
        this.vaccDir = vaccDir;
    }

    public VacRequest_Dir getVaccReqDir() {
        if(vaccReqDir==null)
        {
            vaccReqDir = new VacRequest_Dir();        
        }
        
        return vaccReqDir;
    }

    public void setVaccReqDir(VacRequest_Dir vaccReqDir) {
        this.vaccReqDir = vaccReqDir;
    }

    public DoctorsAppointment_Dir getDocAppDir() {
         if(docAppDir==null)
        {
            docAppDir = new DoctorsAppointment_Dir();        
        }
        
        return docAppDir;
    }

    public void setDocAppDir(DoctorsAppointment_Dir docAppDir) {
        this.docAppDir = docAppDir;
    }


    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
    
   public abstract ArrayList<Roles> getRoleSupported();
   
    @Override
    public String toString() {
        return name;
    }

    
}
