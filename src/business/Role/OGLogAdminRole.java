/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Business;
import business.Organization.OGLogAdminOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.OGAdminRole.OGAdminWorkArea;

/**
 *
 * @author Sathya
 */
public class OGLogAdminRole extends Role{

    public OGLogAdminRole() {
        this.type = RoleType.OGLogAdmin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business,JPanel prevContainer) {
        return new OGAdminWorkArea( userProcessContainer,  account, (OGLogAdminOrganization) organization,  business, prevContainer);
    }
    
}
