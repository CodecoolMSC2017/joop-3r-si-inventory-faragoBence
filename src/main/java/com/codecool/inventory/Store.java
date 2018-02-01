package com.codecool.inventory;

import java.util.List;

public abstract class Store {
    private void saveToXml(Product product) {

    }

    protected void storeProduct(Product product) {

    }

    protected Product createProduct(String type, String name, int price, int size) {
        if (type.equals("CD")) {
            return new CDProduct(name, price, size);
        } else if (type.equals("Book")) {
            return new BookProduct(name, price, size);
        } else {
            return null;
        }
    }

    public List<Product> loadProducts() {

    }

    public void store(Product product) {
    saveToXml(product);
    storeProduct(product);
    }

}
