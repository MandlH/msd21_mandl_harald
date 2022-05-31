package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger = LogManager.getLogger();

    /**
     * adds number1 and number2
     * @param number1 First number added to the calculator
     * @param number2 Second number added to the calculator
     * @return The sum of the two parameters
     */
    public double add(double number1, double number2){
        logger.debug("add with " + number1 + " + " + number2);
        return number1 + number2;
    }

    /**
     * subtracts number2 from number1
     * @param number1 First number added to the calculator
     * @param number2 Second number added to the calculator
     * @return The difference of the two numbers
     */
    public double minus(double number1, double number2){
        logger.debug("minus with " + number1 + " - " + number2);
        return number1 - number2;
    }

    /**
     * divides number1 from number2
     * @param number1  First number added to the calculator
     * @param number2 Second number added to the calculator
     * @return the quotient of the dividend (number1) and divisor (number2)
     * @throws if number2 is 0 and write it into the logfile.
     */
    public double divide(double number1, double number2){
        logger.debug("divide with " + number1 + " / " + number2);

        try {
            return  number1 / number2;
        } catch (ArithmeticException e){
            logger.error("divide by 0 ");
        }
        return 0;
    }

    /**
     * multiply number1 with number2
     * @param number1
     * @param number2
     * @return the product of the two numbers
     */
    public double multiply(double number1, double number2){
        logger.debug("multiply with " + number1 + " * " + number2);
        double temp = number1 * number2;
        if(temp == -0)
            return 0;
        else
        return temp;
    }

    /**
     * product of all positive integers less than or equal to n (number).
     * @param number
     * @return faculty of a number
     */
    public double faculty(int number){
        if(number <= 0)
            return 0;

        logger.debug("faculty with " + number);
        int temp = number;
        for(int i = 1; i < number; i++){
            temp *= number - i;
        }
        return temp;
    }
}
