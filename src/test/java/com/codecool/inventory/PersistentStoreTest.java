package com.codecool.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersistentStoreTest {
    PersistentStore perStore;

    @BeforeEach
    void setUp() {
        perStore = new PersistentStore();
    }

    @Test
    void storeProduct() {
        perStore.storeProduct(new CDProduct("Meteora", 25, 14));
        assertEquals(perStore.listOfProducts.size(), 1);
        assertEquals(perStore.listOfProducts.get(0).getName(), "Meteora");
    }
}