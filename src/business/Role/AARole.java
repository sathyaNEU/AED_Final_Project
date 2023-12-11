/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Business;
import business.Organization.AAOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AARole.AAWorkArea;

/**
 *
 * @author Sathya
 */
public class AARole extends Role {

    public AARole() {
        this.type = RoleType.AA_Officer;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business,JPanel prevContainer) {
        return new AAWorkArea(userProcessContainer,  account, (AAOrganization) organization,  business, prevContainer);
    }
    
}
