package com.calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.calculator.exceptions.CalculatorException;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() throws CalculatorException {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    public void testSubtraction() throws CalculatorException {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
    }

    @Test
    public void testMultiplication() throws CalculatorException {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-1, 2));
    }

    @Test
    public void testDivision() throws CalculatorException {
        assertEquals(2, calculator.divide(6, 3));
        assertThrows(CalculatorException.class, () -> calculator.divide(1, 0));
    }

    @Test
    public void testSquareRoot() throws CalculatorException {
        assertEquals(3, calculator.squareRoot(9));
        assertThrows(CalculatorException.class, () -> calculator.squareRoot(-1));
    }

    @Test
    public void testExponentiation() throws CalculatorException {
        assertEquals(8, calculator.exponentiate(2, 3));
        assertEquals(1, calculator.exponentiate(5, 0));
    }
}