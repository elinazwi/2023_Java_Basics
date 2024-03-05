package at.elina.oo.calculator;

public class ScientificCalculator extends BaseCalculator{

    public ScientificCalculator(double number1, double number2) {
        super(number1, number2);
    }

    public double squareRoot(double number){
        return Math.sqrt(number);
    }
}
