/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Sathya
 */
public class CommonEndpointRequests {
    HashMap<CargoWorkRequest, Boolean> cargoRequestList;

    public CommonEndpointRequests() {
        this.cargoRequestList = new HashMap<>();
    }

    public HashMap<CargoWorkRequest, Boolean> getCargoRequestList() {
        return cargoRequestList;
    }   
    
}
