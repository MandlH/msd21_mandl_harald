package at.fhj.msd;

import at.fhj.msd.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 10));
        System.out.println(calculator.minus(21, 2));
        System.out.println(calculator.multiply(-1, 0));
        System.out.println(calculator.divide(2, 0));
        System.out.println(calculator.faculty(4));

        logger.info("It is a info logger.");
        logger.error("It is an error logger.");

    }
}
