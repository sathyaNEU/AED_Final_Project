/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise.AppLogBusiness;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Sathya
 */
public class DailyPricingList {
    //ArrayList<DailyPricing> dailyPricingList;
    HashMap<String, DailyPricing> dailyPricingMap;

    public DailyPricingList() {
        this.dailyPricingMap  = new HashMap<>();
    }
    
    

    public DailyPricing getDailyPricingList(String date) {
        return dailyPricingMap.get(date);
    }

    public void setDailyPricing(String date, DailyPricing dp) {
        this.dailyPricingMap.put(date, dp);
    }
    
}
