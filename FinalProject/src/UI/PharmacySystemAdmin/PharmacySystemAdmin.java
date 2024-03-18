/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.PharmacySystemAdmin;

import ApplicationSystem.ApplicationSystem;
import UI.PharmacyLogin.PharmacyLoginJFrame;
import User.UserAccount;

/**
 *
 * @author rushita
 */
public class PharmacySystemAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PharmacySystemAdmin
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    public PharmacySystemAdmin(ApplicationSystem applicationSystem, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        
        this.applicationSystem = applicationSystem;
        this.userAccount = useraccount;
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
        viewUserBtn = new javax.swing.JButton();
        createStoreBtn = new javax.swing.JButton();
        updateUserBtn = new javax.swing.JButton();
        deleteUserBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createCompanyBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(204, 204, 255));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel1.setBackground(new java.awt.Color(125, 125, 199));
        jPanel1.setMinimumSize(new java.awt.Dimension(240, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewUserBtn.setBackground(new java.awt.Color(204, 204, 255));
        viewUserBtn.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        viewUserBtn.setText("DASHBOARD");
        viewUserBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 200, 43));

        createStoreBtn.setBackground(new java.awt.Color(204, 204, 255));
        createStoreBtn.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        createStoreBtn.setText("CREATE STORES");
        createStoreBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createStoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStoreBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createStoreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 43));

        updateUserBtn.setBackground(new java.awt.Color(204, 204, 255));
        updateUserBtn.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        updateUserBtn.setText("UPDATE USERS");
        updateUserBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, 43));

        deleteUserBtn.setBackground(new java.awt.Color(204, 204, 255));
        deleteUserBtn.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        deleteUserBtn.setText("DELETE USERS");
        deleteUserBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 200, 43));

        logoutBtn.setBackground(new java.awt.Color(204, 204, 255));
        logoutBtn.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-logout-25.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 29, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-system-administrator-male-96.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        createCompanyBtn.setBackground(new java.awt.Color(204, 204, 255));
        createCompanyBtn.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        createCompanyBtn.setText("CREATE COMPANY");
        createCompanyBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createCompanyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCompanyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createCompanyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 43));

        jLabel7.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Hello, Pharma Admin");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 30));

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(173, 175, 188));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHARMACY SYSTEM ADMIN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 30, 1140, -1));

        jLabel2.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel2.setText("Welcome to the Pharma System Admin Panel, your centralized command center for creating companies and stores, accessing dashboards ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, 30));

        jLabel5.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel5.setText(" for insights, and efficiently managing user accounts with options to update or delete as needed.");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/17c8d541af5aaded3c280c7f8d7d7e9c.gif"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUserBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharmaView(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_viewUserBtnActionPerformed

    private void createStoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStoreBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharmaCreateStore(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_createStoreBtnActionPerformed

    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharmaUpdate(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharmaDelete(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PharmacyLoginJFrame pj = new PharmacyLoginJFrame(this.applicationSystem, this.userAccount);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void createCompanyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCompanyBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharmaCreateCompany(this.applicationSystem, this.userAccount));
 
    }//GEN-LAST:event_createCompanyBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PharmacySystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmacySystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmacySystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmacySystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PharmacySystemAdmin(applicationSystem, useraccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createCompanyBtn;
    private javax.swing.JButton createStoreBtn;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton updateUserBtn;
    private javax.swing.JButton viewUserBtn;
    // End of variables declaration//GEN-END:variables
}