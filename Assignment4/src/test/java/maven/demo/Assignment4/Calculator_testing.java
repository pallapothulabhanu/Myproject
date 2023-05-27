package maven.demo.Assignment4;

import org.junit.Test;
import static org.junit.Assert.*;

public class Calculator_testing  {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sum(2, 3));
        assertEquals(-1, calculator.sum(2, -3));
        assertEquals(0, calculator.sum(0, 0));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(5, calculator.subtract(2, -3));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(0, calculator.multiply(0, 0));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(6, -3));
        try {
            calculator.divide(6, 0);
            fail("Expected ArithmeticException was not thrown!");
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero!", e.getMessage());
        }
    }
}

