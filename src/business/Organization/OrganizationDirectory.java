/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.OGLogAdmin.getValue())) {
            organization = new OGAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.OGLogEmp.getValue())) {
            organization = new OGEmpOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.AppLogEmp.getValue())) {
            organization = new AppLogEmpOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Cargo.getValue())) {
            organization = new CargoOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Packaging.getValue())) {
            organization = new PackagingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AA.getValue())) {
            organization = new AAOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

    public boolean checkOrgIfExist(String search_org) {
        for (Organization org : this.organizationList) {
            if (org.getName().equals(search_org)) {
                return true;
            }
        }
        return false;
    }
}
