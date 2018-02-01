package com.codecool.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    CDProduct cd;
    BookProduct book;

    @BeforeEach
    void setUp() {
        cd = new CDProduct("IOWA", 22, 15);
        book = new BookProduct("Animal farm", 33, 200);
    }

    @Test
    void getPrice() {
        assertEquals(cd.getPrice(), 22);
        assertEquals(book.getPrice(), 33);
    }

    @Test
    void getName() {
        assertEquals(cd.getName(), "IOWA");
        assertEquals(book.getName(), "Animal farm");
    }
}