import at.fhj.msd.Calculator;

public class Application {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.minus(21, 2));
        System.out.println(calculator.multiply(12, 2));
        System.out.println(calculator.divide(12, 2));

    }
}
