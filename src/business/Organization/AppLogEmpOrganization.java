/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.AppLogEmpRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sathya
 */
public class AppLogEmpOrganization extends Organization {
     public AppLogEmpOrganization() {
        super(Organization.Type.AppLogEmp.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AppLogEmpRole());
        return roles;
    }
    
}
