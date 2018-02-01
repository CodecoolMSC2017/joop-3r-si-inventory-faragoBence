package com.codecool.inventory;

import java.util.List;

public class PersistentStore extends Store {

    public void storeProduct(Product product) {
        if (product instanceof CDProduct) {
            CDProduct cd = (CDProduct) product;
            super.storeProduct(super.createProduct("CD", cd.getName(), cd.getPrice(), cd.getNumOfTracks()));
        } else if (product instanceof BookProduct) {
            BookProduct book = (BookProduct) product;
            super.storeProduct(super.createProduct("Book", book.getName(), book.getPrice(), book.getNumOfPages()));
        }
    }
        List<Product> getAllProduct(){
            return super.loadProducts();
        }

}
