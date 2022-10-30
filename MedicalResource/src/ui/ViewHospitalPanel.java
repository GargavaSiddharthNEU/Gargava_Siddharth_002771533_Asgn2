/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author siddh
 */
public class ViewHospitalPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHospitalPanel
     */
    Person person;
    DoctorDirectory doctorDirectory;
    PersonDirectory personDirectory;
    
    public ViewHospitalPanel(Person person, DoctorDirectory doctorDirectory, PersonDirectory personDirectory) {
        initComponents();
        this.person = person;
        this.doctorDirectory = doctorDirectory;
        this.personDirectory = personDirectory;
        setHospitalAdminProfileData();
        
    }
    
    public void setHospitalAdminProfileData() {
        if(person!=null){
            lblHospitalAdminName.setText(this.person.getFirstName() + " " + this.person.getLastName());
            lblCommunityNameValue.setText(this.person.getHouse().getCommunity());
        } else {
            lblHospitalAdminName.setText("NA");
            lblCommunityNameValue.setText("NA");
        }
        
    }
    
    public void populateDoctorTable() {
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);

        for (Doctor doc : doctorDirectory.getDoctors()) {
            Object[] row = new Object[6];
            row[0] = doc;
            row[1] = doc.getHospitalName();
            row[2] = doc.getDoctorID();
            row[3] = doc.getDoctorFName();
            row[4] = doc.getDoctorLName();
            row[5] = doc.getSpecialisation();

            model.addRow(row);
        }
    }
    
    public void filteredDoctorTable(ArrayList<Doctor> doctorList) {
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);

        for (Doctor doctor : doctorList) {
            Object[] row = new Object[6];
            row[0] = doctor;
            row[1] = doctor.getHospitalName();
            row[2] = doctor.getDoctorID();
            row[3] = doctor.getDoctorFName();
            row[4] = doctor.getDoctorLName();
            row[5] = doctor.getSpecialisation();

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblHospitalAdminName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCommunityNameValue = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtHospId = new javax.swing.JTextField();
        btnPopulate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel1.setText("Hospital Admin Name :");

        lblHospitalAdminName.setText("NA");

        jLabel2.setText("Community Name:");

        lblCommunityNameValue.setText("NA");

        jLabel3.setText("Enter Hospital ID:");

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Hospital ID", "Hospital Name", "Doctor ID", "Doctor FName", "Doctor LName", "Specialisation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPopulate.setText("POPULATE TABLE");
        btnPopulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopulateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("HOSPITAL ADMIN DETAILS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnView)
                        .addGap(136, 136, 136)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(btnPopulate))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblHospitalAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCommunityNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblHospitalAdminName)
                    .addComponent(jLabel2)
                    .addComponent(lblCommunityNameValue))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPopulate)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctor.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        Doctor selectedDoctor = (Doctor) model.getValueAt(selectedRowIndex, 0);
        HospitalJFrame.setCreateDoctorPanel(person, doctorDirectory, selectedDoctor);
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctor.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        Doctor selectedDoctor = (Doctor) model.getValueAt(selectedRowIndex, 0);
        
        doctorDirectory.deleteDoctor(selectedDoctor);
        JOptionPane.showMessageDialog(this, "Doctor deleted"); 
        btnPopulateActionPerformed(evt);
        HospitalJFrame.refreshCreateHospitalPanel(person, doctorDirectory, personDirectory);
        txtHospId.setText("");
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPopulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopulateActionPerformed
        // TODO add your handling code here:
        String hosID = txtHospId.getText();
        if (hosID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter code");
        }
        if (this.person!=null && !(this.person.getAssHospital().equalsIgnoreCase(txtHospId.getText())) && this.person.getRoleType() == "Hospital Admin") {
            JOptionPane.showMessageDialog(this, "Restricted Access");
        } else {
            ArrayList<Doctor> doctorList = new ArrayList<>();
            for (Doctor doctor : doctorDirectory.getDoctors()) {
                if (doctor.getHospitalID().equalsIgnoreCase(hosID)) {
                    doctorList.add(doctor);
                }
            }
            filteredDoctorTable(doctorList);
        }
        
        
    }//GEN-LAST:event_btnPopulateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPopulate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunityNameValue;
    private javax.swing.JLabel lblHospitalAdminName;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtHospId;
    // End of variables declaration//GEN-END:variables
}
