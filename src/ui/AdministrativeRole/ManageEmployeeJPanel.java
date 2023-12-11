/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import business.Employee.Employee;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        
        populateOrganizationComboBox();
    }
    
    public void populateOrganizationComboBox(){
        cmbOrganizationList.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            cmbOrganizationList.addItem(organization);
        }
    }
    
      private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
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
        btnBack = new javax.swing.JButton();
        lblOrganizationPicker = new javax.swing.JLabel();
        cmbOrganizationList = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        lblEmployeeList = new javax.swing.JLabel();
        lblOrganizationList1 = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        btnCreateEmployee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Manage Employees");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 240, 30));

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 33, -1, -1));

        lblOrganizationPicker.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblOrganizationPicker.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationPicker.setText("Select Organization:");
        add(lblOrganizationPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        cmbOrganizationList.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        cmbOrganizationList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrganizationList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganizationListActionPerformed(evt);
            }
        });
        add(cmbOrganizationList, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 231, -1));

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
        if (tblEmployees.getColumnModel().getColumnCount() > 0) {
            tblEmployees.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblEmployees.getColumnModel().getColumn(0).setMaxWidth(50);
            tblEmployees.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 500, 180));

        lblEmployeeList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmployeeList.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeList.setText("Employee List:");
        add(lblEmployeeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 50));

        lblOrganizationList1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOrganizationList1.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationList1.setText("New Employee:");
        add(lblOrganizationList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        lblEmployeeName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblEmployeeName.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeName.setText("Name:");
        add(lblEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        txtEmployeeName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 201, -1));

        btnCreateEmployee.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnCreateEmployee.setText("Create Employee");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });
        add(btnCreateEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/AdministrativeRole/login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1500, 1120));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed
        
        Organization organization = (Organization) cmbOrganizationList.getSelectedItem();
        String name = txtEmployeeName.getText();
        
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee name cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Employee emp = organization.getEmployeeDirectory().createEmployee(name);
        txtEmployeeName.setText("");
        if(emp!=null)
        populateTable(organization);
        else{
            JOptionPane.showMessageDialog(this, "Employee Already Exist");
        }
        
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbOrganizationListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganizationListActionPerformed
        Organization organization = (Organization) cmbOrganizationList.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_cmbOrganizationListActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JComboBox cmbOrganizationList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeList;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblOrganizationList1;
    private javax.swing.JLabel lblOrganizationPicker;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtEmployeeName;
    // End of variables declaration//GEN-END:variables
}
