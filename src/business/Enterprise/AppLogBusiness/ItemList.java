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
public class ItemList {
    ArrayList<Item> itemList;

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void addItemToItemList(Item item) {
        this.itemList.add(item);
    }
    
}