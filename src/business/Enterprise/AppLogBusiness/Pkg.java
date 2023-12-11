/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise.AppLogBusiness;

import business.CargoEnterprise.AirlinesSchedule;
import business.UserAccount.UserAccount;

/**
 *
 * @author Sathya
 */
public class Pkg {

    static int id = 0;
    int package_id;
    UserAccount customerUA;
    ItemList itemList;
    float weight;
    float netPrice;
    float gst;
    float shippingPrice;
    String shipType;
    int status;
    AirlinesSchedule schedule;
    String recv_name;
    String recv_address;
    String recv_cno;
    // 0-> req to assign log emp
    // 1-> log emp assigned
    // 2-> Items added by customer
    // 3-> Items sent to packager
    // 4-> Items are packed
    // 5-> Customs Inspection
    // 6-> Customs are cleared
    // 7-> Cargo schedule booked
    // 8-> OG Admin Received
    // 9-> OG log emp assigned
    // 10-> OG log emp delivered

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

    public enum type {

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
        this.netPrice = this.shippingPrice * weight + gst;
    }

    public int getPackage_id() {
        return package_id;
    }

    public String toString() {
        return "Package ID : " + String.valueOf(this.getPackage_id());
    }

    public AirlinesSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(AirlinesSchedule schedule) {
        this.schedule = schedule;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getRecv_name() {
        return recv_name;
    }

    public void setRecv_name(String recv_name) {
        this.recv_name = recv_name;
    }

    public String getRecv_address() {
        return recv_address;
    }

    public void setRecv_address(String recv_address) {
        this.recv_address = recv_address;
    }

    public String getRecv_cno() {
        return recv_cno;
    }

    public void setRecv_cno(String recv_cno) {
        this.recv_cno = recv_cno;
    }
    
}
