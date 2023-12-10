/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AARole;

import ui.CargoRole.*;
import ui.AppLogEmpRole.*;
import business.Business;
import business.WorkQueue.AssignEmpWorkRequest;
import business.WorkQueue.PackingRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ProcessCustoms extends javax.swing.JPanel {

    JPanel userProcessContainer;
    AssignEmpWorkRequest request;
    Business business;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessCustoms(JPanel userProcessContainer, AssignEmpWorkRequest request, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
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

        btnSubmit = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        txtResults = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnSubmit.setText("Submit Result");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResult.setText("Result:");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Result Submission");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResult)
                    .addComponent(btnSubmit)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(33, 33, 33)
                        .addComponent(lblTitle))
                    .addComponent(txtResults, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(76, 76, 76)
                .addComponent(lblResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AppLogEmpWorkArea alewa = (AppLogEmpWorkArea) component;
        alewa.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (request.getPkg().getStatus() == 0) {
            request.setResult(txtResults.getText());
            request.setResolveDate(new Date());
            request.setStatus("Completed");
            request.getPkg().setStatus(1);
            JOptionPane.showMessageDialog(null, "Request processed");
        } else if (request.getPkg().getStatus() == 2) {
            PackingRequest packingRequest = new PackingRequest();
            packingRequest.setPrevReq(request);
            packingRequest.setPkg(request.getPkg());
            packingRequest.setSender(request.getReceiver());
            packingRequest.setStatus("Sent");
            packingRequest.setMessage(request.getPkg());
            packingRequest.setRequestDate(new Date());
            request.getReceiver().getWorkQueue().getWorkRequestList().add(packingRequest);
            this.business.getPackagingOrganization().getWorkQueue().getWorkRequestList().add(packingRequest);
            JOptionPane.showMessageDialog(this, "Request forwarded to Packaging Organization");

            request.setResult("Your Package is now being processed by the packaging agent");
            request.setStatus("Completed");
            request.getPkg().setStatus(3);
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtResults;
    // End of variables declaration//GEN-END:variables
}
