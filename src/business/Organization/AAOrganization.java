/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.AARole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sathya
 */
public class AAOrganization extends Organization{
    public AAOrganization() {
        super(Organization.Type.AA.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AARole());
        return roles;
    }
}
