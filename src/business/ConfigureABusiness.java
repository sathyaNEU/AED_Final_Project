/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Employee.Employee;
import business.Enterprise.AppLogBusiness.DailyPricingList;
import business.Enterprise.AppLogBusiness.Item;
import business.Enterprise.AppLogBusiness.PackageList;
import business.Enterprise.AppLogBusiness.sItemList;
import business.Organization.AdminOrganization;
import business.Organization.CustomerOrganization;
import business.Organization.Organization;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author neeraj
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        //CustomerOrganization customerOrganization = new CustomerOrganization();
        //business.getOrganizationDirectory().getOrganizationList().add(customerOrganization);
        business.getOrganizationDirectory().createOrganization(Organization.Type.Customer);        
        Employee employee = new Employee();
        employee.setName("Akeem of Zamunda");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setEmployee(employee);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        DailyPricingList dailyPricingList = new DailyPricingList();
        business.setDailyPricingList(dailyPricingList);
        
        PackageList packageList = new PackageList();
        business.setPackageList(packageList);
              
        return business;
    }
    
}
