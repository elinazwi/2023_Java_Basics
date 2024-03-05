package at.elina.oo.calculator;

public class Main {
    public static void main(String[] args) {
        BaseCalculator base1 = new BaseCalculator(10, 2);
        RootCalculator r1 = new RootCalculator(25, 5);
        ScientificCalculator s1 = new ScientificCalculator(6, 8);

        base1.addition();
        base1.subtraction();
        base1.multiplication();
        base1.division();
        System.out.println(r1.squareRoot(25));
        System.out.println(s1.sinus(10));
        System.out.println(s1.cosinus(90));
    }
}
