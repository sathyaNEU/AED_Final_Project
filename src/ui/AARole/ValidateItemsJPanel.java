/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AARole;

import business.Business;
import business.Enterprise.AppLogBusiness.Item;
import business.Enterprise.AppLogBusiness.Pkg;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CustomsWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ErrorHelper.ErrorHelper;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sathya
 */
public class ValidateItemsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ValidateItemsJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Business business;
    CustomsWorkRequest request;
    Pkg pkg;
    ArrayList<Item> items;
    
    public ValidateItemsJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, CustomsWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        this.request = request;
        this.pkg = request.getPkg();
        this.items = this.pkg.getItemList().getItemList();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        acceptBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsTbl = new javax.swing.JTable();
        rejectbtn = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("CUSTOMS WORK RESPONSIBILITY");

        btnBack2.setText("<< Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBtn.setText("Push Response to Logistics Enterprise");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        acceptBtn.setText("Accept");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        itemsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Status"
            }
        ));
        jScrollPane1.setViewportView(itemsTbl);

        rejectbtn.setText("Reject");
        rejectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(acceptBtn)
                        .addGap(18, 18, 18)
                        .addComponent(rejectbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(saveBtn)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack2)
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(rejectbtn))
                .addGap(39, 39, 39)
                .addComponent(saveBtn)
                .addContainerGap(467, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        boolean canContinue = checkIfActionsPerformed();
        if (canContinue) {
            this.pkg.setStatus(6);
            this.request.setStatus("Completed");
            this.request.setResolveDate(new Date());
            JOptionPane.showMessageDialog(this, "Response forwarded back to logistic enterprise");
        } else {
            ErrorHelper.showError("Items not thoroughly reviewed");
        }
        

    }//GEN-LAST:event_saveBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void rejectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rejectbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton btnBack2;
    private javax.swing.JTable itemsTbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton rejectbtn;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)this.itemsTbl.getModel();
        dtm.setRowCount(0);
        for (Item item : this.items) {
            Object[] obj = new Object[2];
            obj[0] = item.getItem();
            obj[1] = String.valueOf("No Actions Performed");
            dtm.addRow(obj);
        }
    }
    
    private boolean checkIfActionsPerformed() {
        int counter = 0;
        for (Item item : this.items) {
            if (item.getStatus().equalsIgnoreCase("No Actions Performed")) {
                counter += 1;
            }
        }
        if (counter == 0) {
            return true;
        }
        return false;
    }
}
