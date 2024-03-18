/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AmbulanceDriver;

import Ambulance.AssignedVehicles;
import Ambulance.AssignedVehiclesDirectory;
import Ambulance.Driver;
import UI.DiagnosticsSystemAdmin.*;
import UI.AmbulanceSystemAdmin.*;
import UI.SystemAdmin.*;
import ApplicationSystem.ApplicationSystem;
import User.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rushita
 */
public class DriverProfile extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    private AssignedVehiclesDirectory assignedVehiclesDirectory;

    public DriverProfile(ApplicationSystem applicationSystem, UserAccount userAccount) {
        initComponents();
        this.applicationSystem = applicationSystem;
        this.userAccount = userAccount;
         this.assignedVehiclesDirectory = applicationSystem.getAmbulanceDirectory().getAssignedVehiclesDirectory(); // Initialize the assigned vehicles directory
        populateDriverDetails();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProfile = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtExperience = new javax.swing.JTextField();
        txtVehicle = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProfile.setBackground(new java.awt.Color(56, 16, 151));

        jLabel14.setBackground(new java.awt.Color(54, 125, 118));
        jLabel14.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PROFILE");

        javax.swing.GroupLayout lblProfileLayout = new javax.swing.GroupLayout(lblProfile);
        lblProfile.setLayout(lblProfileLayout);
        lblProfileLayout.setHorizontalGroup(
            lblProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
        );
        lblProfileLayout.setVerticalGroup(
            lblProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblProfileLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(lblProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/user (2).png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 40, 40));

        txtUserName.setEnabled(false);
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 210, 37));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/padlock.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 40, 30));

        txtPassword.setEnabled(false);
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 210, 37));

        jLabel3.setFont(new java.awt.Font("Baskerville", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 70, 20));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 210, 37));

        jLabel4.setFont(new java.awt.Font("Baskerville", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Experience");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, 32));
        add(txtExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 210, 37));

        txtVehicle.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        txtVehicle.setForeground(new java.awt.Color(61, 118, 125));
        txtVehicle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(txtVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 210, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/ambulance.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 60, 40));

        btnUpdate.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 180, 32));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/istockphoto-1212102727-612x612.jpg"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 317, 1000, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
           if(txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty() || txtAge.getText().isEmpty() || txtExperience.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are compulsory");
        return;
    }

    try {
        // Parse age and experience if they are numbers
        double age = Double.parseDouble(txtAge.getText());
        String experience = txtExperience.getText();

        // Retrieve the user account from ApplicationSystem
        UserAccount userAccount = applicationSystem.getUserAccountByUsername(txtUserName.getText());
       Driver driver = (Driver) applicationSystem.getAmbulanceDirectory().getDriverUserDirectory().getDriverByUsername(userAccount.getUserName());

        
            // Update driver details
            driver.setPassword(txtPassword.getText());
            driver.setAge(age);
            driver.setExperience(experience);

            // Show confirmation message
            JOptionPane.showMessageDialog(null, "Profile updated successfully");
            // Show error message
         } catch (Exception ex) {
        // Show error message if age or experience is not a valid number
        JOptionPane.showMessageDialog(null, "Error Updating Profile");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void populateDriverDetails() {
       
       Driver driver = (Driver) applicationSystem.getAmbulanceDirectory().getDriverUserDirectory().getDriverByUsername(userAccount.getUserName());
        if (driver != null) {
            txtUserName.setText(driver.getUserName());
            txtPassword.setText(driver.getPassword());
            txtAge.setText(String.valueOf(driver.getAge()));
            txtExperience.setText(driver.getExperience());

            // Find the assigned vehicle using the new method
            AssignedVehicles assignedVehicle = assignedVehiclesDirectory.findAssignedVehicleByDriver(driver);
            if (assignedVehicle != null && assignedVehicle.getVehicle() != null) {
                txtVehicle.setText(String.valueOf(assignedVehicle.getVehicle().getNumber()));
            } else {
                txtVehicle.setText("No Vehicle Assigned");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Driver not found or invalid user account");
        }
    

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel lblProfile;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtExperience;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel txtVehicle;
    // End of variables declaration//GEN-END:variables
}
