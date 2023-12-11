/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise.AppLogBusiness;

/**
 *
 * @author Sathya
 */
public class Item {
    String item;
    String status;
    
    public Item(){
        this.status = "No Actions Performed";
    }
    
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
   public String toString(){
       return this.item;
   }
    
}
