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
import business.Role.AppLogEmpRole;
import business.Role.BusinessAdminRole;
import business.Role.CustomerRole;
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
        Employee employee = new Employee();
        employee.setName("Super Admin"); 
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setEmployee(employee);
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);        

        Organization BusinessAdminOrg =  business.getOrganizationDirectory().createOrganization(Organization.Type.BusinessAdmin);        
        Employee employee2 = new Employee();
        employee2.setName("Business Admin");     
        UserAccount account2 = new UserAccount();
        account2.setUsername("ba");
        account2.setPassword("aA123456");
        account2.setRole(new BusinessAdminRole());
        account2.setEmployee(employee2); 
        BusinessAdminOrg.getEmployeeDirectory().getEmployeeList().add(employee2);
        BusinessAdminOrg.getUserAccountDirectory().getUserAccountList().add(account2);
        
        
        Organization CustomerOrg = business.getOrganizationDirectory().createOrganization(Organization.Type.Customer); 
        Employee employee1 = new Employee();
        employee1.setName("Jack Daniel");
        UserAccount account1 = new UserAccount();
        account1.setUsername("cus");
        account1.setPassword("aA123456");
        account1.setRole(new CustomerRole());
        account1.setEmployee(employee1);
        CustomerOrg.getEmployeeDirectory().getEmployeeList().add(employee1);
        CustomerOrg.getUserAccountDirectory().getUserAccountList().add(account1);
        
        Organization LogEmpOrg = business.getOrganizationDirectory().createOrganization(Organization.Type.AppLogEmp); 
        Employee employee3 = new Employee();
        employee3.setName("Rocky Log Emp");
        UserAccount account3 = new UserAccount();
        account3.setUsername("le");
        account3.setPassword("aA123456");
        account3.setRole(new AppLogEmpRole());
        account3.setEmployee(employee3);
        LogEmpOrg.getEmployeeDirectory().getEmployeeList().add(employee3);
        LogEmpOrg.getUserAccountDirectory().getUserAccountList().add(account3);

        
        DailyPricingList dailyPricingList = new DailyPricingList();
        business.setDailyPricingList(dailyPricingList);
        
        PackageList packageList = new PackageList();
        business.setPackageList(packageList);
              
        return business;
    }
    
}
