/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise.AppLogBusiness;

import java.util.ArrayList;

/**
 *
 * @author Sathya
 */
public class sItemList {
    public static ArrayList<Item> staticItemList;

    static {
        staticItemList = new ArrayList<>();
        Item i1 = new Item();
        i1.setItem("Sweets");
        Item i2 = new Item();
        i2.setItem("Documents");
        Item i3 = new Item();
        i3.setItem("Clothes");
        Item i4 = new Item();
        i4.setItem("Electronics");
        Item i5 = new Item();
        i5.setItem("Other metallic instruments");
        Item i6 = new Item();
        i6.setItem("Other non-metallic instruments");
        staticItemList.add(i1);
        staticItemList.add(i2);
        staticItemList.add(i3);
        staticItemList.add(i4);
        staticItemList.add(i5);
        staticItemList.add(i6);
    }
      
}
