/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Enterprise.AppLogBusiness.DailyPricing;
import business.Enterprise.AppLogBusiness.DailyPricingList;
import business.Enterprise.AppLogBusiness.PackageList;
import business.Enterprise.AppLogBusiness.sItemList;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;

/**
 *
 * @author Administrator
 */
public class Business {

    private static Business business;
    private OrganizationDirectory organizationDirectory;
    private DailyPricingList dailyPricingList;
    private PackageList packageList;

    public PackageList getPackageList() {
        return packageList;
    }

    public void setPackageList(PackageList packageList) {
        this.packageList = packageList;
    }

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

    public Organization getPackagingOrganization() {
        for (Organization org : getOrganizationDirectory().getOrganizationList()) {
            if (org.getName().equals(Organization.Type.Packaging.getValue())) {
                return org;
            }
        }
        return null;
    }

    public Organization getAppLogEmpOrganization() {
        for (Organization org : getOrganizationDirectory().getOrganizationList()) {
            if (org.getName().equals(Organization.Type.AppLogEmp.getValue())) {
                return org;
            }
        }
        return null;
    }

    public Organization getCustomerOrganization() {
        for (Organization org : getOrganizationDirectory().getOrganizationList()) {
            if (org.getName().equals(Organization.Type.Customer.getValue())) {
                return org;
            }
        }
        return null;
    }
    
    public Organization getBusinessAdminOrganization() {
        for (Organization org : getOrganizationDirectory().getOrganizationList()) {
            if (org.getName().equals(Organization.Type.BusinessAdmin.getValue())) {
                return org;
            }
        }
        return null;
    }

    public DailyPricingList getDailyPricingList() {
        return this.dailyPricingList;
    }

    public void setDailyPricingList(DailyPricingList dp) {
        this.dailyPricingList = dp;
    }

}
