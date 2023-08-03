package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void additonAssertEquals() {
        double expected = 22.2;
        double actual = calculator.additon(10.0,12.2);
        assertEquals(expected,actual);
    }
    @Test
    void additonAssertNotEquals() {
        double expected = 2.2;
        double actual = calculator.additon(10.0,11.5);
        assertNotEquals(expected,actual);
    }

    @Test
    void subtractionAssertEquals() {
        double expected = 30.0;
        double actual = calculator.subtraction(40.0,10.0);
        assertEquals(expected,actual);
    }

    @Test
    void subtractionAssertNotEquals() {
        double expected = 33.0;
        double actual = calculator.subtraction(10.0,40.0);
        assertNotEquals(expected,actual);
    }

    @Test
    void multiplicationAssertEquals() {
        double expected = 3.3;
        double actual = calculator.multiplication(1.0,3.3);
        assertEquals(expected,actual);
    }

    @Test
    void multiplicationAssertNotEquals() {
        double expected = 3.3;
        double actual = calculator.multiplication(10.0,4.2);
        assertNotEquals(expected,actual);
    }

    @Test
    void divisionAssertEquals() {
        double expected = 5.0;
        double actual = calculator.division(10.0,2.0);
        assertEquals(expected,actual);
    }
    @Test
    void divisionAssertNotEquals() {
        double expected = 5.0;
        double actual = calculator.division(10.0,4.0);
        assertNotEquals(expected,actual);
    }

    @Test
    void modulousAssertEquals() {
        double expected = 0.0;
        double actual = calculator.modulous(10.0,2.0);
        assertEquals(expected,actual);
    }
    @Test
    void modulousAssertNotEquals() {
        double expected = 5.0;
        double actual = calculator.modulous(10.0,2.0);
        assertNotEquals(expected,actual);
    }
}