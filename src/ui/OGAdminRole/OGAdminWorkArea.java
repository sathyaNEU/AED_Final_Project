/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.OGAdminRole;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sathya
 */
public class OGAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form OGAdminWorkArea
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Business business;
    public OGAdminWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
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
        manageEmpBtn = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("ON GROUND LOGISTICS ADMIN WORK AREA");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        manageEmpBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        manageEmpBtn.setText("MANAGE EMPLOYEES");
        manageEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpBtnActionPerformed(evt);
            }
        });
        add(manageEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 220, -1));

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        userJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        userJButton.setText(" MANAGE USERS");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 220, -1));

        manageOrganizationJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        manageOrganizationJButton.setText(" MANAGE ORGANIZATIONS");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/OGAdminRole/Admin.jpeg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 260, 280));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/OGAdminRole/Background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setToolTipText("");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1500, 1100));

        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 120, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpBtnActionPerformed
        // TODO add your handling code here:
        ManageOGEmpPanel manageOGEmpPanel = new ManageOGEmpPanel(userProcessContainer, account, organization, business);
        this.userProcessContainer.add("manageOGEmpPanel",manageOGEmpPanel);
        ((CardLayout)this.userProcessContainer.getLayout()).next(this.userProcessContainer);
        
    }//GEN-LAST:event_manageEmpBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageLogEmpUserAccountJPanel manageLogEmpUserAccountJPanel = new ManageLogEmpUserAccountJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageUserAccountJPanel", manageLogEmpUserAccountJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageLogEmpOrganizationJPanel manageLogEmpOrganizationJPanel = new ManageLogEmpOrganizationJPanel(userProcessContainer, business.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageLogEmpOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton manageEmpBtn;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
