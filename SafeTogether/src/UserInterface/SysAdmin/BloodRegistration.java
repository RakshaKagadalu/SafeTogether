/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysAdmin;

/**
 *
 * @author shrikrishnajoisa
 */
public class BloodRegistration extends javax.swing.JPanel {

    /**
     * Creates new form BloodRegistration
     */
    public BloodRegistration() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userNameTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        userNameTextField4 = new javax.swing.JTextField();
        userNameTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        userNameTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        userNameTextField7 = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 630));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 580, 630));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(10, 132, 255));
        jButton1.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 140, 39));

        jButton2.setBackground(new java.awt.Color(94, 92, 230));
        jButton2.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 140, 39));

        jButton3.setBackground(new java.awt.Color(255, 55, 95));
        jButton3.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.setBorder(null);
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 140, 39));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 50));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Name");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        userNameTextField3.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 40));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Location");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        userNameTextField4.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 40));

        userNameTextField5.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 420, 40));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("User ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, -1));

        userNameTextField6.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 420, 40));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Password");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setText("Phone Number");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 220, -1));

        userNameTextField7.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 420, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 470, 630));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField userNameTextField3;
    private javax.swing.JTextField userNameTextField4;
    private javax.swing.JTextField userNameTextField5;
    private javax.swing.JTextField userNameTextField6;
    private javax.swing.JTextField userNameTextField7;
    // End of variables declaration//GEN-END:variables
}
