/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BusinessAdmin;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sathya
 */
public class BusinessAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form BusinessAdminWorkArea
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Business business;

    public BusinessAdminWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
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

        manageEmpBtn2 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        managePriceBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageEmpBtn2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        manageEmpBtn2.setText("MANAGE EMPLOYEES");
        manageEmpBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpBtn2ActionPerformed(evt);
            }
        });
        add(manageEmpBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 260, 50));

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        userJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        userJButton.setText("MANAGE USERS");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 260, 50));

        manageOrganizationJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        manageOrganizationJButton.setText("MANAGE ORGANIZATIONS");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 50));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("BUSINESS ADMIN WORK AREA");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 390, 40));

        managePriceBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        managePriceBtn.setText("MANAGE PRICING");
        managePriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePriceBtnActionPerformed(evt);
            }
        });
        add(managePriceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 260, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/BusinessAdmin/adminworkarea.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 220, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/BusinessAdmin/Background.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 1100));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmpBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpBtn2ActionPerformed
        // TODO add your handling code here:
        ManageAppSubEmpPanel manageAppSubEmpPanel = new ManageAppSubEmpPanel(userProcessContainer, account, organization, business);
        userProcessContainer.add("manageAppSubEmpPanel", manageAppSubEmpPanel);
        ((CardLayout) this.userProcessContainer.getLayout()).next(this.userProcessContainer);
    }//GEN-LAST:event_manageEmpBtn2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageAppSubEmpUserAccountJPanel manageAppSubEmpUserAccountJPanel = new ManageAppSubEmpUserAccountJPanel(userProcessContainer, business);
        this.userProcessContainer.add("manageAppSubEmpUserAccountJPanel", manageAppSubEmpUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageAppSubEmpOrganizationJPanel manageAppSubEmpOrganizationJPanel = new ManageAppSubEmpOrganizationJPanel(userProcessContainer, business.getOrganizationDirectory());
        this.userProcessContainer.add("manageAppSubEmpOrganizationJPanel", manageAppSubEmpOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void managePriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePriceBtnActionPerformed
        // TODO add your handling code here:
        ManagePricingJPanel managePricingJPanel = new ManagePricingJPanel(userProcessContainer, account, organization, business);
        this.userProcessContainer.add("managePricingJPanel", managePricingJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePriceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton manageEmpBtn2;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton managePriceBtn;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
