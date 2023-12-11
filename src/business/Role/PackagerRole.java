/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.Organization.PackagingOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PackagerRole.PackagerWorkArea;

/**
 *
 * @author Sathya
 */
public class PackagerRole extends Role{

    public PackagerRole() {
        this.type = RoleType.Packager;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, JPanel prevContainer) {
        return new PackagerWorkArea( userProcessContainer,  account, (PackagingOrganization) organization,  business, prevContainer);
    }
    
}
