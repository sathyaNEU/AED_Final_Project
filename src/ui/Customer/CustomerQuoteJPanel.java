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
import ErrorHelper.ErrorHelper;
import business.Enterprise.AppLogBusiness.DailyPricing;
import business.Enterprise.AppLogBusiness.Pkg;
import business.WorkQueue.AssignEmpWorkRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sathya
 */
public class CustomerQuoteJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerQuoteJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Business business;
    float weight;
    Pkg pkg;
    public CustomerQuoteJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        populateCmbBox();
        this.proceedBtn.setVisible(false);
        this.typeCmbBox.setVisible(false);
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
        btnBack1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        expGstTextField = new javax.swing.JTextField();
        expTotalChargesTextField = new javax.swing.JTextField();
        expScTextField = new javax.swing.JTextField();
        priGstTextField = new javax.swing.JTextField();
        priTcTextField = new javax.swing.JTextField();
        priScTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        getQuoteBtn = new javax.swing.JButton();
        typeCmbBox = new javax.swing.JComboBox();
        proceedBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Estimated Billing");

        btnBack1.setText("<< Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Weight in kg's ");

        jLabel3.setText("Shipping Charges ");

        jLabel4.setText("GST");

        jLabel5.setText("Total Charges");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Priority");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Express");

        getQuoteBtn.setText("Generate");
        getQuoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getQuoteBtnActionPerformed(evt);
            }
        });

        proceedBtn.setText("Proceed ");
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(proceedBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expGstTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(expTotalChargesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(expScTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priGstTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priTcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priScTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 201, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getQuoteBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(370, 370, 370))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnBack1)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getQuoteBtn))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(expScTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(expGstTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(expTotalChargesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priScTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(priGstTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(priTcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proceedBtn))
                .addContainerGap(406, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void getQuoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getQuoteBtnActionPerformed
        // TODO add your handling code here:
        try{
            float weight = (Float.parseFloat(this.weightTextField.getText()));
            String today = new SimpleDateFormat("dd/MM/YYYY").format(new Date());
            DailyPricing dp = this.business.getDailyPricingList().getDailyPricingList(today);
            if(dp!=null){
            float expSc = dp.getExpressPrice()* weight;
            float expGst = expSc*10/100;
            float expTc = expGst + expSc;
            
            float priSc = dp.getPriorityPrice()*weight;
            float priGst = priSc*10/100;
            float priTc = priGst + priSc;
            
            expScTextField.setText(String.valueOf(expSc));
            expGstTextField.setText(String.valueOf(expGst));
            expTotalChargesTextField.setText(String.valueOf(expTc));
            
            priScTextField.setText(String.valueOf(priSc));
            priGstTextField.setText(String.valueOf(priGst));
            priTcTextField.setText(String.valueOf(priTc));
            
            JOptionPane.showMessageDialog(this, "Prices are updated as of "+today);
            this.weight = weight;
            this.typeCmbBox.setVisible(true);
            this.proceedBtn.setVisible(true);
            }
            else
                ErrorHelper.showError("Prices Not Yet Configured. Please reach out to Audmin");
        }
        catch(Exception e){
            e.printStackTrace();
            ErrorHelper.showError("Weight Cannot contain any other characters other than 0-9");
        }
    }//GEN-LAST:event_getQuoteBtnActionPerformed

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        // TODO add your handling code here:
        //0-> express 1->priority
        int index = this.typeCmbBox.getSelectedIndex();
        if(index==0){
           this.pkg = this.business.getPackageList().createPackage(account, "Express");
           String today = new SimpleDateFormat("dd/MM/YYYY").format(new Date());
           DailyPricing dp = this.business.getDailyPricingList().getDailyPricingList(today);
           if(pkg!=null){   
               pkg.setWeight(this.weight);
               pkg.setShippingPrice(this.weight*dp.getExpressPrice());
               pkg.setGst(pkg.getShippingPrice()*10/100);
               pkg.setNetPrice();
           }
           else{
               ErrorHelper.showError("Something went wrong");
               return;
           }
        }
        else if(index==1){
           this.pkg = this.business.getPackageList().createPackage(account, "Priority");
           String today = new SimpleDateFormat("dd/MM/YYYY").format(new Date());
           DailyPricing dp = this.business.getDailyPricingList().getDailyPricingList(today);
           if(pkg!=null){   
               pkg.setWeight(this.weight);
               pkg.setShippingPrice(this.weight*dp.getPriorityPrice());
               pkg.setGst(pkg.getShippingPrice()*10/100);
               pkg.setNetPrice();
           }
           else{
               ErrorHelper.showError("Something went wrong");
               return;
           }
        }
        AssignEmpWorkRequest assignEmpWorkRequest = new AssignEmpWorkRequest();
        assignEmpWorkRequest.setPkg(pkg);
        assignEmpWorkRequest.setSender(account);
        assignEmpWorkRequest.setStatus("Sent");
        assignEmpWorkRequest.setMessage("Request for Support Person Assignment");
        assignEmpWorkRequest.setRequestDate(new Date());
        this.account.getWorkQueue().getWorkRequestList().add(assignEmpWorkRequest);
        this.business.getAppLogEmpOrganization().getWorkQueue().getWorkRequestList().add(assignEmpWorkRequest);
        JOptionPane.showMessageDialog(this, "A request has been sent to the concerned team\n. You will be assigned an Logistic Support Person very soon\nHope you have a good experience");
        
    }//GEN-LAST:event_proceedBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JTextField expGstTextField;
    private javax.swing.JTextField expScTextField;
    private javax.swing.JTextField expTotalChargesTextField;
    private javax.swing.JButton getQuoteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField priGstTextField;
    private javax.swing.JTextField priScTextField;
    private javax.swing.JTextField priTcTextField;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JComboBox typeCmbBox;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables

    private void populateCmbBox() {
        this.typeCmbBox.removeAllItems();
        this.typeCmbBox.addItem("Express");
        this.typeCmbBox.addItem("Priority");
    }
}
