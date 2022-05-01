/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Doctor;

import Business.DatabaseUtil.DB4OUtil;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Pharma.Pharma;
import Business.Pharma.PharmaDirectory;
import Business.UserAcc.UserAcc;
import Business.WorkQueue.Req_Medicine;
import Business.WorkQueue.Req_MedicineDir;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrikrishnajoisa
 */
public class PharmacyDoctor extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyDoctor
     */
    private final JPanel container;
    private final EcoSystem system;
    private final UserAcc userAcc;
    private final String patientid;

    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public PharmacyDoctor(JPanel container, EcoSystem system, UserAcc userAcc, String userid) {
        initComponents();
        this.container = container;
        this.system = system;
        this.userAcc = userAcc;
        this.patientid = userid;
        PharmaDirectory rd = system.getPharmaDir();
        ArrayList<Pharma> list = rd.getPharmaArrayList();
        int s = list.size();

        for (int i = 0; i < s; i++) {
            Pharma r = list.get(i);
            String s1 = r.getPharmaName();
            jComboBox1.addItem(s1);

        }
        // displayTable();
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
        placeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderList = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        medList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placeButton.setBackground(new java.awt.Color(10, 132, 255));
        placeButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        placeButton.setForeground(new java.awt.Color(255, 255, 255));
        placeButton.setText("Place");
        placeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(placeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, 180, 50));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Pharmacy Doctor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        orderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Cost", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 853, 170));

        medList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(medList);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 853, 170));

        jLabel2.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel2.setText("Pharmacy");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 220, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void placeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeButtonActionPerformed
        // TODO add your handling code here:

        placeOrder();

    }//GEN-LAST:event_placeButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        displayMedicines();


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void medListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medListMouseClicked
        // TODO add your handling code here:
        getQuantity();


    }//GEN-LAST:event_medListMouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        // displayMedicines();
    }//GEN-LAST:event_jComboBox1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable medList;
    private javax.swing.JTable orderList;
    private javax.swing.JButton placeButton;
    // End of variables declaration//GEN-END:variables

    private void placeOrder() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel table = (DefaultTableModel) orderList.getModel();
        if (table.getRowCount() != 0) {
            Req_Medicine reqMed = new Req_Medicine();
            int r = 1 + (int) (Math.random() * 100);
            reqMed.setId(r);
            reqMed.setPatientId(patientid);
            Doctor doc = (Doctor) (userAcc);
            reqMed.setDoctorName(doc.getFirstName());
            reqMed.setPharmaName(jComboBox1.getSelectedItem().toString());
            reqMed.setStatus("Order Placed");

            Map<String, String> med = reqMed.getMedOrderlist();
            Map<String, String> price = reqMed.getMedCostlist();
            int a = table.getRowCount();
            for (int i = 0; i < a; i++) {
                String s1 = table.getValueAt(i, 0).toString();
                //System.out.println("this is one"+one);
                String s2 = table.getValueAt(i, 1).toString();
                //System.out.println("this is a1"+a1);
                String s3 = table.getValueAt(i, 2).toString();
                //System.out.println("this is two"+two);
                med.put(s1, s3);
                int a1 = Integer.parseInt(s2);
                int a2 = Integer.parseInt(s3);
                int a3 = a1 * a2;
                price.put(s1, String.valueOf(a3));

            }
            Req_MedicineDir mdir = system.getMedicineReqDir();
            ArrayList<Req_Medicine> orderList = mdir.getMedReqDir();
            orderList.add(reqMed);
            dB4OUtil.storeSystem(system);
            JOptionPane.showMessageDialog(null, "Order placed");
        } else {
            JOptionPane.showMessageDialog(null, "Cart is empty!!");
        }

    }

    private void getQuantity() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel table = (DefaultTableModel) medList.getModel();
        int sRow = medList.getSelectedRow();

        String s1 = table.getValueAt(sRow, 0).toString();
        String s2 = table.getValueAt(sRow, 1).toString();
        String response;
        do {
            response = JOptionPane.showInputDialog("Please provide Quantity");
        } while (!response.matches("[0-9][0-9]"));

        DefaultTableModel t2 = (DefaultTableModel) orderList.getModel();
        t2.addRow(new Object[]{s1, s2, response});

    }

    private void displayMedicines() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        medList.setModel(new DefaultTableModel(null, new String[]{"Name", "Cost"}));
        orderList.setModel(new DefaultTableModel(null, new String[]{"Name", "Cost", "Quantity"}));
        PharmaDirectory pharmaDir = system.getPharmaDir();
        ArrayList<Pharma> list = pharmaDir.getPharmaArrayList();
        String s = jComboBox1.getSelectedItem().toString();

        int l = list.size();

        for (int i = 0; i < l; i++) {
            Pharma pharmacy = list.get(i);

            if (s.matches(pharmacy.getPharmaName())) {

                Map<String, String> abc = pharmacy.getMedicines();

                DefaultTableModel model = (DefaultTableModel) medList.getModel();
                for (String key : abc.keySet()) {

                    String s1[] = {key, abc.get(key)};
                    model.addRow(s1);
                }
            }
        }

    }

//    private void displayTable() {
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//
//    }
}
