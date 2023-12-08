/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sathya
 */
public class CustomerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkArea
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Business business;
    public CustomerWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
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
        getQuoteBtn = new javax.swing.JToggleButton();
        orderHistoryBtn = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Customer Work Area");

        getQuoteBtn.setText("Get Quote");
        getQuoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getQuoteBtnActionPerformed(evt);
            }
        });

        orderHistoryBtn.setText("Order History");
        orderHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderHistoryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(getQuoteBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderHistoryBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                .addContainerGap(632, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addGap(27, 27, 27)
                .addComponent(getQuoteBtn)
                .addGap(33, 33, 33)
                .addComponent(orderHistoryBtn)
                .addContainerGap(647, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getQuoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getQuoteBtnActionPerformed
        // TODO add your handling code here:
        CustomerQuoteJPanel customerQuoteJPanel = new CustomerQuoteJPanel(userProcessContainer, account, organization, business);
        this.userProcessContainer.add("customerQuoteJPanel",customerQuoteJPanel);
        ((CardLayout)this.userProcessContainer.getLayout()).next(this.userProcessContainer);
    }//GEN-LAST:event_getQuoteBtnActionPerformed

    private void orderHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderHistoryBtnActionPerformed
        // TODO add your handling code here:
        OrderHistoryJPanel orderHistoryJPanel = new OrderHistoryJPanel(userProcessContainer, account, organization, business);
        this.userProcessContainer.add("orderHistoryJPanel",orderHistoryJPanel);
        ((CardLayout)this.userProcessContainer.getLayout()).next(this.userProcessContainer);
    }//GEN-LAST:event_orderHistoryBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton getQuoteBtn;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton orderHistoryBtn;
    // End of variables declaration//GEN-END:variables
}
