/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DiagnosticsDiagnostician;

import UI.SystemAdmin.*;
import ApplicationSystem.ApplicationSystem;
import Diagnostic.AssignedMachine;
import Diagnostic.Diagnosticians;
import Patient.DiagnosticRequest;
import UI.PharmacyStore.PharStoreRequestMedicines;
import User.UserAccount;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rushita
 */
public class DiaAssignPatients extends javax.swing.JPanel {

    /**
     * Creates new form DeleteJPanel
     */
    
    ApplicationSystem applicationSystem;
    Diagnosticians diagnostician;
    DefaultTableModel machineTableModel;
    DefaultTableModel RequestTableModel;
    
    public DiaAssignPatients(ApplicationSystem applicationSystem, UserAccount userAccount) {
        initComponents();
        this.applicationSystem = applicationSystem;
         this.diagnostician = (Diagnosticians) userAccount;
        this.machineTableModel = (DefaultTableModel) tblMachine.getModel();
        this.RequestTableModel = (DefaultTableModel) tblPatient.getModel();
        populateMachine();
        populateRequests();
        tblMachine.setDefaultRenderer(Object.class, new MyCellRenderer());
        tblPatient.setDefaultRenderer(Object.class, new MyCellRenderer());
    }
    
    private class MyCellRenderer extends DefaultTableCellRenderer {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (row % 2 == 0) {
                c.setBackground(new Color(204, 204, 255)); 
            } else {
                c.setBackground(new Color(204, 204, 255)); 
            }
            return c;
        }
    }
    public void populateMachine(){
        machineTableModel.setRowCount(0);
        
        for(AssignedMachine am : diagnostician.getAssgMachineDirectory().getAssignedMachineHospital()){
            Object rows[] = new Object[1];
            rows[0] = am.getMachineDetail().getMachineName();
            
            machineTableModel.addRow(rows);
        }
    }
    
    public void populateRequests(){
        RequestTableModel.setRowCount(0);
        for(DiagnosticRequest dr: diagnostician.getDiagnosticRequestDirectory().getDiagnosticDetailRequestList()){
            Object rows[] = new Object[2];
            rows[0] = dr.getPatientInfo().getUserName();
            rows[1] = dr.getTestNameDetail();
            
            RequestTableModel.addRow(rows);
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

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMachine = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        txtTest = new javax.swing.JTextField();
        lblTestResult = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(56, 16, 151));

        lblTitle.setBackground(new java.awt.Color(54, 125, 118));
        lblTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ASSIGN PATIENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tblMachine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Machine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMachine);

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient", "Test"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPatient);

        txtTest.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        txtTest.setForeground(new java.awt.Color(61, 118, 125));
        txtTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTestActionPerformed(evt);
            }
        });

        lblTestResult.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblTestResult.setText("Test Result");

        btnSend.setBackground(new java.awt.Color(204, 204, 255));
        btnSend.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        btnSend.setText("Send Report");
        btnSend.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTestResult)
                .addGap(46, 46, 46)
                .addComponent(txtTest, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(512, 512, 512))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTestResult)
                    .addComponent(txtTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(508, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        int row = tblMachine.getSelectedRow();
        int patientrow = tblPatient.getSelectedRow();
        
        
        if(row == -1)
        {
            JOptionPane.showMessageDialog(null,"Please select a Machine", "Select Warning", 2);
            return;
        }
        
        if(patientrow == -1)
        {
            JOptionPane.showMessageDialog(null,"Please select a Patient", "Select Warning", 2);
            return;
            
        }
        
        DiagnosticRequest dr = diagnostician.getDiagnosticRequestDirectory().getDiagnosticDetailRequestList().get(patientrow);
        AssignedMachine am = diagnostician.getAssgMachineDirectory().getAssignedMachineHospital().get(row);
        
        dr.setResultInfo(txtTest.getText());
        am.getMachineDetail().setAvailability(true);
        am.getMachineDetail().setDiagnosticians(null);
        diagnostician.getAssgMachineDirectory().getAssignedMachineHospital().remove(am);
        diagnostician.getDiagnosticRequestDirectory().getDiagnosticDetailRequestList().remove(dr);
        
        dr.getDiagInfo().increasetests();
        
        
        JOptionPane.showMessageDialog(null, "Succefully Published Results");
        populateMachine();
           
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTestResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblMachine;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtTest;
    // End of variables declaration//GEN-END:variables
}
