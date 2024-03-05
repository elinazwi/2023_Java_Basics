package at.elina.oo.calculator;

public class BaseCalculator {
    private double number1;
    private double number2;

    public BaseCalculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void addition(){
        double result = 0;
        result = number1 + number2;
        System.out.println("Das Ergebnis der Addition von " + number1 + " plus " + number2 + " ist: " + result);
    }

    public void subtraction(){
        double result = 0;
        result = number1 - number2;
        System.out.println("Das Ergebnis der Subtraktion von " + number1 + " minus " + number2 + " ist: " + result);
    }

    public void multiplication(){
        double result = 0;
        result = number1 * number2;
        System.out.println("Das Ergebnis der Multiplikation von " + number1 + " mal " + number2 + " ist: " + result);
    }

    public void division(){
        double result = 0;
        result = number1 / number2;
        System.out.println("Das Ergebnis der Division von " + number1 + " durch " + number2 + " ist: " + result);
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
}
