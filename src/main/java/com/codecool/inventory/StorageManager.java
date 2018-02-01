package com.codecool.inventory;

import java.util.List;

public class StorageManager {
    StoreCapable storage;


    public void addStorage(StoreCapable storage) {
        this.storage = storage;
    }

    public void addCDProduct(String name, int price, int tracks) {
        storage.storeCDProduct(name, price, tracks);

    }

    public void addBookProduct(String name, int price, int pages) {
        storage.storeBookProduct(name, price, pages);
    }

    public String listProducts() {
        String str = "";
        List<Product> products = storage.getAllProduct();
        for (Product product : products) {
            str += product.getName() + "\t";
        }
        return str;
    }

    public int getTotalProductprice() {
        int totalPrice = 0;
        List<Product> products = storage.getAllProduct();
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;

    }


}
