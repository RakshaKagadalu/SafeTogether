/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAcc;

import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class UserAccDir {
     private ArrayList<UserAcc> userAccList;

    public UserAccDir() {
    userAccList = new ArrayList();
    }
     
      public UserAcc addAccount(UserAcc userAccount){
        userAccList.add(userAccount);
        return userAccount;
    }
    public UserAcc removeccount(UserAcc userAccount){
        userAccList.remove(userAccount);
        return userAccount;
    }
     public boolean checkIfUsernameIsUnique(String userName){
        for (UserAcc ua : userAccList){
            if (ua.getUserName().equals(userName))
                return false;
        }
        return true;
    }
    
    public UserAcc createUserAccount(String userName, String pwd, Roles role){
        UserAcc userAccount = new UserAcc();
        userAccount.setUserName(userName);
        userAccount.setPwd(pwd);
      
        userAccount.setRole(role);
        userAccList.add(userAccount);
        return userAccount;
    }
         public UserAcc authenticateUser(String userName, String pwd){
        for (UserAcc ua : userAccList)
            if (ua.getUserName().equals(userName) && ua.getPwd().equals(pwd)){
                return ua;
            }
        return null;
    }

    public ArrayList<UserAcc> getUserAccList() {
        return userAccList;
    }

    public void setUserAccList(ArrayList<UserAcc> userAccList) {
        this.userAccList = userAccList;
    }
   
   
}
