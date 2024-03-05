package at.elina.oo.calculator;

public class RootCalculator extends BaseCalculator{

    public RootCalculator(double number1, double number2) {
        super(number1, number2);
    }

    public double squareRoot(double number){
        return Math.sqrt(number);
    }
}
