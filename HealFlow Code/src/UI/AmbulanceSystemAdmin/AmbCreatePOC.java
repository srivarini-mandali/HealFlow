/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AmbulanceSystemAdmin;

import UI.SystemAdmin.*;
import ApplicationSystem.ApplicationSystem;
import Roles.AmbulanceDriverRole;
import Roles.AmbulancePOCRole;
import Roles.AmbulanceSystemAdminRole;
import Roles.HospitalSystemAdminRole;
import Roles.Role;
import User.UserAccount;
import User.UserValidationService;
import javax.swing.JOptionPane;

/**
 *
 * @author rushita
 */
public class AmbCreatePOC extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    
    
    public AmbCreatePOC(ApplicationSystem applicationSystem, UserAccount userAccount) {
        initComponents();
        
        this.applicationSystem = applicationSystem;
        this.userAccount = userAccount;
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        lblCredentials = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(56, 16, 151));

        lblTitle.setBackground(new java.awt.Color(54, 125, 118));
        lblTitle.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CREATE POINT OF CONTACTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/user (2).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/padlock.png"))); // NOI18N

        btnCreate.setBackground(new java.awt.Color(204, 204, 255));
        btnCreate.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblCredentials.setBackground(new java.awt.Color(54, 125, 118));
        lblCredentials.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblCredentials.setText("CREDENTIALS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addGap(36, 36, 36)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(660, 660, 660)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(521, 521, 521)
                            .addComponent(jLabel2)
                            .addGap(36, 36, 36)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(609, 609, 609)
                        .addComponent(lblCredentials)))
                .addContainerGap(638, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblCredentials, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(59, 59, 59)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(580, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
          String userName = txtUserName.getText();
          String password = txtPassword.getText();
          UserValidationService validationService = new UserValidationService();
          
           if(userName.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "All Fields are Required");
        return;
         }
    
        if (!validationService.isValidUsername(userName)) {
            JOptionPane.showMessageDialog(null, "Invalid username. It should be 3-15 characters, starting with a letter.");
            return;
        }
    
        if (!validationService.isStrongPassword(password)) {
            String passwordMessage = validationService.getPasswordValidationMessage(password);
            JOptionPane.showMessageDialog(null, passwordMessage);
            return;
        }
       try{
            
            if(this.applicationSystem.getAmbulanceDirectory().getPocUserDirectory().checkingUniqueUserName(userName)){
                     this.applicationSystem.getAmbulanceDirectory().getPocUserDirectory().userAccountCreation(txtUserName.getText(), txtPassword.getText(), new AmbulancePOCRole());
                     //System.out.println("HI"+ this.applicationSystem.getHospitalUserAccountDirectory().getHospitaluseraccountlist().size());
                     JOptionPane.showMessageDialog(null, "Created New Ambulance POC");
                 }else{
                        JOptionPane.showMessageDialog(null, "Ambulance POC with same credentials already exists");
                 }
       }catch (Exception e) {
         JOptionPane.showMessageDialog(null, "An error occurred while creating the account: " + e.getMessage());
    }
      txtUserName.setText(" ");
      txtPassword.setText(" ");
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCredentials;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}