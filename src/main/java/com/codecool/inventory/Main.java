package com.codecool.inventory;

class Main {
    public static void main(String[] args) {
        StorageManager myStorage = new StorageManager();
        CsvStore storage = new CsvStore();
        storage.loadProducts("files.csv");
        storage.saveProducts("files.csv");
        myStorage.addStorage(storage);
        System.out.println(myStorage.listProducts());
        System.out.println(myStorage.getTotalProductprice());
    }
}
