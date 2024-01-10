package at.elina.oo;

public class car_main {
    public static void main(String[] args) {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        car c1 = new car(e1, 10, "Porsche", "P1234", "white", 80, 400);
        c1.setColor("white");
        c1.setBrand("Porsche");
        c1.setFuelConsumption(10);
        c1.setSerialNumber("P1234");
        c1.setFuelAmount(80);
        c1.setTankVolumen(400);


c1.honk(1);

    }
}

