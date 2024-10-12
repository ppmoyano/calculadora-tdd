package main.test.java.com.example;

import main.java.com.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 debe ser 5");
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 debe ser 2");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 debe ser 6");
    }
}