package at.elina.oo;

public class car_main {
    public static void main(String[] args) {
        car c1 = new car(9, "Porsche", "P1234", "white", 70, 80);
        c1.setColor("blue");
        c1.setBrand("Porsche");
        c1.setFuelConsumption(9);
        c1.setSerialNumber("P1234");
        c1.setFuelAmount(70);
        c1.setTankVolumen(80);


        car c2 = new car(1, "Jaguar", "J1234", "pink", 3, 50);
        c2.setColor("pink");
        c2.setBrand("Jaguar");
        c2.setFuelConsumption(1);
        c2.setSerialNumber("J1234");
        c2.setFuelConsumption(3);
        c2.setTankVolumen(50);



        car c3 = new car(17, "BMW", "B1234", "grey", 10, 100);

        System.out.println("Seriennummer des dritten Autos: " + c3.getFuelAmount());
        System.out.println("Farbe des 2ten Autos: " + c2.getColor());



    }
}

