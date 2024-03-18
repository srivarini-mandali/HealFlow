/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmacySystemAdmin;

import UI.SystemAdmin.*;
import ApplicationSystem.ApplicationSystem;
import Roles.StoreRole;
import User.UserAccount;
import com.github.javafaker.Faker;
import javax.swing.JOptionPane;

/**
 *
 * @author rushita
 */
public class PharmaCreateStore extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    public PharmaCreateStore(ApplicationSystem applicationSystem, UserAccount userAccount) {
        initComponents();
        this.applicationSystem = applicationSystem;
        this.userAccount = userAccount;
                setFakeData();

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
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Companyname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(56, 16, 151));

        jLabel14.setBackground(new java.awt.Color(54, 125, 118));
        jLabel14.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CREATE STORES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/store.png"))); // NOI18N

        Companyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanynameActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/user (2).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/padlock.png"))); // NOI18N

        createBtn.setBackground(new java.awt.Color(204, 204, 255));
        createBtn.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        createBtn.setText("CREATE");
        createBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(54, 125, 118));
        jLabel13.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel13.setText("CREDENTIALS");

        jLabel1.setFont(new java.awt.Font("Charter", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Companyname, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(617, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Companyname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(579, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if(userNameField.getText().isEmpty()||passwordField.getText().isEmpty() || Companyname.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All Fields are Compulsory");
        }
        else{
            String userName = userNameField.getText();

            if(this.applicationSystem.getPharmacyUsersDirectory().getStoreDirectoryList().checkingUniqueUserName(userName)){
                this.applicationSystem.getPharmacyUsersDirectory().getStoreDirectoryList().userAccountCreation(userNameField.getText(), passwordField.getText(), new StoreRole(),Companyname.getText());
                //System.out.println("HI"+ this.applicationSystem.getHospitalUserAccountDirectory().getHospitaluseraccountlist().size());
                JOptionPane.showMessageDialog(null, "Created New Store");
            }else{
                JOptionPane.showMessageDialog(null, "Store with same credentials already exists");
            }
        }
        userNameField.setText("");
        passwordField.setText("");
        Companyname.setText("");
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void CompanynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanynameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Companyname;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables

    private void setFakeData() {
         Faker faker = new Faker();
        String fakeUserName = faker.name().username(); // Random username
        String fakePassword = faker.internet().password(); // Random password
        String fakeStoreName = faker.company().name(); // Random store name

        userNameField.setText(fakeUserName);
        passwordField.setText(fakePassword);
        Companyname.setText(fakeStoreName);
    }
}
