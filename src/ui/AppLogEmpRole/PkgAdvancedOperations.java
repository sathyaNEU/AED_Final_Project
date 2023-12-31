/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AppLogEmpRole;

import business.Business;
import business.Enterprise.AppLogBusiness.Pkg;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.AssignEmpWorkRequest;
import business.WorkQueue.CargoWorkRequest;
import business.WorkQueue.CustomsWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sathya
 */
public class PkgAdvancedOperations extends javax.swing.JPanel {

    /**
     * Creates new form PkgAdvancedOperations
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Business business;
    AssignEmpWorkRequest prevreq;
    Pkg pkg;
    public PkgAdvancedOperations(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, AssignEmpWorkRequest prevreq) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        this.prevreq = prevreq;
        this.pkg = this.prevreq.getPkg();
        this.idTextField.setText(this.pkg.toString());
        this.ownerTextField.setText(this.pkg.getCustomerUA().getEmployee().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ownerTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CUSTOMS AND CARGO WORK RESPONSIBILITY");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 580, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PACKAGE ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 130, 25));

        idTextField.setEditable(false);
        idTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 180, 40));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setText("MOVE TO CUSTOMS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 220, 50));

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton2.setText("MOVE TO SHIPPING");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 220, 50));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("OWNER");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 83, 25));

        ownerTextField.setEditable(false);
        ownerTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        add(ownerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 210, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/AppLogEmpRole/PackageOpr.jpeg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 310, 180));

        btnBack2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/PerformanceReports/left-arrow-in-circular-button-black-symbol.png"))); // NOI18N
        btnBack2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        btnBack2.setOpaque(true);
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/AppLogEmpRole/Background.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 1100));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.pkg.getStatus()==4){
        CustomsWorkRequest customsWorkRequest = new CustomsWorkRequest();
        customsWorkRequest.setPrevAssEmpReq(this.prevreq);
        customsWorkRequest.setSender(account);
        customsWorkRequest.setStatus("Sent");
        customsWorkRequest.setMessage("Requesting for Custom Clearance");
        customsWorkRequest.setRequestDate(new Date());
        customsWorkRequest.setPkg(this.pkg);
        customsWorkRequest.getPkg().setStatus(5);
        this.business.getAAOrganization().getWorkQueue().getWorkRequestList().add(customsWorkRequest);
        this.account.getWorkQueue().getWorkRequestList().add(customsWorkRequest);
        JOptionPane.showMessageDialog(this, "Work Request Sent");
        }
        else
            ErrorHelper.ErrorHelper.showError("The package is not authorized to move forward");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      if(this.pkg.getStatus()==6){
        CargoWorkRequest cargoWorkRequest = new CargoWorkRequest();
        cargoWorkRequest.setPrevAssignEmpReq(this.prevreq);
        cargoWorkRequest.setSender(account);
        cargoWorkRequest.setStatus("Sent");
        cargoWorkRequest.setMessage("Requesting for Shipping Details");
        cargoWorkRequest.setRequestDate(new Date());
        cargoWorkRequest.setPkg(this.pkg);
        this.business.getCargoOrganization().getWorkQueue().getWorkRequestList().add(cargoWorkRequest);
        this.account.getWorkQueue().getWorkRequestList().add(cargoWorkRequest);
        JOptionPane.showMessageDialog(this, "Work Request Sent");
        }
        else
            ErrorHelper.ErrorHelper.showError("The package is not authorized to move forward");
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField ownerTextField;
    // End of variables declaration//GEN-END:variables
}
