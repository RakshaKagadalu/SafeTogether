/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.user;

import java.util.ArrayList;

/**
 *
 * @author arjunbirju
 */
public class User_Directory {
    ArrayList<User> users = new ArrayList<User>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    public void addUser(User user){
        users.add(user);
    }
    
    public void removeUser(User user){
        users.remove(user);
    }
    
}
