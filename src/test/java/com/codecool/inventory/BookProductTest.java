package com.codecool.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookProductTest {
    private BookProduct book;

    @BeforeEach
    void setUp() {
        book = new BookProduct("1984", 25, 245);
    }

    @Test
    void getNumOfPages() {
        assertEquals(book.getNumOfPages(), 245);
    }
}