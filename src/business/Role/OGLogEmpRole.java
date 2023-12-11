/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Business;
import business.Organization.OGLogEmpOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.OGLogEmpRole.OGLogEmpWorkArea;

/**
 *
 * @author Sathya
 */
public class OGLogEmpRole extends Role{

    public OGLogEmpRole() {
        this.type = RoleType.OGLogEmp;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business,JPanel prevContainer) {
        return new OGLogEmpWorkArea( userProcessContainer,  account, (OGLogEmpOrganization) organization,  business, prevContainer);
    }
    
}
