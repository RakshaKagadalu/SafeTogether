/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.CDC.CDCDirectory;
import Business.Doctor.DoctorDir;
import Business.EmergencyAmbulance.AmbulanceDir;
import Business.EmergencyFire.FireDir;
import Business.BloodBank.BloodWorkDirectory;
import Business.PandemicCenter.PandemicCenter_Dir;
import Business.Pharma.PharmaDirectory;
import Business.Roles.Roles;
import Business.UserAcc.UserAccDir;
import Business.Vac.VacDirectory;
import Business.WorkQueue.DoctorsAppointment_Dir;
import Business.WorkQueue.DonateBlood_Dir;
import Business.WorkQueue.OutbreakTracerDir;
import Business.WorkQueue.Req_BloodDir;
import Business.WorkQueue.Req_EmergencyDir;
import Business.WorkQueue.Req_MedicineDir;
import Business.WorkQueue.SearchApp;
import Business.WorkQueue.VacRequest_Dir;
import Business.WorkQueue.WorkQueue;
import Business.userR.User_Directory;
import Business.EmergencyPolice.PoliceDir;
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
    FireDir fireDir;
    PoliceDir policeDir;
    
    
     Req_EmergencyDir emergencyReqDir;
     Req_MedicineDir medicineReqDir;
     BloodWorkDirectory bloodBankDir;
     SearchApp checkApplication;
     OutbreakTracerDir outbreakStatusDir;
     Req_BloodDir reqBloodDir;
     
//            outbreakStatusDir = new outbreakStatusDir();
//        reqBloodDir=new reqBloodDir();
//         emergencyReqDir = new Req_EmergencyDir();
//        bloodBankDir = new bloodBankDir();
//        medicineReqDir = new  Req_MedicineDir();
//        checkApplication = new checkApplication();
//        
     
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
        fireDir = new FireDir();
        policeDir = new PoliceDir();
        
        
          outbreakStatusDir = new OutbreakTracerDir();
        reqBloodDir=new Req_BloodDir();
         emergencyReqDir = new Req_EmergencyDir();
        bloodBankDir = new BloodWorkDirectory();
        medicineReqDir = new  Req_MedicineDir();
        checkApplication = new SearchApp();
        
        
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

    public FireDir getFireDir() {
        if(fireDir==null)
        {
            fireDir = new FireDir();
        }
        return fireDir;
    }

    public void setFireDir(FireDir fireDir) {
        this.fireDir = fireDir;
    }

    public PoliceDir getPoliceDir() {
        if(policeDir == null){
            policeDir = new PoliceDir();
        }
        return policeDir;
    }

    public void setPoliceDir(PoliceDir policeDir) {
        this.policeDir = policeDir;
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
   
   
   

    public Req_EmergencyDir getEmergencyReqDir() {
         if(emergencyReqDir==null)
        {
            emergencyReqDir = new Req_EmergencyDir();        
        }
        return emergencyReqDir;
    }

    public void setEmergencyReqDir(Req_EmergencyDir emergencyReqDir) {
        this.emergencyReqDir = emergencyReqDir;
    }

    public Req_MedicineDir getMedicineReqDir() {
          if(medicineReqDir==null)
        {
            
            medicineReqDir = new Req_MedicineDir();        
        }
          System.out.println("medre dir"+medicineReqDir);
        return medicineReqDir;
    }

    public void setMedicineReqDir(Req_MedicineDir medicineReqDir) {
        this.medicineReqDir = medicineReqDir;
    }

    public BloodWorkDirectory getBloodBankDir() {
          if(bloodBankDir==null)
        {
            bloodBankDir = new BloodWorkDirectory();        
        }
        return bloodBankDir;
    }

    public void setBloodBankDir(BloodWorkDirectory bloodBankDir) {
        this.bloodBankDir = bloodBankDir;
    }

    public SearchApp getCheckApplication() {
         if(checkApplication==null)
        {
            checkApplication = new SearchApp();        
        }
        return checkApplication;
    }

    public void setCheckApplication(SearchApp checkApplication) {
        this.checkApplication = checkApplication;
    }

    public OutbreakTracerDir getOutbreakStatusDir() {
          if(outbreakStatusDir==null)
        {
            outbreakStatusDir = new OutbreakTracerDir();        
        }
        return outbreakStatusDir;
    }

    public void setOutbreakStatusDir(OutbreakTracerDir outbreakStatusDir) {
        
        this.outbreakStatusDir = outbreakStatusDir;
    }

    public Req_BloodDir getReqBloodDir() {
          if(reqBloodDir==null)
        {
            reqBloodDir = new Req_BloodDir();        
        }
        return reqBloodDir;
    }

    public void setReqBloodDir(Req_BloodDir reqBloodDir) {
        this.reqBloodDir = reqBloodDir;
    }
   
   
   
   
   
    @Override
    public String toString() {
        return name;
    }

    
}
