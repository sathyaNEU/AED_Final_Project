/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BusinessAdmin;

import ui.OGAdminRole.*;
import ErrorHelper.ErrorHelper;
import business.Business;
import business.Employee.Employee;
import business.Organization.OGLogEmpOrganization;
import business.Organization.Organization;
import business.Organization.Organization.Type;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sathya
 */
public class ManageAppSubEmpPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOGEmpPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Business business;

    public ManageAppSubEmpPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        populateOrgCmbBox();
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

        lblOrganizationList1 = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        btnCreateEmployee = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblOrganizationPicker = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        lblEmployeeList = new javax.swing.JLabel();
        orgCmbBox = new javax.swing.JComboBox();

        lblOrganizationList1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrganizationList1.setText("New Employee:");

        lblEmployeeName.setText("Name:");

        btnCreateEmployee.setText("Create Employee");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Manage Employees");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganizationPicker.setText("Select Organization:");

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        lblEmployeeList.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmployeeList.setText("Employee List:");

        orgCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgCmbBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmployeeName)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateEmployee)
                            .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeList)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrganizationPicker)
                        .addGap(31, 31, 31)
                        .addComponent(orgCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblOrganizationList1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(26, 26, 26)
                .addComponent(lblEmployeeList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganizationPicker)
                    .addComponent(orgCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOrganizationList1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeName))
                .addGap(18, 18, 18)
                .addComponent(btnCreateEmployee)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed

        String name = txtEmployeeName.getText();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee name cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        this.organization = (Organization)this.orgCmbBox.getSelectedItem();
        if (this.organization != null) {
            Employee emp = this.organization.getEmployeeDirectory().createEmployee(name);
            JOptionPane.showMessageDialog(this, "Employee Created Successfully");
            txtEmployeeName.setText("");
            if (emp != null) {
                populateTable();
            } else {
                JOptionPane.showMessageDialog(this, "Employee Already Exist");
            }
        }
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void orgCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgCmbBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgCmbBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeList;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblOrganizationList1;
    private javax.swing.JLabel lblOrganizationPicker;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JComboBox orgCmbBox;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtEmployeeName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        model.setRowCount(0);
        for (Organization org : this.business.getOrganizationDirectory().getOrganizationList()) {
            if (org.getName().equals("Packaging Organization") || org.getName().equals("Logistics Employees Organization")) {
                for (Employee employee : org.getEmployeeDirectory().getEmployeeList()) {
                    Object[] row = new Object[2];
                    row[0] = employee.getId();
                    row[1] = employee.getName();
                    model.addRow(row);
                }
            }
        }
    }

    private void populateOrgCmbBox() {
        orgCmbBox.removeAllItems();
        for(Organization org : this.business.getOrganizationDirectory().getOrganizationList()){
            if(org.getName().equals(Organization.Type.Packaging.getValue())||org.getName().equals(Organization.Type.AppLogEmp.getValue()))
                orgCmbBox.addItem(org);
        }
        }
    }
