/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.AssignEmpWorkRequest;
import business.WorkQueue.LabTestWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sathya
 */
public class RequestHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderHistoryJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Business business;
    public RequestHistoryJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        backBtn2 = new javax.swing.JButton();

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Recipient", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequests);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Requests sent to Logistic Support Team");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        backBtn2.setText("<< Back");
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backBtn2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(backBtn2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(489, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        ((CardLayout)this.userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backBtn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton backBtn2;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        model.setRowCount(0);
        for (WorkRequest request : this.account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((AssignEmpWorkRequest) request).getResult();
            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
    }
}