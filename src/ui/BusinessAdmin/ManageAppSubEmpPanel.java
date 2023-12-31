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
    Organization selectedOrg;

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
        lblOrganizationPicker = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        lblEmployeeList = new javax.swing.JLabel();
        orgCmbBox = new javax.swing.JComboBox();
        btnBack2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrganizationList1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOrganizationList1.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationList1.setText("NEW EMPLOYEE:");
        add(lblOrganizationList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 160, 30));

        lblEmployeeName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblEmployeeName.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeName.setText("NAME:");
        add(lblEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 70, -1));

        txtEmployeeName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 201, 30));

        btnCreateEmployee.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCreateEmployee.setText("CREATE EMPLOYEE");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });
        add(btnCreateEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 220, 40));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("MANAGE EMPLOYEES");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 270, 40));

        lblOrganizationPicker.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblOrganizationPicker.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationPicker.setText("SELECT ORGANIZATION:");
        add(lblOrganizationPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        tblEmployees.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 570, 200));

        lblEmployeeList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmployeeList.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeList.setText("EMPLOYEE LIST:");
        add(lblEmployeeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        orgCmbBox.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        orgCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgCmbBoxActionPerformed(evt);
            }
        });
        add(orgCmbBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 240, 30));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/BusinessAdmin/Background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1500, 1160));
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

    private void orgCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgCmbBoxActionPerformed
        // TODO add your handling code here:
       this.selectedOrg = (Organization)this.orgCmbBox.getSelectedItem();
       populateTable();
    }//GEN-LAST:event_orgCmbBoxActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JLabel jLabel1;
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
            if (org.equals(this.selectedOrg)) {
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
