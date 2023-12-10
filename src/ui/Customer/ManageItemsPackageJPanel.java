/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import business.Business;
import business.Enterprise.AppLogBusiness.Item;
import business.Enterprise.AppLogBusiness.Pkg;
import business.Enterprise.AppLogBusiness.sItemList;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ErrorHelper.ErrorHelper;
import business.WorkQueue.AssignEmpWorkRequest;
import business.WorkQueue.PackingRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sathya
 */
public class ManageItemsPackageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageItemsPackageJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Business business;
    Pkg pkg;
    ArrayList<Item> tempItems;

    public ManageItemsPackageJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        populatePkgCB();
        populateItemsCB();
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
        pkgCmbBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemCmbBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsTbl = new javax.swing.JTable();
        removeBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        backBtn2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Manage Package Items");

        pkgCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pkgCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkgCmbBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Package");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Items");

        itemCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        itemsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Item"
            }
        ));
        jScrollPane1.setViewportView(itemsTbl);

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBtn.setText("Push Request to Support Person");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(removeBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(itemCmbBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(pkgCmbBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addComponent(addBtn)
                                            .addGap(0, 217, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(backBtn2)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(saveBtn)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn2)))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pkgCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeBtn)
                .addGap(36, 36, 36)
                .addComponent(saveBtn)
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pkgCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkgCmbBoxActionPerformed
        // TODO add your handling code here:
        this.pkg = (Pkg) this.pkgCmbBox.getSelectedItem();
        if(this.pkg!=null){
        this.tempItems = this.pkg.getItemList().getItemList();
        poulateItemsTbl(this.pkg);
        }
    }//GEN-LAST:event_pkgCmbBoxActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) itemsTbl.getModel();
        int index  = this.itemsTbl.getSelectedRow();
        Item item = (Item)this.itemsTbl.getValueAt(index, 0);
        if(index==-1)
            ErrorHelper.showWarning("A row must be selected");
        else{
            this.tempItems.remove(item);
            poulateItemsTbl(this.pkg);
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        Item item = (Item)this.itemCmbBox.getSelectedItem();
        if(!this.tempItems.contains(item))
            this.tempItems.add(item);
        else
            ErrorHelper.showWarning("Item already added");
        poulateItemsTbl(pkg);
    }//GEN-LAST:event_addBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        boolean isExist = checkAnyOpenReqExist();
        if(!isExist){
        this.pkg.setStatus(2);
        AssignEmpWorkRequest assignEmpWorkRequest = new AssignEmpWorkRequest();
        assignEmpWorkRequest.setPkg(pkg);
        assignEmpWorkRequest.setSender(account);
        assignEmpWorkRequest.setStatus("Sent");
        assignEmpWorkRequest.setMessage("Packing request initiated");
        assignEmpWorkRequest.setRequestDate(new Date());
        this.account.getWorkQueue().getWorkRequestList().add(assignEmpWorkRequest);
        this.business.getAppLogEmpOrganization().getWorkQueue().getWorkRequestList().add(assignEmpWorkRequest);
        JOptionPane.showMessageDialog(this, "A request has been sent to the concerned team\nYou will be assigned an Logistic Support Person very soon\nHope you have a good experience");
        }
        else{
            ErrorHelper.showError("One of our representatives will look into your\nrequest. Thanks for your patience");
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        ((CardLayout)this.userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backBtn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn2;
    private javax.swing.JComboBox itemCmbBox;
    private javax.swing.JTable itemsTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox pkgCmbBox;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables

    private void populatePkgCB() {
        System.out.println("called 1st");
        this.pkgCmbBox.removeAllItems();
        for (Pkg pkg : this.business.getPackageList().getPackageList()) {
            if (pkg.getCustomerUA().equals(this.account) && pkg.getStatus() == 1) {
                this.pkgCmbBox.addItem(pkg);
            }
        }
        this.pkg = (Pkg) this.pkgCmbBox.getSelectedItem();

    }

    private void populateItemsCB() {
        this.itemCmbBox.removeAllItems();
        for (Item item : sItemList.staticItemList) {
            this.itemCmbBox.addItem(item);
        }
    }

    private void poulateItemsTbl(Pkg pkg) {
        DefaultTableModel dtm = (DefaultTableModel) itemsTbl.getModel();
        dtm.setRowCount(0);
        if(this.tempItems!=null)
        for (Item item : this.tempItems) {
            Object[] obj = new Object[1];
            obj[0] = item;
            dtm.addRow(obj);
        }
    }

    private boolean checkAnyOpenReqExist() {
        for(WorkRequest workRequest : this.account.getWorkQueue().getWorkRequestList()){
            if(workRequest.getStatus().equalsIgnoreCase("Pending") ||
               workRequest.getStatus().equalsIgnoreCase("Processing")||
               workRequest.getStatus().equalsIgnoreCase("Sent"))
                return true;
        }
        return false;
    }
    
}
