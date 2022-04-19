/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysAdmin;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shrikrishna joisa
 */

public class SysAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminWorkAreaJPanel
     */
    JPanel container;
    EcoSystem ecosystem;
    public SysAdminWorkAreaJPanel(JPanel container,EcoSystem ecosystem) {
        initComponents();
        this.setSize(1920, 1080);
        this.container=container;
        this.ecosystem=ecosystem;
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
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pharmaButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        emergencyButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nonProfitButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        governmentButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hospitalButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel1.setText("Enterprise");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(193, 192, 193));
        jLabel2.setText("Easily manage your enteprise in this section");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jPanel4.setBackground(new java.awt.Color(250, 249, 251));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-supplement-bottle-96.png"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 87));

        jLabel12.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel12.setText("Pharmaceutical Enterprise");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(106, 110, 133));
        jLabel13.setText("hospital and the hospital workers");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 230, 30));

        jLabel14.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(106, 110, 133));
        jLabel14.setText("Place where you can manage anything");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 30));

        pharmaButton.setBackground(new java.awt.Color(62, 104, 230));
        pharmaButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        pharmaButton.setForeground(new java.awt.Color(255, 255, 255));
        pharmaButton.setText("Manage");
        pharmaButton.setBorder(null);
        pharmaButton.setFocusPainted(false);
        jPanel4.add(pharmaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 320, 290));

        jPanel6.setBackground(new java.awt.Color(250, 249, 251));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-siren-96.png"))); // NOI18N
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 87));

        jLabel20.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel20.setText("Emergency Enterprise");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel21.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(106, 110, 133));
        jLabel21.setText("hospital and the hospital workers");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 230, 30));

        jLabel22.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(106, 110, 133));
        jLabel22.setText("Place where you can manage anything");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 30));

        emergencyButton.setBackground(new java.awt.Color(62, 104, 230));
        emergencyButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        emergencyButton.setForeground(new java.awt.Color(255, 255, 255));
        emergencyButton.setText("Manage");
        emergencyButton.setBorder(null);
        emergencyButton.setFocusPainted(false);
        jPanel6.add(emergencyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 320, 290));

        jPanel2.setBackground(new java.awt.Color(250, 249, 251));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-world-health-organization-96.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 87));

        jLabel4.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel4.setText("Non-Profit Enterprise");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(106, 110, 133));
        jLabel5.setText("hospital and the hospital workers");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 230, 30));

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(106, 110, 133));
        jLabel6.setText("Place where you can manage anything");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 30));

        nonProfitButton.setBackground(new java.awt.Color(62, 104, 230));
        nonProfitButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        nonProfitButton.setForeground(new java.awt.Color(255, 255, 255));
        nonProfitButton.setText("Manage");
        nonProfitButton.setBorder(null);
        nonProfitButton.setFocusPainted(false);
        jPanel2.add(nonProfitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 320, 290));

        jPanel5.setBackground(new java.awt.Color(250, 249, 251));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-city-hall-96.png"))); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 87));

        jLabel16.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel16.setText("Government Enterprise");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel17.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(106, 110, 133));
        jLabel17.setText("hospital and the hospital workers");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 230, 30));

        jLabel18.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(106, 110, 133));
        jLabel18.setText("Place where you can manage anything");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 30));

        governmentButton.setBackground(new java.awt.Color(62, 104, 230));
        governmentButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        governmentButton.setForeground(new java.awt.Color(255, 255, 255));
        governmentButton.setText("Manage");
        governmentButton.setBorder(null);
        governmentButton.setFocusPainted(false);
        jPanel5.add(governmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 320, 290));

        jPanel3.setBackground(new java.awt.Color(250, 249, 251));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-hospital-room-96.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 87));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel8.setText("Hospital Enterprise");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(106, 110, 133));
        jLabel9.setText("hospital and the hospital workers");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 230, 30));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(106, 110, 133));
        jLabel10.setText("Place where you can manage anything");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 30));

        hospitalButton.setBackground(new java.awt.Color(62, 104, 230));
        hospitalButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        hospitalButton.setForeground(new java.awt.Color(255, 255, 255));
        hospitalButton.setText("Manage");
        hospitalButton.setBorder(null);
        hospitalButton.setFocusPainted(false);
        hospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalButtonActionPerformed(evt);
            }
        });
        jPanel3.add(hospitalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 320, 290));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void hospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalButtonActionPerformed
        // TODO add your handling code here:
        HospitalEnterprise sy=new HospitalEnterprise(ecosystem, container);
        container.add(sy);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_hospitalButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton emergencyButton;
    private javax.swing.JButton governmentButton;
    private javax.swing.JButton hospitalButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton nonProfitButton;
    private javax.swing.JButton pharmaButton;
    // End of variables declaration//GEN-END:variables
}
