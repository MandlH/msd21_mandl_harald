package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2){
        logger.debug("add with " + number1 + " + " + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2){
        logger.debug("minus with " + number1 + " - " + number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2){
        logger.debug("divide with " + number1 + " / " + number2);

        try {
            return  number1 / number2;
        } catch (ArithmeticException e){
            logger.error("divide by 0 ");
        }
        return 0;
    }

    public double multiply(double number1, double number2){
        logger.debug("multiply with " + number1 + " * " + number2);
        double temp = number1 * number2;
        if(temp == -0)
            return 0;
        else
        return temp;
    }

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
