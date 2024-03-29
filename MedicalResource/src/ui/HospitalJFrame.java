/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import static ui.DoctorJFrame.doctorJFrame;

/**
 *
 * @author siddh
 */
public class HospitalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HospitalJFrame
     */
    Person person;
    DoctorDirectory doctorDirectory;
    PersonDirectory personDirectory;
    HospitalDirectory hospitalDirectory;
    static HospitalJFrame hospitalJFrame;
    
    public HospitalJFrame() {
        initComponents();
    }
    
    public HospitalJFrame(HospitalJFrame hospitalJFrame) {
        initComponents();
        this.hospitalJFrame = hospitalJFrame;
    }
    
    public HospitalJFrame(Person person, DoctorDirectory doctorDirectory, PersonDirectory personDirectory, HospitalDirectory hospitalDirectory) {
        initComponents();
        
        hospitalSplitPane1 = hospitalSplitPane;
        this.person = person;
        this.doctorDirectory= doctorDirectory;
        this.personDirectory = personDirectory;
        this.hospitalDirectory = hospitalDirectory;
        

        CreateHospitalPanel createHospitalPanel = new CreateHospitalPanel(person, doctorDirectory, personDirectory,hospitalDirectory);
        hospitalSplitPane1.setLeftComponent(createHospitalPanel);

        ViewHospitalPanel viewHospitalPanel = new ViewHospitalPanel(person, doctorDirectory, personDirectory,hospitalDirectory);
        hospitalSplitPane1.setRightComponent(viewHospitalPanel);
    }
    
    public static void closeFrame() {
        hospitalJFrame.dispose();
    }
    
    public static void refreshViewHospitalPanel(Person person, DoctorDirectory doctorDirectory, PersonDirectory personDirectory,HospitalDirectory hospitalDirectory) {
        hospitalSplitPane1.setRightComponent(new ViewHospitalPanel(person, doctorDirectory, personDirectory,hospitalDirectory));
        MainFrame.persistDoctorData(doctorDirectory);
    }
    
    public static void refreshCreateHospitalPanel(Person person, DoctorDirectory doctorDirectory, PersonDirectory personDirectory, HospitalDirectory hospitalDirectory) {
        hospitalSplitPane1.setLeftComponent(new CreateHospitalPanel(person, doctorDirectory, personDirectory,hospitalDirectory));
        MainFrame.persistDoctorData(doctorDirectory);
   }
    
    public static void setCreateDoctorPanel(Person person, DoctorDirectory doctorDirectory, Doctor doctor, HospitalDirectory hospitalDirectory) {
        hospitalSplitPane1.setLeftComponent(new CreateHospitalPanel(person, doctorDirectory, doctor,hospitalDirectory));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hospitalSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        hospitalSplitPane.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        hospitalSplitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hospitalSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hospitalSplitPane)
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
            java.util.logging.Logger.getLogger(HospitalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalJFrame().setVisible(true);
            }
        });
    }

    private static javax.swing.JSplitPane hospitalSplitPane1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane hospitalSplitPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
