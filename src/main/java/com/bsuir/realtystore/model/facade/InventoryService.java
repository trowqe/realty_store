package com.bsuir.realtystore.model.facade;

import com.bsuir.realtystore.model.builder.Realty;

public class InventoryService {
    public static boolean isAvailable(Realty realty){
        /*Check Warehouse database for product availability*/
        return true;
    }
}