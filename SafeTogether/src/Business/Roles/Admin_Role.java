/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.UserAcc.UserAcc;
import Business.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author raksh
 */
//to provide user role to admin
public class Admin_Role extends Roles {
     //@Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, EcoSystem ecosystem) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, ecosystem);
    }
}
