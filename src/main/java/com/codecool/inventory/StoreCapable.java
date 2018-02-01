package com.codecool.inventory;

import java.util.ArrayList;
import java.util.List;

public interface StoreCapable {

    List<Product> getAllProduct();
    void storeCDProduct(String name, int price, int tracks);
    void storeBookProduct(String name, int price, int pages);

}
