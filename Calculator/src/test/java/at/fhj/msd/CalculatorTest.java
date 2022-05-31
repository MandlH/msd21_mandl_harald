package at.fhj.msd;

import at.fhj.msd.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    /**
     * Initialisation of the Calculator.class before start testing.
     */
    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    /**
     * Checks the add Method with the result
     */
    @Test
    public void addExpectedTest(){
        Assertions.assertEquals(8, calculator.add(4, 4));
    }

    /**
     * Checks the add Method with calculating the result manually
     */
    @Test
    public void addActualTest(){
        Assertions.assertEquals(5+3, calculator.add(5, 3));
    }

    /**
     * Checks the minus Method with the result
     */
    @Test
    public void minusExpectedTest(){
        Assertions.assertEquals(3, calculator.minus(5, 2));
    }

    /**
     * Checks the minus Method with calculating the result manually
     */
    @Test
    public void minusActualTest(){
        Assertions.assertEquals(7-10, calculator.minus(7, 10));
    }

    /**
     * Checks the divide Method with the result
     */
    @Test
    public void divideExpectedTest(){
        Assertions.assertEquals(2, calculator.divide(18, 9));
    }

    /**
     * Checks the divide Method with calculating the result manually
     */
    @Test
    public void divideActualTest(){
        Assertions.assertEquals(12/3, calculator.divide(12, 3));
    }

    /**
     * Checks if the Exception throws as expected
     */
    @Test
    public void divideExceptionTest(){
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }


    /**
     * Checks the multiply Method with the result
     */
    @Test
    public void multiplyExpectedTest(){
        Assertions.assertEquals(0, calculator.multiply(0, -1));
    }

    /**
     * Checks the multiply Method with calculating the result manually
     */
    @Test
    public void multiplyActualTest(){
        Assertions.assertEquals(1*0, calculator.multiply(1, 0));
    }


    @Test
    public void facultyMinusNumTest(){
        Assertions.assertEquals(0, calculator.faculty(-20));
    }

    @Test
    public void facultyExpectedTest(){
        Assertions.assertEquals(24, calculator.faculty(4));
    }

    @Test
    public void facultyActualTest(){
        Assertions.assertEquals(5*4*3*2*1, calculator.faculty(5));
    }
}
