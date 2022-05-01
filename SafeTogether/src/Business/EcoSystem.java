/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Roles.Roles;
import Business.Roles.System_Admin;
import Business.userR.User_Directory;
import java.util.ArrayList;
import Business.UserAcc.UserAcc;

/**
 *
 * @author arjunbirju
 */
public class EcoSystem extends Organization {
    
      private static EcoSystem business;
//      private ArrayList<UserAcc> userAccList;
//      private User_Directory userDir;
     
     public EcoSystem( User_Directory userDir) {

        this.userDir=userDir;
        
    }
     
     public boolean checkIfUserIsUnique(String userName){
//         for (UserAcc ua : userAccList){
//            if (ua.getUserName().equals(userName))
//            return false;
//        }
        return true;
         
    }
    
    
      public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
        
    }
      public static void setInstance(EcoSystem system) {	
        business = system;	
    }
    
    private EcoSystem(){
        super(null);
   
    }

       @Override
    public ArrayList<Roles> getRoleSupported() {
        ArrayList<Roles> rolesList=new ArrayList<>();
        rolesList.add(new System_Admin());
        return rolesList;
    }
    
}
