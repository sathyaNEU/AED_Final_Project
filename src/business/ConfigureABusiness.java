/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.CargoEnterprise.AirlinesSchedule;
import business.Employee.Employee;
import business.Enterprise.AppLogBusiness.DailyPricingList;
import business.Enterprise.AppLogBusiness.Item;
import business.Enterprise.AppLogBusiness.PackageList;
import business.Enterprise.AppLogBusiness.sItemList;
import business.Organization.AdminOrganization;
import business.Organization.CustomerOrganization;
import business.Organization.Organization;
import business.Role.AARole;
import business.Role.AdminRole;
import business.Role.AppLogEmpRole;
import business.Role.BusinessAdminRole;
import business.Role.CargoAdminRole;
import business.Role.CustomerRole;
import business.Role.OGLogAdminRole;
import business.Role.OGLogEmpRole;
import business.Role.PackagerRole;
import business.UserAccount.UserAccount;
import business.WorkQueue.CommonEndpointRequests;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        Organization AAOrg = business.getOrganizationDirectory().createOrganization(Organization.Type.AA); 
        Employee employee4 = new Employee();
        employee4.setName("Ronald Trump");
        UserAccount account4 = new UserAccount();
        account4.setUsername("aa");
        account4.setPassword("aA123456");
        account4.setRole(new AARole());
        account4.setEmployee(employee4);
        AAOrg.getEmployeeDirectory().getEmployeeList().add(employee4);
        AAOrg.getUserAccountDirectory().getUserAccountList().add(account4);

        Organization CargoOrg = business.getOrganizationDirectory().createOrganization(Organization.Type.Cargo); 
        Employee employee5 = new Employee();
        employee5.setName("Arial");
        UserAccount account5 = new UserAccount();
        account5.setUsername("ca");
        account5.setPassword("aA123456");
        account5.setRole(new CargoAdminRole());
        account5.setEmployee(employee5);
        CargoOrg.getEmployeeDirectory().getEmployeeList().add(employee5);
        CargoOrg.getUserAccountDirectory().getUserAccountList().add(account5);
        
        Organization PackOrg = business.getOrganizationDirectory().createOrganization(Organization.Type.Packaging); 
        Employee employee6 = new Employee();
        employee6.setName("Richard Packer");
        UserAccount account6 = new UserAccount();
        account6.setUsername("pa");
        account6.setPassword("aA123456");
        account6.setRole(new PackagerRole());
        account6.setEmployee(employee6);
        PackOrg.getEmployeeDirectory().getEmployeeList().add(employee6);
        PackOrg.getUserAccountDirectory().getUserAccountList().add(account6);
        
        Organization OGLogAdmin = business.getOrganizationDirectory().createOrganization(Organization.Type.OGLogAdmin); 
        Employee employee7 = new Employee();
        employee7.setName("DH Laurance");
        UserAccount account7 = new UserAccount();
        account7.setUsername("dhl");
        account7.setPassword("aA123456");
        account7.setRole(new OGLogAdminRole());
        account7.setEmployee(employee7);
        OGLogAdmin.getEmployeeDirectory().getEmployeeList().add(employee7);
        OGLogAdmin.getUserAccountDirectory().getUserAccountList().add(account7);
        
        Organization OGLogEmp = business.getOrganizationDirectory().createOrganization(Organization.Type.OGLogEmp); 
        Employee employee8 = new Employee();
        employee8.setName("Travis Scott");
        UserAccount account8 = new UserAccount();
        account8.setUsername("ogemp");
        account8.setPassword("aA123456");
        account8.setRole(new OGLogEmpRole());
        account8.setEmployee(employee8);
        OGLogEmp.getEmployeeDirectory().getEmployeeList().add(employee8);
        OGLogEmp.getUserAccountDirectory().getUserAccountList().add(account8);
        
        ArrayList<AirlinesSchedule> airScheduleList = new ArrayList<>();
        
        BufferedReader file_content = null;
        String file_path = "src//Project_Files//airlines_schedule.csv";
        String currentLine="";
        String arg1;
        String arg2;
        String arg3;
        String arg4;
        String arg5;
        String arg6;
        int arg7;
        String arg8;
        try{
            file_content = new BufferedReader(new FileReader(file_path));
            while((currentLine=file_content.readLine())!=null){
                String[] split_str = currentLine.split(",");
                arg1 = split_str[0];
                arg2 = split_str[1];
                arg3 = split_str[2];
                arg4 = split_str[3];
                arg5 = split_str[4];
                arg6 = split_str[5];
                arg7 = Integer.parseInt(split_str[6]);
                arg8 = split_str[7];
                AirlinesSchedule as = new AirlinesSchedule();
                as.setAirline(arg1);
                as.setFlight_id(arg2);
                as.setStart_time(arg3);
                as.setDept_airport(arg4);
                as.setArr_time(arg5);
                as.setArr_airport(arg6);
                as.setSpots(arg7);
                as.setDate(arg8);
                airScheduleList.add(as);
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try {
                file_content.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        business.setAirScheduleList(airScheduleList);
        
        DailyPricingList dailyPricingList = new DailyPricingList();
        business.setDailyPricingList(dailyPricingList);
        
        PackageList packageList = new PackageList();
        business.setPackageList(packageList);
        
        CommonEndpointRequests cer = new CommonEndpointRequests();
        business.setCer(cer);
              
        return business;
    }
    
}
