package com.qaa.module3.unit_testing_exercises.exercise1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {
    
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
    }

    @Test
    void testSubtraction() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0));
    }

    @Test
    void testMultiplication() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(6.0, 3.0));
    }

    @Test
    void testDivisionByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5.0, 0.0));
    }
}