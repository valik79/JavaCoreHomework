package ua.valentin.annotations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * Created by yakimenko.valentin on 29.03.16.
 */
public class CalculatorTest {
    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult());
    }

    @Test(expected = UserException.class)
    public void divException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div();
    }

    @Test()
    public void div() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(1, 1);
        assertEquals(1, calculator.getResult());
    }

    @Test(expected = IllegalArgumentException.class)
    public void divRuntimeException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(1, 0);
    }
 }
