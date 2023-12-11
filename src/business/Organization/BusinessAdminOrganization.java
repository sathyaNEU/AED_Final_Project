/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.AdminRole;
import business.Role.BusinessAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sathya
 */
public class BusinessAdminOrganization extends Organization {

    public BusinessAdminOrganization() {
        super(Type.BusinessAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BusinessAdminRole());
        return roles;
    }
    
}
