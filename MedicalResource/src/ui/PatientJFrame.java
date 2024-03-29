/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.House;
import model.Person;
import static ui.DoctorJFrame.doctorJFrame;

/**
 *
 * @author siddh
 */
public class PatientJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PatientJFrame
     */
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospitalDirectory;
    Person person;
    CommunityDirectory communityDirectory;
    static PatientJFrame patientJFrame;

    public PatientJFrame() {
        initComponents();

    }

    public PatientJFrame(PatientJFrame patientJFrame) {
        this.patientJFrame = patientJFrame;
    }

    public PatientJFrame(Person temp, HospitalDirectory hospitalDirectory, DoctorDirectory doctorDirectory, CommunityDirectory communityDirectory) {
        initComponents();
        this.communityDirectory = communityDirectory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.person = temp;

        
        String firstName = temp.getFirstName();
        String lastName = temp.getLastName();
        lblDFLName.setText(firstName + " " + lastName);

        String community = temp.getHouse().getCommunity();
        lblCommunity.setText(community);
        fillCMBHospital(temp);
        onChangeComboBox();

    }

    public void onChangeComboBox() {
        cmbChooseHospital.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Hospital tableHospital = new Hospital();
                DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();

                model.setRowCount(0);

                String community = person.getHouse().getCommunity();

                ArrayList<Hospital> hospitalList = new ArrayList<>();
                ArrayList<Doctor> doctorList = new ArrayList<>();

                for (Hospital hosp : hospitalDirectory.getHospitals()) {
                    if (hosp.getCommunity().equalsIgnoreCase(community)) {
                        hospitalList.add(hosp);
                    }
                }

                String selectedHospital = (String) cmbChooseHospital.getSelectedItem();
                for (Hospital hos : hospitalList) {
                    if (selectedHospital.equals(hos.getHospitalName())) {
                        for (Doctor doc : doctorDirectory.getDoctors()) {
                            if (doc.getHospitalName().equalsIgnoreCase(selectedHospital)) {
                                doctorList.add(doc);
                            }
                        }
                        for (Doctor doctor : doctorList) {
                            Object[] row = new Object[4];

                            row[0] = doctor.getDoctorID();
                            row[1] = doctor.getDoctorFName();
                            row[2] = doctor.getDoctorLName();
                            row[3] = doctor.getSpecialisation();

                            model.addRow(row);
                        }
                        break;
                    }
                }

            }
        }
        );
    }

    public void fillCMBHospital(Person temp) {
        String community = temp.getHouse().getCommunity();
        ArrayList<Hospital> hospitalList = new ArrayList<>();
        for (Hospital hosp : hospitalDirectory.getHospitals()) {
            if (hosp.getCommunity().equalsIgnoreCase(community)) {
                hospitalList.add(hosp);
                cmbChooseHospital.addItem(hosp.getHospitalName());
            }
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
        jLabel2 = new javax.swing.JLabel();
        lblDFLName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbChooseHospital = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("PATIENT PAGE :");

        jLabel2.setText("Welcome");

        jLabel3.setText("Your community is : ");

        jLabel4.setText("Choose Hospital in the Community :");

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DoctorID", "Doctor FName", "Doctor LName", "Specialisation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        jLabel5.setText("Please find list of Doctors in your selected Hospital :");

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDFLName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbChooseHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btnBack)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDFLName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbChooseHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnBack)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        patientJFrame.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbChooseHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDFLName;
    private javax.swing.JTable tblDoctor;
    // End of variables declaration//GEN-END:variables

//    private void populateTable() {
//        
//        Hospital tableHospital = new Hospital();
//        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
//        
//        model.setRowCount(0);
//        
//        String n = (String)cmbChooseHospital.getSelectedItem();
//        
//       ArrayList<Hospital> hospitals = hospitalDirectory.getHospitals();
//       
//        for (Hospital searchHospital : hospitals) {
//            if (n.equals(searchHospital.getHospitalName())) {
//                tableHospital = searchHospital;
//                DoctorDirectory tabDoc = tableHospital.getDoctorDirectory();
//                for (Doctor doctor : tabDoc.getDoctors()) {
//                    Object[] row = new Object[4];
//
//                    row[0] = doctor.getDoctorID();
//                    row[1] = doctor.getDoctorFName();
//                    row[2] = doctor.getDoctorLName();
//                    row[3] = doctor.getYearsofExp();
//
//                    model.addRow(row);
//                }
//            }
//        }
//
//    }
}
