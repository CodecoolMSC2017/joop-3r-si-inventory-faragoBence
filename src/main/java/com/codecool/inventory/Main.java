package com.codecool.inventory;

public class Main {
    public static void main(String[] args) {
        StorageManager myStorage = new StorageManager();
        myStorage.addStorage(new PersistentStore());
        myStorage.addCDProduct("Meteora", 25, 14);
        myStorage.addBookProduct("1984", 20, 220);
        System.out.println(myStorage.listProducts());
        System.out.println(myStorage.getTotalProductprice());
    }
}
