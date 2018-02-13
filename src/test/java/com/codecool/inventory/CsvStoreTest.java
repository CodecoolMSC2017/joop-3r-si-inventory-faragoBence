package com.codecool.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsvStoreTest {
    private final CsvStore store = new CsvStore();
    private BookProduct book;
    private CDProduct cd;

    @BeforeEach
    void setUp() {
        store.storeBookProduct("könyv", 1, 23);
        store.storeCDProduct("cd", 2, 3);
        store.saveProducts("test.csv");
        book = new BookProduct("book", 3, 3);
        cd = new CDProduct("music", 4, 5);
    }

    @Test
    void getAllProduct() {
        assertEquals(2, store.getAllProduct().size());
        assertEquals("könyv", store.getAllProduct().get(0).getName());
    }

    @Test
    void storeCDProduct() {
        assertEquals(2, store.getAllProduct().size());
        store.storeCDProduct("cd", 3, 3);
        assertEquals(3, store.getAllProduct().size());
        assertEquals("cd", store.getAllProduct().get(2).getName());

    }

    @Test
    void storeBookProduct() {
        assertEquals(2, store.getAllProduct().size());
        store.storeCDProduct("book", 3, 3);
        assertEquals(3, store.getAllProduct().size());
        assertEquals("book", store.getAllProduct().get(2).getName());
    }

    @Test
    void loadProducts() {
        assertEquals(2, store.getAllProduct().size());
        store.loadProducts("test.csv");
        assertEquals(4, store.getAllProduct().size());

    }

    @Test
    void saveProducts() {
        store.loadProducts("test.csv");
        assertEquals(4, store.getAllProduct().size());
        store.saveProducts("test.csv");
        store.loadProducts("test.csv");
        assertEquals(8, store.getAllProduct().size());
    }
}