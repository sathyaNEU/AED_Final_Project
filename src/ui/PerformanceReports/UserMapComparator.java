/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.PerformanceReports;

import business.UserAccount.UserAccount;
import java.util.Comparator;
import java.util.HashMap;

/**
 *
 * @author Sathya
 */
public class UserMapComparator implements Comparator<UserAccount>{
HashMap<UserAccount, Integer> custCount;
    public UserMapComparator(HashMap<UserAccount, Integer> custCount){
       this.custCount = custCount; 
    }
    
    @Override
    public int compare(UserAccount u1, UserAccount u2) {
        return -1*(Integer.compare(
                ((custCount.get(u1)==null)?0:custCount.get(u1)), 
                ((custCount.get(u2)==null)?0:custCount.get(u2))
        ));
    }
    
}
