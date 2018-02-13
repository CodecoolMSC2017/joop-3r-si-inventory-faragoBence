package com.codecool.inventory;

class CDProduct extends Product {
    private final int numOfTracks;

    public CDProduct(String name, int price, int numOfTracks) {
        super(name, price);
        this.numOfTracks = numOfTracks;
    }

    public int getNumOfTracks() {
        return numOfTracks;
    }
}
