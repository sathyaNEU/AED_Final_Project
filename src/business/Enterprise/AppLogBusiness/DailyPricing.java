/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise.AppLogBusiness;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sathya
 */
public class DailyPricing {
    static String date;
    static float price;

    public static String getDate() {
        return date;
    }

    public static void setDate(Date dt) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yy");
        date = formatter.format(dt);
    }

    public static float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
