package at.fhj.msd;

import at.fhj.msd.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void addExpectedTest(){
        Assertions.assertEquals(8, calculator.add(4, 4));
    }

    @Test
    public void addActualTest(){
        Assertions.assertEquals(5+3, calculator.add(5, 3));
    }

    @Test
    public void minusExpectedTest(){
        Assertions.assertEquals(3, calculator.minus(5, 2));
    }

    @Test
    public void minusActualTest(){
        Assertions.assertEquals(7-10, calculator.minus(7, 10));
    }

    @Test
    public void divideExpectedTest(){
        Assertions.assertEquals(2, calculator.divide(18, 9));
    }

    @Test
    public void divideActualTest(){
        Assertions.assertEquals(12/3, calculator.divide(12, 3));
    }

    @Test
    public void multiplyExpectedTest(){
        Assertions.assertEquals(0, calculator.multiply(0, -1));
    }

    @Test
    public void multiplyActualTest(){
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.multiply(1, 0));
    }
}
