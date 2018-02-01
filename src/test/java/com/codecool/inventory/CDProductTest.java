package com.codecool.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CDProductTest {
    CDProduct cd;

    @BeforeEach
    void setUp() {
        cd = new CDProduct("Meteora", 23, 10);
    }

    @Test
    void getNumOfTracks() {
        assertEquals(cd.getNumOfTracks(), 10);
    }
}