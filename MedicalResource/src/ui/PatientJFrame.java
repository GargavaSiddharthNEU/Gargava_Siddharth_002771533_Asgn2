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

/**
 *
 * @author siddh
 */
public class PatientJFrame extends javax.swing.JFrame {
    /**
     * Creates new form PatientJFrame
     */
    
     CommunityDirectory communityDirectory;
     DoctorDirectory doctorDirectory;
     HospitalDirectory hospitalDirectory;
     Person person;
    
    public PatientJFrame() {
        initComponents();
        
    }
    
    public PatientJFrame(Person temp) {
        initComponents();
        
        this.communityDirectory = new CommunityDirectory();
        this.doctorDirectory = new DoctorDirectory();
        this.hospitalDirectory = new HospitalDirectory();
        this.person = temp;
        
        //Example1
        Community ncom1 = new Community();
        ncom1.setId("C1");
        ncom1.setName("Park Drive");
        
        communityDirectory.addCommunity(ncom1);
        
        House house1 =new House("H1","Apt9","143","Boston","USA","Park Drive");
        ArrayList<House> houses = new ArrayList<>();
        houses.add(house1);
        
        ncom1.setHouses(houses);
        
        Doctor doc1 = new Doctor();
        doc1.setDoctorID("D1");
        doc1.setDoctorFName("Vivek");
        doc1.setDoctorLName("Bagga");
        doc1.setYearsofExp(35);
        doc1.setHospitalID("Hos1");
        
        doctorDirectory.addDoctor(doc1);
        //Hospital hosp1 = new Hospital("Hos1","Fortis",doctorDirectory,"235 Park Drive");
        
        Hospital hosp1 = new Hospital();
        hosp1.setHospitalName("Fortis");
        hosp1.setHospitalID("Hos1");
        hosp1.setHospitalAddress("235 Park Drive");
        
        hospitalDirectory.addHospital(hosp1);
        
        hosp1.setDoctorDirectory(doctorDirectory);
        
        ncom1.setHospitalDirectory(hospitalDirectory);
        ncom1.setHouses(houses);
        
        //Example 2
        
        Community ncom2 = new Community();
        ncom2.setId("C2");
        ncom2.setName("Washington");
        
        communityDirectory.addCommunity(ncom2);
        
        House house2 =new House("H2","Apt9","143","Boston","USA","Washington");
        ArrayList<House> houses2 = new ArrayList<>();
        houses2.add(house1);
        
        ncom2.setHouses(houses);
        
        Doctor doc2 = new Doctor();
        doc2.setDoctorID("D2");
        doc2.setDoctorFName("Mani");
        doc2.setDoctorLName("Reddy");
        doc2.setYearsofExp(25);
        doc2.setHospitalID("Hos2");
        
        DoctorDirectory dd2 = new DoctorDirectory();
        dd2.addDoctor(doc2);
        //Hospital hosp1 = new Hospital("Hos1","Fortis",doctorDirectory,"235 Park Drive");
        
        Hospital hosp2 = new Hospital();
        hosp2.setHospitalName("Medanta");
        hosp2.setHospitalID("Hos2");
        hosp2.setHospitalAddress("400 Washington");
        
        HospitalDirectory hd2 = new HospitalDirectory();
        hd2.addHospital(hosp2);
        
        hosp2.setDoctorDirectory(dd2);
        
        ncom2.setHospitalDirectory(hd2);
        ncom2.setHouses(houses2);
        
        
        //Example3
       
        
        House house3 =new House("H3","Apt45","143","Boston","USA","Park Drive");
        ArrayList<House> houses3 = new ArrayList<>();
        houses3.add(house3);
        
        ncom1.setHouses(houses3);
        
        Doctor doc3 = new Doctor();
        doc3.setDoctorID("D3");
        doc3.setDoctorFName("Matt");
        doc3.setDoctorLName("Riley");
        doc3.setYearsofExp(40);
        doc3.setHospitalID("Hos3");
        
        DoctorDirectory dd3 = new DoctorDirectory();
        dd3.addDoctor(doc3);
        //Hospital hosp1 = new Hospital("Hos1","Fortis",doctorDirectory,"235 Park Drive");
        
        Hospital hosp3 = new Hospital();
        hosp3.setHospitalName("AIIMS");
        hosp3.setHospitalID("Hos3");
        hosp3.setHospitalAddress("AIIMS Park Drive");
        
        
        hospitalDirectory.addHospital(hosp3);
        
        hosp3.setDoctorDirectory(dd3);
        
        ncom1.setHospitalDirectory(hospitalDirectory);
        ncom1.setHouses(houses3);
        
        //END
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
                Hospital tableHospital = new Hospital();
                DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();

                model.setRowCount(0);

//        String n = (String)cmbChooseHospital.getSelectedItem();
//        Community hospitalcheck = communityDirectory.getCommunities();
//       ArrayList<Hospital> hospitals = communityDirectory.getCommunities().
                String community = person.getHouse().getCommunity();
                ArrayList<Community> list = communityDirectory.getCommunities();
                for (Community com : list) {
                    if (com.getName().equals(community)) {
                        HospitalDirectory hd = com.getHospitalDirectory();

                        ArrayList<Hospital> hospitals = hd.getHospitals();
                        for (Hospital hospital : hospitals) {
                            String n = (String) cmbChooseHospital.getSelectedItem();
                            if (n.equals(hospital.getHospitalName())) {
                                tableHospital = hospital;
                                DoctorDirectory tabDoc = tableHospital.getDoctorDirectory();
                                for (Doctor doctor : tabDoc.getDoctors()) {
                                    Object[] row = new Object[4];

                                    row[0] = doctor.getDoctorID();
                                    row[1] = doctor.getDoctorFName();
                                    row[2] = doctor.getDoctorLName();
                                    row[3] = doctor.getYearsofExp();

                                    model.addRow(row);
                                }
                            }
                        }
                    }
                }
            }
        });
    }
    
    
    public void fillCMBHospital(Person temp){
        String community = temp.getHouse().getCommunity();
        ArrayList<Community> list = communityDirectory.getCommunities();
        for(Community com: list) {
            if(com.getName().equals(community)) {
               HospitalDirectory hd = com.getHospitalDirectory();
               
               ArrayList<Hospital> hospitals = hd.getHospitals();
               for(Hospital hospital : hospitals){
                   cmbChooseHospital.addItem(hospital.getHospitalName());
               }
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PATIENT PAGE");

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
                "DoctorID", "Doctor FName", "Doctor LName", "Year of Exp"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> cmbChooseHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
