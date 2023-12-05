/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.LabAssistantRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sathya
 */
public class OGAdminOrganization extends Organization{
    public OGAdminOrganization() {
        super(Organization.Type.OGLogAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabAssistantRole());
        return roles;
    }
}
