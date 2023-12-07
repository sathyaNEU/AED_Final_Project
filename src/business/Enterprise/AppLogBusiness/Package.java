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
    UserAccount customerUA;
    ItemList itemList;
    float weight;
    float price;
    
    public Package(){
        ++id;
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

    public float getPrice() {
        return price;
    }

    public void setCustomerUA(UserAccount customerUA) {
        this.customerUA = customerUA;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setPrice(float price) {
        this.price = DailyPricing.getPrice()*this.weight;
    }
    
    
    
}
