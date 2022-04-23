/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.police;

/**
 *
 * @author shrikrishnajoisa
 */
public class PoliceView extends javax.swing.JPanel {

    /**
     * Creates new form PoliceView
     */
    public PoliceView() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bookButton = new javax.swing.JButton();
        bookButton1 = new javax.swing.JButton();
        bookButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel2.setText("Police Department");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Location", "Status", "Response"
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 94, 853, -1));

        bookButton.setBackground(new java.awt.Color(255, 69, 58));
        bookButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        bookButton.setForeground(new java.awt.Color(255, 255, 255));
        bookButton.setText("Close Case");
        bookButton.setBorder(null);
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        jPanel2.add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 180, 50));

        bookButton1.setBackground(new java.awt.Color(10, 132, 255));
        bookButton1.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        bookButton1.setForeground(new java.awt.Color(255, 255, 255));
        bookButton1.setText("Respond");
        bookButton1.setBorder(null);
        bookButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(bookButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 180, 50));

        bookButton2.setBackground(new java.awt.Color(255, 55, 95));
        bookButton2.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        bookButton2.setForeground(new java.awt.Color(255, 255, 255));
        bookButton2.setText("False Alarm");
        bookButton2.setBorder(null);
        bookButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(bookButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 180, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 930, 620));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/matt-popovich-7mqsZsE6FaU-unsplash.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookButtonActionPerformed

    private void bookButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookButton1ActionPerformed

    private void bookButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookButton;
    private javax.swing.JButton bookButton1;
    private javax.swing.JButton bookButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}