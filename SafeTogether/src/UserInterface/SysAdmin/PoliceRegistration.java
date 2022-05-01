/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysAdmin;

import Business.EcoSystem;
import Business.EmergencyPolice.Police;
import Business.EmergencyPolice.PoliceDir;
import Utility.MapCoordinates;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrikrishnajoisa
 */
public class PoliceRegistration extends javax.swing.JPanel {

    /**
     * Creates new form PoliceRegistration
     */
    public PoliceRegistration() {
        initComponents();
    }

    EcoSystem system;
    JPanel rightSidePanel;
    Police amb;
    MapCoordinates locationPoint;

    public PoliceRegistration(EcoSystem system, JPanel rightSidePanel, MapCoordinates locationPoint) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.locationPoint = locationPoint;
        this.setSize(1160, 750);
        populateTable();
//        displayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        userIdTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        locationInputField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "User ID", "Password", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 630));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 580, 630));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setBackground(new java.awt.Color(10, 132, 255));
        addBtn.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.setBorder(null);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel7.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 140, 39));

        updateBtn.setBackground(new java.awt.Color(94, 92, 230));
        updateBtn.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setBorder(null);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel7.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 140, 39));

        DelBtn.setBackground(new java.awt.Color(255, 55, 95));
        DelBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        DelBtn.setForeground(new java.awt.Color(255, 255, 255));
        DelBtn.setText("Delete");
        DelBtn.setBorder(null);
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });
        jPanel7.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 140, 39));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 50));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Name");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        firstNameTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 40));

        userIdTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 420, 40));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("User ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        passwordTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 420, 40));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Password");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 220, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setText("Phone Number");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 220, -1));

        phoneTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 420, 40));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Location");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        locationInputField.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(locationInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 40));

        searchButton.setBackground(new java.awt.Color(255, 55, 95));
        searchButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.setBorder(null);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel7.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 150, 39));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 470, 630));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if (firstNameTxt.getText().isEmpty() || locationInputField.getText().isEmpty() || userIdTxt.getText().isEmpty() || passwordTxt.getText().isEmpty() || phoneTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userIdTxt.getText())) {
            if (!phoneTxt.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                phoneTxt.setText("");
                return;
            }

            if (!passwordTxt.getText().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) {
                JOptionPane.showMessageDialog(null, "Password is in incorrect \nFormat. Should be minimum 8 in length "
                        + "with one upper case, one lower case, one digit and one special character");
                passwordTxt.setText("");
                return;
            }

            Police customer = new Police(firstNameTxt.getText(), locationInputField.getText(), phoneTxt.getText(), userIdTxt.getText(), passwordTxt.getText());
            system.getUserAccountDirectory().addAccount(customer);
            system.getPoliceDir().addNewPolice(customer);
            populateTable();
            firstNameTxt.setText("");
            phoneTxt.setText("");
            userIdTxt.setText("");
            passwordTxt.setText("");
            locationInputField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Username " + userIdTxt.getText() + " already exists !!!, Please try a new one");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void populateTable() {
        PoliceDir policeDir = system.getPoliceDir();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (Police customer : policeDir.getPoliceList()) {
            Object[] row = new Object[5];
            row[0] = customer.getName();
            row[1] = customer.getLocation();
            row[2] = customer.getUserid();
            row[3] = customer.getPassword();
            row[4] = customer.getPhonenumber();

            model.addRow(row);

        }
    }

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String username = userIdTxt.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1 = jTable1.getSelectedRow();
        if (t1 >= 0) {

            String value = (String) jTable1.getValueAt(t1, 2);
            PoliceDir police1 = system.getPoliceDir();
            ArrayList<Police> list = police1.getPoliceList();
            int listsize = list.size();

            if (!username.matches(value)) {
                JOptionPane.showMessageDialog(null, "Cannot Update User ID , it is unique!!");
                firstNameTxt.setText("");
                locationInputField.setText("");
                phoneTxt.setText("");
                passwordTxt.setText("");
                userIdTxt.setText("");
                return;
            }
            if (firstNameTxt.getText().isEmpty() || locationInputField.getText().isEmpty() || userIdTxt.getText().isEmpty() || passwordTxt.getText().isEmpty() || phoneTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
                return;
            }

            for (int i = 0; i < listsize; i++) {
                Police doc = list.get(i);
                System.out.println("username" + doc.getUserName());
                System.out.println("value" + value);
                if (doc.getUserName().matches(value)) {
                    if (!phoneTxt.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                        JOptionPane.showMessageDialog(null, " 10 digit phone number");
                        phoneTxt.setText("");
                        return;
                    }
                    if (!passwordTxt.getText().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) {
                        JOptionPane.showMessageDialog(null, "Password is in incorrect \nFormat. Should be minimum 8 in length "
                                + "with one upper case, one lower case, one digit and one special character");
                        passwordTxt.setText("");
                        return;
                    }

                    doc.setName(firstNameTxt.getText());
                    doc.setLocation(locationInputField.getText());
                    doc.setPhonenumber(phoneTxt.getText());
                    doc.setPassword(passwordTxt.getText());
                    doc.setUserid(userIdTxt.getText());

                }
//                else {
//                    
//                }
            }
            populateTable();

            firstNameTxt.setText("");
            locationInputField.setText("");
            phoneTxt.setText("");
            passwordTxt.setText("");
            userIdTxt.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }

//        if(t1>=0)
//        {
//            
//            {
//                String a=(String)t.getValueAt(t1, 2);
//                System.out.println("a" + a);
//                System.out.println("3" + (String)t.getValueAt(t1, 3));
//                System.out.println("1" + (String)t.getValueAt(t1, 1));
//                PoliceDir pol = system.getPoliceDir();
//                ArrayList<Police> cd1= pol.getPoliceList();
//                int z=cd1.size();
//                for(int i=0;i<z;i++)
//                {
//                    Police c=cd1.get(i);
//                    c.getUserid()();
//                    if(c.getUserid()().matches(a))
//                    {
//                        if(!phoneTxt.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
//                        {
//                            JOptionPane.showMessageDialog(null, " 10 digit phone number");
//                            phoneTxt.setText("");
//                            return;
//                        }
//
//                        c.setNamePolice(firstNameTxt.getText());
//                        c.setPoliceLocation(locationInputField.getText());
//                        c.setPhNum(phoneTxt.getText());
//                        c.setUser_Id(userIdTxt.getText());
//                        c.setPwd(passwordTxt.getText());
//                    } else{
//                        JOptionPane.showMessageDialog(null, "Username " + userIdTxt.getText() + " already exists !!!, Please try a new one");
//                    }
//                } 
//            populateTable();
//            }                                        
//        }
//            else
//        {
//            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
//        }
    }//GEN-LAST:event_updateBtnActionPerformed


    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Official from the table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            System.out.println("0 -> " + table.getValueAt(selectedRow, 0).toString());
            System.out.println("1 -> " + table.getValueAt(selectedRow, 1).toString());
            System.out.println("2 -> " + table.getValueAt(selectedRow, 2).toString());
            System.out.println("3 -> " + table.getValueAt(selectedRow, 3).toString());
            System.out.println("4 -> " + table.getValueAt(selectedRow, 4).toString());
            firstNameTxt.setText(table.getValueAt(selectedRow, 0).toString());
            locationInputField.setText(table.getValueAt(selectedRow, 1).toString());
            userIdTxt.setText(table.getValueAt(selectedRow, 2).toString());
            passwordTxt.setText(table.getValueAt(selectedRow, 3).toString());
            phoneTxt.setText(table.getValueAt(selectedRow, 4).toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        // TODO add your handling code here:

        String username = userIdTxt.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1 = jTable1.getSelectedRow();
        if (t1 >= 0) {
            String a = (String) t.getValueAt(t1, 2);
            System.out.println(a);
            PoliceDir bbd = system.getPoliceDir();
            ArrayList<Police> cd1 = bbd.getPoliceList();
            int z = cd1.size();
            for (int i = 0; i < z; i++) {
                Police c = cd1.get(i);
                System.out.println(c.getUserid());
                if (c.getUserid().matches(a)) {
                    cd1.remove(c);
                    System.out.println("delete");
                    system.getUserAccountDirectory().removeccount(c);
                    break;
                }
            }
            populateTable();
            firstNameTxt.setText("");
            locationInputField.setText("");
            phoneTxt.setText("");
            userIdTxt.setText("");
            passwordTxt.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
    }//GEN-LAST:event_DelBtnActionPerformed

    public void populateLongituteLatitude(MapCoordinates locationPoint) {
        this.locationPoint = locationPoint;
        locationInputField.setText(locationPoint.getLatitudeCoordinate() + ", " + locationPoint.getLongitudeCoordinate());
    }


    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        MapViewr oLJP = new MapViewr(rightSidePanel);
        rightSidePanel.add("MapViewr", oLJP);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField locationInputField;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField userIdTxt;
    // End of variables declaration//GEN-END:variables
}
