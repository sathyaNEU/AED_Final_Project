/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Business;
import business.Organization.BusinessAdminOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.BusinessAdmin.BusinessAdminWorkArea;

/**
 *
 * @author Sathya
 */
public class BusinessAdminRole extends Role {

    public BusinessAdminRole() {
        this.type = RoleType.BusinessAdmin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business,JPanel prevContainer) {
        return new BusinessAdminWorkArea( userProcessContainer,  account, (BusinessAdminOrganization) organization,  business, prevContainer);
    }
    
}
