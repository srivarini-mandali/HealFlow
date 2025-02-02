/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.AmbulanceDriver;

import Ambulance.Driver;
import ApplicationSystem.ApplicationSystem;
import UI.AmbulanceLogin.AmbulanceLoginJFrame;
import User.UserAccount;

/**
 *
 * @author rushita
 */
public class AmbulanceDriver extends javax.swing.JFrame {

    /**
     * Creates new form AmbulanceDriver
     */
    ApplicationSystem appSystem;
    UserAccount userAccount;
    public AmbulanceDriver(ApplicationSystem applicationSystem, UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        
        this.appSystem = applicationSystem;
        this.userAccount = userAccount;
        
        this.lblDriverUser.setText(userAccount.getUserName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnProfile = new javax.swing.JButton();
        btnVehicleRequest = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDriverUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel1.setBackground(new java.awt.Color(125, 125, 199));
        jPanel1.setMinimumSize(new java.awt.Dimension(240, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProfile.setBackground(new java.awt.Color(204, 204, 255));
        btnProfile.setFont(new java.awt.Font("Baskerville", 1, 16)); // NOI18N
        btnProfile.setText("PROFILE");
        btnProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, 40));

        btnVehicleRequest.setBackground(new java.awt.Color(204, 204, 255));
        btnVehicleRequest.setFont(new java.awt.Font("Baskerville", 1, 16)); // NOI18N
        btnVehicleRequest.setText("VEHICLE'S REQUESTS");
        btnVehicleRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVehicleRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleRequestActionPerformed(evt);
            }
        });
        jPanel1.add(btnVehicleRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 220, 40));

        btnDashboard.setBackground(new java.awt.Color(204, 204, 255));
        btnDashboard.setFont(new java.awt.Font("Baskerville", 1, 16)); // NOI18N
        btnDashboard.setText("DASHBOARD");
        btnDashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });
        jPanel1.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 40));

        logoutBtn.setBackground(new java.awt.Color(204, 204, 255));
        logoutBtn.setFont(new java.awt.Font("Baskerville", 1, 18)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 130, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-logout-25.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 29, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-driver-96.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Hello, Driver");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 240, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDriverUser.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        lblDriverUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDriverUser.setText("Driver User");
        jPanel2.add(lblDriverUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1190, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/driver (1).png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 780, 600));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel1.setText("Drive with Confidence: Request Vehicles, Update Your Profile, and Explore Your Dashboard");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new DriverProfile(this.appSystem, this.userAccount));
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnVehicleRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleRequestActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new DriverVehicleRequest(this.appSystem, this.userAccount));
    }//GEN-LAST:event_btnVehicleRequestActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new DriverDashboard(this.appSystem, this.userAccount));
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AmbulanceLoginJFrame aj = new AmbulanceLoginJFrame(this.appSystem, this.userAccount);
    }//GEN-LAST:event_logoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AmbulanceDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmbulanceDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmbulanceDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmbulanceDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AmbulanceDriver(applicationSystem, useraccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnVehicleRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblDriverUser;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
