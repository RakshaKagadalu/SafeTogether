/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.user;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.UserAcc.UserAcc;
import Business.WorkQueue.DoctorsAppointment;
import Business.WorkQueue.DoctorsAppointment_Dir;
import Business.WorkQueue.SearchApp;
import Business.userR.User;
import Utility.Notification;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrikrishnajoisa
 */
public class DoctorAppointment extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAppointment
     */
    UserAcc userAcc;
      EcoSystem system;
    JPanel rightSidePanel;
    public DoctorAppointment(EcoSystem system, JPanel rightSidePanel,UserAcc userAcc) {
        initComponents();
         this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.userAcc=userAcc;
        this.setSize(1160, 750);
         specializationCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timeCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        specializationCombo = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        bookAppointment1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocAvail = new javax.swing.JTable();
        bookAppointment2 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container.setBackground(new java.awt.Color(250, 249, 251));
        container.setPreferredSize(new java.awt.Dimension(1160, 750));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Book Appointment");
        container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel2.setText("Date");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 102, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel3.setText("Time");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 6, 86, -1));

        timeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00-10:00", "10:00-11:00", "11:00-12:00", "12:00-13:00", "13:00-14:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "17:00-18:00" }));
        jPanel2.add(timeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 38, 231, 36));

        jLabel4.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel4.setText("Specialization");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, -1, -1));

        specializationCombo.setPreferredSize(new java.awt.Dimension(140, 30));
        specializationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializationComboActionPerformed(evt);
            }
        });
        jPanel2.add(specializationCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 38, 235, 36));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 281, 36));

        container.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 1090, 90));

        bookAppointment1.setBackground(new java.awt.Color(10, 132, 255));
        bookAppointment1.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        bookAppointment1.setForeground(new java.awt.Color(255, 255, 255));
        bookAppointment1.setText("View Appointment Status");
        bookAppointment1.setBorder(null);
        bookAppointment1.setFocusPainted(false);
        bookAppointment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointment1ActionPerformed(evt);
            }
        });
        container.add(bookAppointment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 650, 230, 50));

        tblDocAvail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Specialization", "Hospital", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(tblDocAvail);

        container.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 1090, 250));

        bookAppointment2.setBackground(new java.awt.Color(10, 132, 255));
        bookAppointment2.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        bookAppointment2.setForeground(new java.awt.Color(255, 255, 255));
        bookAppointment2.setText("Book Appointment");
        bookAppointment2.setBorder(null);
        bookAppointment2.setFocusPainted(false);
        bookAppointment2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointment2ActionPerformed(evt);
            }
        });
        container.add(bookAppointment2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 230, 50));

        cancel.setBackground(new java.awt.Color(10, 132, 255));
        cancel.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel Appointment");
        cancel.setBorder(null);
        cancel.setFocusPainted(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        container.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 230, 50));

        cancel1.setBackground(new java.awt.Color(10, 132, 255));
        cancel1.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        cancel1.setForeground(new java.awt.Color(255, 255, 255));
        cancel1.setText("Find Doctor");
        cancel1.setBorder(null);
        cancel1.setFocusPainted(false);
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        container.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 650, 230, 50));

        add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1139, 1073));
    }// </editor-fold>//GEN-END:initComponents

    private void specializationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specializationComboActionPerformed
        // TODO add your handling code here:
DoctorDisplay();
    }//GEN-LAST:event_specializationComboActionPerformed

    private void bookAppointment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointment1ActionPerformed
        // TODO add your handling code here:
       // viewAppointmentStatus();
       displayAppointmentStatus();
    }//GEN-LAST:event_bookAppointment1ActionPerformed

    private void bookAppointment2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointment2ActionPerformed
        // TODO add your handling code here:
       
        bookDocAppointment();
    }//GEN-LAST:event_bookAppointment2ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        
        cancelAppoint();
    }//GEN-LAST:event_cancelActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        // TODO add your handling code here:
        DoctorDisplay();
    }//GEN-LAST:event_cancel1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookAppointment1;
    private javax.swing.JButton bookAppointment2;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancel1;
    private javax.swing.JPanel container;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> specializationCombo;
    private javax.swing.JTable tblDocAvail;
    private javax.swing.JComboBox<String> timeCombo;
    // End of variables declaration//GEN-END:variables

    private void specializationCombo() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    ArrayList<Doctor> d=system.getDoctorDir().getDoc();
        int s=d.size();
        ArrayList<String> spe =new ArrayList<String>();
        for(int i=0;i<s;i++)
        {
            Doctor d1=d.get(i);
            if(!spe.contains(d1.getSpecialization()))
                    {
                        spe.add(d1.getSpecialization());
                    }
            
        }
        for(int i=0;i<spe.size();i++)
        {
            specializationCombo.addItem(spe.get(i));
        }
    
    
    
    }

    private void DoctorDisplay() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    {
        String specialSelect=specializationCombo.getSelectedItem().toString();
         ArrayList<Doctor> doclist=system.getDoctorDir().getDoc();
        int s=doclist.size();
        
        tblDocAvail.setModel(new DefaultTableModel(null,new String[]{"Name","Hospital","Spealization","Phone Number"}));
        for(int i=0;i<s;i++)
        {
            Doctor doc=doclist.get(i);
            if(doc.getSpecialization().matches(specialSelect))
            {
                DefaultTableModel table = (DefaultTableModel) tblDocAvail.getModel();    
                String content[]={doc.getFirstName(),doc.getSpecialization(),doc.getHospital(),doc.getPhoneNum()};
                table.addRow(content);
            }
        }
    }
    
    
    
    
    }
 public  void sendmail()
    {   
        Notification notification = new Notification();
        String toEmail = "aedproject22@gmail.com";
        String emailSubject = "Doctor Appointment confirmation";
        String emailContent = "Successfully booked your doctor appointment!!"; 
        notification.sendMail(toEmail, emailSubject, emailContent);
    }
    private void bookDocAppointment() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
     DefaultTableModel model = (DefaultTableModel) tblDocAvail.getModel();
        int selectedRow=tblDocAvail.getSelectedRow();
        if(selectedRow>=0)
        {
            if(jDateChooser1.getDate()!=null)
            {
                int rand = 1 + (int) (Math.random() * 100);
                boolean appoint=false;
                SimpleDateFormat sdate = new SimpleDateFormat("yyyy-MM-dd");
                String appDate = sdate.format(jDateChooser1.getDate());
                DateTimeFormatter datetf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDateTime date2 = LocalDateTime.now();
                String name=(model.getValueAt(selectedRow, 0).toString());
                String date=specializationCombo.getSelectedItem().toString();
                if(appDate.compareTo(date2.toString()) >= 0) {
                    appoint=verify(name,appDate,date);
                    if(appoint==false)
                    {
                        DoctorsAppointment doc=new DoctorsAppointment();
                    doc.setId(rand);                    
                    doc.setDoctorsName(name);
                    String verifyName=(model.getValueAt(selectedRow, 1).toString());
                    doc.setLastName(verifyName);
                    doc.setDate(appDate);
                    doc.setStatus("Appointment Booked");
                    doc.setTime(timeCombo.getSelectedItem().toString());
                    //System.out.print(doc.getTime());
                    User user=(User)(userAcc);
                    doc.setUserId(user.getUserId());
                    doc.setUserName(user.getFirstName());
                    DoctorsAppointment_Dir docDir=system.getDocAppDir();
                    docDir.addrequest(doc);
                    SearchApp check= system.getCheckApplication();
                    Map<String,List<String>> a=check.getSearchByName();
                    List<String> list = new ArrayList<>();
                    list.add(appDate);
                    list.add(timeCombo.getSelectedItem().toString());                    
                    a.put(name, list);
                    //DB4OUtil.dB4OUtil.storeSystem(system);
                     
                    //code to send email
                  // sendmail();
                    //end of code
                    JOptionPane.showMessageDialog(null,"Your Appointment request is successfull!!");

                }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Appointment slot not available!!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please select any future date!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Date is mandatory!!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Select a Doctor you want to book an appointment with!!");
        }
    
    
    
    
    
    
    }

    private boolean verify(String name, String date1, String date) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
     boolean rand=false;
        SearchApp check= system.getCheckApplication();
        Map<String,List<String>> appList=check.getSearchByName();
        for (Map.Entry mapElement : appList.entrySet()) {
            if(mapElement.getKey().toString().matches(name))
            {
                List<String>appointmet=(List)mapElement.getValue();
                String name1=appointmet.get(0);
                String name2=appointmet.get(1);
                if(name1.matches(date1))
                {
                    if(name2.matches(date))
                    {
                        rand=true;
                        break;
                    }
                }
            }
           
        }
        return rand;
    
    
    }

//    private void viewAppointmentStatus() {
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    
//    DocAppointmentStatus docApp=new DocAppointmentStatus(rightSidePanel,system,userAcc);
//        container.add("DocAppointmentStatus",docApp);
//        CardLayout layout = (CardLayout) container.getLayout();
//        layout.next(container); 
//        
//        
//    
//    }
    
    
    private void displayAppointmentStatus() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    
        DoctorsAppointment_Dir docDir=system.getDocAppDir();
        ArrayList<DoctorsAppointment> ol=docDir.getAppointments();
        int u=ol.size();
        
         
             tblDocAvail.setModel(new DefaultTableModel(null,new String[]{"AppID","Name","Date","Time","status"}));
        for(int i=0;i<u;i++)
        {
            DoctorsAppointment o=ol.get(i);
           
            if(o.getUserId().matches(userAcc.getUserName()))
            {
            
                DefaultTableModel t2 = (DefaultTableModel) tblDocAvail.getModel();
                String s1=String.valueOf(o.getId());
                String s[]={s1,o.getDoctorsName(),o.getDate(),o.getTime(),o.getStatus()};
                t2.addRow(s);
            }
        }}

    private void cancelAppoint() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      DefaultTableModel  t2 = (DefaultTableModel) tblDocAvail.getModel();
        int selectedRow=tblDocAvail.getSelectedRow();
        if(selectedRow>=0)
        {       
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
 
    
         DoctorsAppointment_Dir docDir=system.getDocAppDir();
        ArrayList<DoctorsAppointment> ol=docDir.getAppointments();
        int u=ol.size();
        User a=(User)userAcc;
        for(int i=0;i<u;i++)
        {
            DoctorsAppointment o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                System.out.println(o.getStatus());
                if(o.getStatus().matches("Appointment Booked"))
                {
                    o.setStatus("Cancelled");
                    verify(o.getDoctorsName(),o.getDate(),o.getTime());
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Wrong Move!!");
                }
                

            }

        }
        tblDocAvail.setModel(new DefaultTableModel(null,new String[]{"ID","Doctor Name","Hospital","Status","Date","Time"}));
        displayAppointmentStatus();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select an appointment to cancel!!");
        }
    
    
    }
}
