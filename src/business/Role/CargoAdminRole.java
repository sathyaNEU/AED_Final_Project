/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Business;
import business.Organization.CargoOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.CargoRole.CargoAdminWorkArea;

/**
 *
 * @author Sathya
 */
public class CargoAdminRole extends Role{

    public CargoAdminRole() {
        this.type = RoleType.CargoAdmin;
    }
  
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, JPanel prevContainer) {
        return new CargoAdminWorkArea( userProcessContainer,  account, (CargoOrganization) organization,  business, prevContainer);
    }
    
}
