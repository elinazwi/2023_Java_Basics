package at.elina.oo.calculator;

public class Main {
    public static void main(String[] args) {
        BaseCalculator base1 = new BaseCalculator(10, 2);

        base1.addition();
        base1.subtraction();
        base1.multiplication();
        base1.division();
    }
}
