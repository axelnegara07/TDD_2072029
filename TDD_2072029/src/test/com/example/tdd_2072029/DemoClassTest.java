package com.example.tdd_2072029;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoClassTest {

    @Test
    void returnNumberEquals() {
        DemoClass demoClass = new DemoClass();
        int temp = demoClass.returnNumber();
        assertEquals(8, temp);
    }

    @Test
    void returnNumberNotEquals() {
        DemoClass demoClass = new DemoClass();
        int temp = demoClass.returnNumber();
        assertNotEquals(9, temp);
    }
}