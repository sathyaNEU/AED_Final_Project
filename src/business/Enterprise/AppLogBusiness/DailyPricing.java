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
    String date;
    float expressPrice;
    float priorityPrice;

    public  String getDate() {
        return date;
    }

    public  void setDate(Date dt) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
        date = formatter.format(dt);
    }

    public  float getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(float price) {
        this.expressPrice = price;
    }

    public  void setPriorityPrice(float priorityPrice) {
        this.priorityPrice = priorityPrice;
    }
    
    
    public  float getPriorityPrice() {
        return priorityPrice;
    }
    
    
}
