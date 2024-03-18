package com.exam;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    void plus( ){
        assertEquals(4,cal.plus(3,1));
    }
}
