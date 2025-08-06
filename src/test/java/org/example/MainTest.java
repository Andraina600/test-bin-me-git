package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testSquare() {
        Main calculator = new Main();
        assertEquals(16, calculator.square(4));
        assertEquals(25, calculator.square(5));
        assertEquals(0, calculator.square(0));
    }
}