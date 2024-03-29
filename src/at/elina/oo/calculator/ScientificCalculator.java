package at.elina.oo.calculator;

public class ScientificCalculator extends BaseCalculator{

    public ScientificCalculator(double number1, double number2) {
        super(number1, number2);
    }

    public double sinus(double degrees){
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }

    public double cosinus(double degrees){
        double radians = Math.toRadians(degrees);
        return Math.cos(radians);
    }

}
