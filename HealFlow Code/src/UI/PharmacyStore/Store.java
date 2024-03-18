/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.PharmacyStore;

import ApplicationSystem.ApplicationSystem;
import UI.PharmacyLogin.PharmacyLoginJFrame;
import User.UserAccount;

/**
 *
 * @author rushita
 */
public class Store extends javax.swing.JFrame {

    /**
     * Creates new form Store
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    public Store(ApplicationSystem applicationSystem, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        
        this.applicationSystem = applicationSystem;
        this.userAccount = useraccount;
        
        this.jLabel2.setText(userAccount.getUserName());
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
        requestMedicineBtn = new javax.swing.JButton();
        viewPatientsBtn = new javax.swing.JButton();
        dashboardBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel1.setBackground(new java.awt.Color(125, 125, 199));
        jPanel1.setMinimumSize(new java.awt.Dimension(240, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestMedicineBtn.setBackground(new java.awt.Color(204, 204, 255));
        requestMedicineBtn.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        requestMedicineBtn.setText("REQUEST MEDICINES");
        requestMedicineBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMedicineBtnActionPerformed(evt);
            }
        });
        jPanel1.add(requestMedicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 43));

        viewPatientsBtn.setBackground(new java.awt.Color(204, 204, 255));
        viewPatientsBtn.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        viewPatientsBtn.setText("VIEW PATIENTS");
        viewPatientsBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewPatientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewPatientsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, 43));

        dashboardBtn.setBackground(new java.awt.Color(204, 204, 255));
        dashboardBtn.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        dashboardBtn.setText("DASHBOARD");
        dashboardBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dashboardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, 43));

        logoutBtn.setBackground(new java.awt.Color(204, 204, 255));
        logoutBtn.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 130, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-logout-25.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 29, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-new-store-80.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Hello, Store");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 130, 30));

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STORE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/pharm2.jpeg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 1060, 720));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel1.setText("Explore our pharmacy management hub where you can effortlessly view patient details, request medicines, access a comprehensive dashboard,");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 40));

        jLabel7.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel7.setText("and generate insightful reports, all designed to streamline your pharmacy operations.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PharmacyLoginJFrame plj = new PharmacyLoginJFrame(this.applicationSystem, this.userAccount);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharStoreDashboard(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void viewPatientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientsBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharStoreViewPatients(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_viewPatientsBtnActionPerformed

    private void requestMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMedicineBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharStoreRequestMedicines(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_requestMedicineBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Store(applicationSystem, useraccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardBtn;
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
    private javax.swing.JButton requestMedicineBtn;
    private javax.swing.JButton viewPatientsBtn;
    // End of variables declaration//GEN-END:variables
}
