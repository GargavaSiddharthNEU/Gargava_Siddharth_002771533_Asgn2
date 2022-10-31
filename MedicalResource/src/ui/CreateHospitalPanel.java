/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Doctor;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.Hospital;
import model.HospitalDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author siddh
 */
public class CreateHospitalPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHospitalPanel
     */
    Person person;
    DoctorDirectory doctorDirectory;
    Doctor doctor;
    PersonDirectory personDirectory;
    HospitalDirectory hospitalDirectory;
    String mainValidationString = "";
    String validationString1 = "";
    
    public CreateHospitalPanel(Person person, DoctorDirectory doctorDirectory, PersonDirectory personDirectory,HospitalDirectory hospitalDirectory) {
        initComponents();
        this.person = person;
        this.doctorDirectory = doctorDirectory;
        this.personDirectory = personDirectory;
        this.hospitalDirectory = hospitalDirectory;
    }
    
    
    public CreateHospitalPanel(Person person, DoctorDirectory doctorDirectory, Doctor doctor, HospitalDirectory hospitalDirectory) {
        initComponents();
        this.person = person;
        this.doctorDirectory = doctorDirectory;
        this.doctor = doctor;
        this.hospitalDirectory = hospitalDirectory;
       setCreateHospitalPanel();
    }
    
     public CreateHospitalPanel() {
        initComponents();   
    }
    
     private void setCreateHospitalPanel() {
        txtDoctorId.setText(doctor.getDoctorID());
        txtDoctorFName.setText(doctor.getDoctorFName());
        txtDoctorLName.setText(doctor.getDoctorLName());
        txtHospitalName.setText(doctor.getHospitalName());
        txtYOE.setText(doctor.getSpecialisation());
        txtHospitalId.setText(doctor.getHospitalID());
    }
     
    private Doctor setDoctorData() {
        String doctorId = txtDoctorId.getText();
        String doctorFName = txtDoctorFName.getText();
        String doctorLName = txtDoctorLName.getText();
        String specialisation = txtYOE.getText();
        String hospitalName = txtHospitalName.getText();
        String hospitalId = txtHospitalId.getText();
        
        
        Doctor doc = new Doctor();
        
        doc.setDoctorID(doctorId);
        doc.setDoctorFName(doctorFName);
        doc.setDoctorLName(doctorLName);
        doc.setSpecialisation(specialisation);
        doc.setHospitalID(hospitalId);
        doc.setHospitalName(hospitalName);

        return doc;
    }
    
    private void resetDoctorData() {
       txtHospitalId.setText("");
       txtHospitalName.setText("");
       txtDoctorId.setText("");
       txtDoctorFName.setText("");
       txtDoctorLName.setText("");
       txtYOE.setText("");
    }
    
    public boolean areDataFieldsEmpty() {
        validationString1 = "";
        if (txtHospitalId.getText().isEmpty()) {
            validationString1 += "Hospital Id, ";
        }
        if (txtHospitalName.getText().isEmpty()) {
            validationString1 += "Hospital Name, ";
        }
        if (txtDoctorId.getText().isEmpty()) {
            validationString1 += "Doctor Id, ";
        }
        if (txtDoctorFName.getText().isEmpty()) {
            validationString1 += "Doctor First Name, ";
        }
        if (txtDoctorLName.getText().isEmpty()) {
            validationString1 += "Doctor Last Name, ";
        }
        if (txtYOE.getText().isEmpty()) {
            validationString1 += "Doctor Specialization, ";
        }
        return isNotValid(validationString1);
    }

    public boolean isNotValid(String str) {
        if (str.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public void validationErrorMessagesDialog() {
        mainValidationString = validationString1;
        JOptionPane.showMessageDialog(this, "Please update the data for these fields: " + mainValidationString);
    }

    public boolean hospitalDetailsExistence() {
        String hospitalId = txtHospitalId.getText();
        boolean exist = false;
        for (Hospital hos : hospitalDirectory.getHospitals()) {
            if (hospitalId.equals(hos.getHospitalID())) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public boolean doctorDetailsExistence() {
        String doctorId = txtDoctorId.getText();
        boolean exist = false;
        for (Doctor doc : doctorDirectory.getDoctors()) {
            if (doctorId.equals(doc.getDoctorID())) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHospitalId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        txtDoctorId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDoctorFName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        txtDoctorLName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtYOE = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setText("Doctor ID");

        jLabel4.setText("Doctor First Name");

        jLabel1.setText("Hospital ID");

        jLabel5.setText("Doctor Last Name");

        jLabel6.setText("Specialisation");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("DETAILS");

        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Hospital Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnCreate)
                        .addGap(30, 30, 30)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnBack)))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorFName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorLName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYOE, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(307, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        boolean validation1 = areDataFieldsEmpty();
        String doctorId = txtDoctorId.getText();
        if (!validation1) {
            if (this.person != null && !(this.person.getAssHospital().equalsIgnoreCase(txtHospitalId.getText())) && this.person.getRoleType().equalsIgnoreCase("Hospital Admin")) {
                JOptionPane.showMessageDialog(this, "Restricted Access");
            } else {
                if (hospitalDetailsExistence()) {
                    if (!doctorDetailsExistence()) {
                        doctorDirectory.addDoctor(setDoctorData());
                        resetDoctorData();
                        JOptionPane.showMessageDialog(this, "New doctor data with doctor id : " + doctorId + " created");
                        HospitalJFrame.refreshViewHospitalPanel(person, doctorDirectory, personDirectory, hospitalDirectory);
                    } else {
                        JOptionPane.showMessageDialog(this, "Doctor data with doctor id : " + doctorId + " already exists in the system");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Hospital Id entered doesn't exists in the system");
                }
            }
        } else {
            validationErrorMessagesDialog();
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
      String doctorId = txtDoctorId.getText();
        boolean validation1 = areDataFieldsEmpty();
        if (!validation1) {
            if (this.person != null && !(this.person.getAssHospital().equalsIgnoreCase(txtHospitalId.getText())) && this.person.getRoleType().equalsIgnoreCase("Hospital Admin")) {
                JOptionPane.showMessageDialog(this, "Restricted Access");
            } else {
                if (hospitalDetailsExistence()) {
                    if (doctorDetailsExistence()) {
                        Doctor doctor = setDoctorData();
                        int index = 0;
                        for (Doctor doc : doctorDirectory.getDoctors()) {
                            if (doc.getDoctorID().equalsIgnoreCase(doctorId)) {
                                doctorDirectory.updateDoctor(doctor, index);
                                break;
                            }
                            index++;
                        }
                        JOptionPane.showMessageDialog(this, "Existing doctor with doctor id : " + doctorId + " updated");
                        resetDoctorData();
                        HospitalJFrame.refreshViewHospitalPanel(person, doctorDirectory, personDirectory, hospitalDirectory);
                    } else {
                        JOptionPane.showMessageDialog(this, "Doctor data with doctor id : " + doctorId + " doesn't exists in the system");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Hospital Id entered doesn't exists in the system");
                }
            }
        } else {
            validationErrorMessagesDialog();
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        HospitalJFrame.closeFrame();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtDoctorFName;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorLName;
    private javax.swing.JTextField txtHospitalId;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtYOE;
    // End of variables declaration//GEN-END:variables
}
