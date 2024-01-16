package at.elina.oo;

public class Main {
    public static void main(String[] args) {
        Tank t1 = new Tank(200, 20, "GAS");
        Engine e1 = new Engine(140, t1);
        Car c1 = new Car(e1, 10, "Porsche", "P1234", "white", 80, 400);
        c1.setColor("white");
        c1.setBrand("Porsche");
        c1.setFuelConsumption(10);
        c1.setSerialNumber("P1234");
        c1.setFuelAmount(80);
        c1.setTankVolumen(400);


        System.out.println(c1.getEngine().getTank().getType());
    }
}

