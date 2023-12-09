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
public class Pkg {
    static int id=0;
    int package_id;
    UserAccount customerUA;
    ItemList itemList;
    float weight;
    float netPrice;
    float gst;
    float shippingPrice;
    String shipType;
    int status;
    // 0-> req to assign log emp
    // 1-> log emp assigned
    // 2-> Items added by customer
    // 3-> Items reviewed by log emp
    // 4-> Items sent to packager
    // 5-> Items are packed
    // 6-> Cargo schedule booked
    // 7-> Items are sent to customs by log emp
    // 8-> Customs are cleared
    // 9-> Delivered to Cargo
    // 10-> OG Admin Received
    // 11-> OG log emp assigned
    // 12-> OG log emp delivered
    
    

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Pkg(UserAccount ua, String shipType) {
        this.shipType = shipType;
        this.customerUA = ua;
        this.package_id = ++id;
        this.itemList = new ItemList();
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

    public int getPackage_id() {
        return package_id;
    }
    
    public String toString(){
        return "Package ID : "+String.valueOf(this.getPackage_id());
    }
    
    
}
