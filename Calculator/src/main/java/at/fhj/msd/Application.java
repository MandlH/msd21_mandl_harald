package at.fhj.msd;

import at.fhj.msd.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Simple Calculator
 * @author Harald Mandl
 */
public class Application {

    private static Logger logger = LogManager.getLogger();


    /**
     * Start point
     * @param args can integrate two numbers in your start configuration.
     *             using Strings could throw errors.
     */
    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 10));
        System.out.println(calculator.minus(21, 2));
        System.out.println(calculator.multiply(-1, 0));
        System.out.println(calculator.divide(0, 0));
        System.out.println(calculator.faculty(4));

        if(args.length == 2)
            System.out.println(calculator.add(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

        logger.info("It is a info logger.");
        logger.error("It is an error logger.");

    }
}
