package at.elina.oo.lamp;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        Lightelement l1 = new Lightelement("Lightelement l1", 50, Lightelement.TYPE.off, "pink");
        Lightelement l2 = new Lightelement("Lightelement l2", 40, Lightelement.TYPE.off, "green");

        lamp1.addLightelement(l1);
        lamp1.addLightelement(l2);

        l1.turnOn();
        System.out.println(lamp1.getOverallUsage());
        lamp1.turnAllOn();
        lamp1.printNamesOfLightElements();

    }

}
