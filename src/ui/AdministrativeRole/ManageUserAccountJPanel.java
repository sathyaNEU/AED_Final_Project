/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import business.Business;
import business.Employee.Employee;
import business.Organization.Organization;
import business.Role.Role;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Business business;

    public ManageUserAccountJPanel(JPanel container, Business business) {
        initComponents();
        this.business = business;
        this.container = container;

        popOrganizationComboBox();
        
        Organization organization = (Organization) cmbOrganization.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }

        popUserAccountsTable();
    }

    public void popOrganizationComboBox() {
        cmbOrganization.removeAllItems();

        for (Organization organization : business.getOrganizationDirectory().getOrganizationList()) {
            cmbOrganization.addItem(organization);
        }
    }

    public void populateEmployeeComboBox(Organization organization) {
        cmbEmployee.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            cmbEmployee.addItem(employee);
        }
    }

    private void populateRoleComboBox(Organization organization) {
        cmbRoles.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            cmbRoles.addItem(role);
        }
    }

    public void popUserAccountsTable() {

        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();

        model.setRowCount(0);

        for (Organization organization : business.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tblUsers.getModel()).addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        grpNewUser = new javax.swing.JPanel();
        btnCreateUser = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEmployee = new javax.swing.JLabel();
        cmbEmployee = new javax.swing.JComboBox();
        lblOrganization = new javax.swing.JLabel();
        cmbOrganization = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        cmbRoles = new javax.swing.JComboBox();
        lblCreateUser = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblUsersList = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsers);
        if (tblUsers.getColumnModel().getColumnCount() > 0) {
            tblUsers.getColumnModel().getColumn(0).setResizable(false);
            tblUsers.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 331, 296));

        grpNewUser.setBackground(new java.awt.Color(255, 255, 255));

        btnCreateUser.setText("Create");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        lblUserName.setText("User Name:");

        lblPassword.setText("Password:");

        lblEmployee.setText("Employee:");

        cmbEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeActionPerformed(evt);
            }
        });

        lblOrganization.setText("Organization:");

        cmbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganizationActionPerformed(evt);
            }
        });

        lblRole.setText("Role:");

        cmbRoles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCreateUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCreateUser.setText("New User:");

        javax.swing.GroupLayout grpNewUserLayout = new javax.swing.GroupLayout(grpNewUser);
        grpNewUser.setLayout(grpNewUserLayout);
        grpNewUserLayout.setHorizontalGroup(
            grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpNewUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(grpNewUserLayout.createSequentialGroup()
                            .addComponent(lblOrganization)
                            .addGap(18, 18, 18)
                            .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(grpNewUserLayout.createSequentialGroup()
                            .addComponent(lblEmployee)
                            .addGap(18, 18, 18)
                            .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(grpNewUserLayout.createSequentialGroup()
                            .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUserName)
                                .addComponent(lblRole)
                                .addComponent(lblPassword))
                            .addGap(18, 18, 18)
                            .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCreateUser))))
                    .addComponent(lblCreateUser))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        grpNewUserLayout.setVerticalGroup(
            grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grpNewUserLayout.createSequentialGroup()
                .addComponent(lblCreateUser)
                .addGap(18, 18, 18)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganization)
                    .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployee)
                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateUser)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        add(grpNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 34, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Manage Users");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 30));

        lblUsersList.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsersList.setForeground(new java.awt.Color(255, 255, 255));
        lblUsersList.setText("Users List:");
        add(lblUsersList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/AdministrativeRole/login.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 810, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        int res = validateCredentials( userName, password);       
         if (res == -1)
            JOptionPane.showMessageDialog(this, "Username or password cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        else {
            if(validatePwd(password)){
                 Organization organization = (Organization) cmbOrganization.getSelectedItem();
        Employee employee = (Employee) cmbEmployee.getSelectedItem();
        Role role = (Role) cmbRoles.getSelectedItem();
        UserAccount userAccount = organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        if(userAccount==null)
            JOptionPane.showMessageDialog(this, "Username already exists");
        else{
            popUserAccountsTable();
            JOptionPane.showMessageDialog(null, "User Account added successfully.");
            txtUserName.setText("");
            txtPassword.setText("");  
        }      
            }
            else
               JOptionPane.showMessageDialog(this, "Password must contain alteast 8 characters, one upper case\none lower case and one digit", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
         
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganizationActionPerformed
        Organization organization = (Organization) cmbOrganization.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_cmbOrganizationActionPerformed

    private void cmbEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JComboBox cmbEmployee;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JComboBox cmbRoles;
    private javax.swing.JPanel grpNewUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateUser;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUsersList;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

private int validateCredentials(String userName, String password) {

        if (userName.isBlank() || password.isBlank()) {
            return -1;
        } else {
            return 1;
        }
    }

    private boolean validatePwd(String pwd) {
        return pwd.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$");

    }







}
