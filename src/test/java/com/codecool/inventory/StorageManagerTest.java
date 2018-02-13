package com.codecool.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageManagerTest {
    private StorageManager storageManager;

    @BeforeEach
    void setUp() {
        storageManager = new StorageManager();
        storageManager.addStorage(new PersistentStore());
    }

    @Test
    void TestEmptyStore() {
        assertEquals(storageManager.listProducts(), "");
        assertEquals(storageManager.getTotalProductprice(), 0);
    }

    @Test
    void TestWithProducts() {
        storageManager.addCDProduct("Meteora", 25, 14);
        storageManager.addBookProduct("1984", 20, 220);
        assertEquals(storageManager.getTotalProductprice(), 45);
        assertEquals(storageManager.listProducts(), "Meteora\t1984\t");
    }
}