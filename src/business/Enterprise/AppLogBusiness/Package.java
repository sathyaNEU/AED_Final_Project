/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise.AppLogBusiness;

import business.UserAccount.UserAccount;

/**
 *
 * @author Sathya
 */
public class Package {
    static int id=0;
    int package_id;
    UserAccount customerUA;
    ItemList itemList;
    float weight;
    float netPrice;
    float gst;
    float shippingPrice;
    String shipType;

    public Package(String shipType) {
        this.shipType = shipType;
        this.package_id = ++id;
    }
    
    public float getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(float shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public float getGst() {
        return gst;
    }

    public void setGst(float gst) {
        this.gst = gst;
    }
    
    public enum type{
        
        
    }

    public static int getId() {
        return id;
    }

    public UserAccount getCustomerUA() {
        return customerUA;
    }

    public ItemList getItemList() {
        return itemList;
    }

    public float getWeight() {
        return weight;
    }

    public float getNetPrice() {
        return netPrice;
    }

    public void setCustomerUA(UserAccount customerUA) {
        this.customerUA = customerUA;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setNetPrice() {
        this.netPrice = this.shippingPrice*weight + gst;
    }
    
    
    
}
