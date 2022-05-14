package at.fhj.msd;

import at.fhj.msd.Calculator;

public class Application {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(3, 10));
        System.out.println(calculator.minus(21, 2));
        System.out.println(calculator.multiply(-1, 0));
        System.out.println(calculator.divide(2, 0));

    }
}
