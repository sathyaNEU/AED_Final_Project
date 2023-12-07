/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Organization.Organization;
import business.Organization.OrganizationDirectory;

/**
 *
 * @author Administrator
 */
public class Business {

    private static Business business;
    private OrganizationDirectory organizationDirectory;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        organizationDirectory = new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public Organization getPackagingOrganization(){
        for(Organization org : getOrganizationDirectory().getOrganizationList())
            if(org.getName().equals(Organization.Type.Packaging))
                return org;
        return null;
    }
    
        public Organization getAppLogOrganization(){
        for(Organization org : getOrganizationDirectory().getOrganizationList())
            if(org.getName().equals(Organization.Type.AppLogEmp))
                return org;
        return null;
    }
}
