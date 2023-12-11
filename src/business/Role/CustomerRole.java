/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Business;
import business.Organization.CustomerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Customer.CustomerWorkArea;

/**
 *
 * @author Sathya
 */
public class CustomerRole extends Role{

    public CustomerRole() {
        this.type = RoleType.Customer;
    }

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business,JPanel prevContainer) {
        return new CustomerWorkArea( userProcessContainer,  account, (CustomerOrganization) organization, business, prevContainer);
    }
    
}
