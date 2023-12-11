/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Business;
import business.Organization.AppLogEmpOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AppLogEmpRole.AppLogEmpWorkArea;
/**
 *
 * @author Sathya
 */
public class AppLogEmpRole extends Role {

    public AppLogEmpRole() {
        this.type = RoleType.AppLogEmp;
    }

@Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business,JPanel prevContainer) {
        this.type = RoleType.AppLogEmp;
        return new AppLogEmpWorkArea( userProcessContainer,  account, (AppLogEmpOrganization)organization,  business, prevContainer);
    }
    
}
