package at.elina.oo;

public class car_main {
    public static void main(String[] args) {
        car c1 = new car();
        c1.color = "blue";
        c1.brand = "Porsche";
        c1.fuelConsumption = 9;
        c1. serialNumber = "P1234";
        c1.fuelAmount = 70;
        c1.tankVolumen = 80;

        car c2 = new car();
        c2.color = "pink";
        c2.brand = "Jaguar";
        c2.fuelConsumption = 1;
        c2.serialNumber = "J1234";
        c2.fuelAmount = 3;
        c2.tankVolumen = 50;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.brake();
        c2.turboBoost();
        c1.turboBoost();

    }
}

