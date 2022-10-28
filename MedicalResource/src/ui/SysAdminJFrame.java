/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author siddh
 */
public class SysAdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SysAdminJFrame
     */
    
    static SysAdminJFrame sysadminJFrame;
    CommunityDirectory communityDirectory;
    HospitalDirectory hospitalDirectory;
    DoctorDirectory doctorDirectory;
    Person person;
    PersonDirectory personDirectory;
    
    public SysAdminJFrame() {
        initComponents();
    }
    
    public SysAdminJFrame(SysAdminJFrame sysadminJFrame) {
        this.sysadminJFrame = sysadminJFrame;
    }
    
    public SysAdminJFrame(CommunityDirectory communityDirectory, HospitalDirectory hospitalDirectory,DoctorDirectory doctorDirectory,
    Person person, PersonDirectory personDirectory) {
        initComponents();
        this.communityDirectory = communityDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.doctorDirectory = doctorDirectory;
        this.person = person;
        this.personDirectory = personDirectory;
    }
    
//    public static void closeFrame() {
//        sysadminJFrame.dispose();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHosAdmin = new javax.swing.JButton();
        btnComAdmin = new javax.swing.JButton();
        btnCrtCommunity = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHosAdmin.setText("HOSPITAL ADMIN");
        btnHosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosAdminActionPerformed(evt);
            }
        });

        btnComAdmin.setText("COMMUNITY ADMIN");
        btnComAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComAdminActionPerformed(evt);
            }
        });

        btnCrtCommunity.setText("CREATE COMMUNITIES");
        btnCrtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrtCommunityActionPerformed(evt);
            }
        });

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
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHosAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnComAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrtCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(btnBack)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnHosAdmin)
                .addGap(45, 45, 45)
                .addComponent(btnComAdmin)
                .addGap(38, 38, 38)
                .addComponent(btnCrtCommunity)
                .addGap(35, 35, 35)
                .addComponent(btnBack)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        sysadminJFrame.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnComAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComAdminActionPerformed
        // TODO add your handling code here:
        CommunityAdminJFrame communityAdminJFrame = new CommunityAdminJFrame(hospitalDirectory);
        communityAdminJFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        communityAdminJFrame.setVisible(true);
        new CommunityAdminJFrame(communityAdminJFrame);
    }//GEN-LAST:event_btnComAdminActionPerformed

    private void btnCrtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrtCommunityActionPerformed
        // TODO add your handling code here:
        SysAdminCreateCommunitiesJFrame sysAdminCreateCommunity = new SysAdminCreateCommunitiesJFrame(communityDirectory);
        sysAdminCreateCommunity.setExtendedState(JFrame.MAXIMIZED_BOTH);
        sysAdminCreateCommunity.setVisible(true);
        new SysAdminCreateCommunitiesJFrame(sysAdminCreateCommunity);
    }//GEN-LAST:event_btnCrtCommunityActionPerformed

    private void btnHosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosAdminActionPerformed
        // TODO add your handling code here:
        HospitalJFrame hospitalJFrame = new HospitalJFrame(person, doctorDirectory, personDirectory);
        hospitalJFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        hospitalJFrame.setVisible(true);
        new HospitalJFrame(hospitalJFrame);
    }//GEN-LAST:event_btnHosAdminActionPerformed

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
            java.util.logging.Logger.getLogger(SysAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SysAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SysAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SysAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SysAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnComAdmin;
    private javax.swing.JButton btnCrtCommunity;
    private javax.swing.JButton btnHosAdmin;
    // End of variables declaration//GEN-END:variables
}
