/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.userAccount;

import java.util.ArrayList;

/**
 *
 * @author arjunbirju
 */
public class UserAccount_Directory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccount addAccount(UserAccount userAccount){
        userAccountList.add(userAccount);
        return userAccount;
    }
    public UserAccount removeAccount(UserAccount userAccount){
        userAccountList.remove(userAccount);
        return userAccount;
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
}
