package at.fhj.msd;

public class Calculator {

    public double add(double number1, double number2){
        return number1 + number2;
    }

    public double minus(double number1, double number2){
        return number1 - number2;
    }

    public double divide(double number1, double number2){
        double temp = 0.0;
        try{
            temp = number1 / number2;
        } catch (ArithmeticException e){
            System.err.println(e);
        }
        return temp;
    }

    public double multiply(double number1, double number2){
        double temp = number1 * number2;
        if(temp == -0)
            return 0;
        else
        return temp;
    }

    public double faculty(int number){
        if(number <= 0)
            return 0;

        int temp = number;
        for(int i = 1; i < number; i++){
            temp *= number - i;
        }
        return temp;
    }
}
