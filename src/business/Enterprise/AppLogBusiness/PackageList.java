/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise.AppLogBusiness;

import business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Sathya
 */
public class PackageList {
    ArrayList<Pkg> packageList;

    public PackageList() {
        this.packageList = new ArrayList<>();
    }
 
    public ArrayList<Pkg> getPackageList() {
        return packageList;
    }
    
    public Pkg createPackage(UserAccount ua, String shipType){
        if(shipType.equals("Express") || shipType.equals("Priority")){
        Pkg pkg = new Pkg(ua, shipType);
        this.packageList.add(pkg);
        return pkg;
        }
        else
            return null;
    }
}
