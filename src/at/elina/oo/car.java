package at.elina.oo;

public class car {
    private Engine engine;
    private String color;
    private int fuelConsumption;
    private String serialNumber;
    private String brand;
    private int fuelAmount;
    private int tankVolumen;


    public car(Engine engine, int fuelConsumption, String brand, String serialNumber, String color, int fuelAmount, int tankVolumen) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.fuelAmount = fuelAmount;
        this.tankVolumen = tankVolumen;
    }

    //Methode
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("i am driving");
    }

    public void brake() {
        System.out.println("the car is braking");
    }

    public void turboBoost() {
        if (fuelAmount > tankVolumen * 0.1) {
            System.out.println("SuperBooooooost");
        } else {
            System.out.println("not enough fuel");
        }

    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuuuuuuut");
        }
    }

    public void RemainingRange() {
        if (fuelConsumption != 0) {
            double remainingRange = (double) fuelAmount / fuelConsumption;
            System.out.println("Remaining Range: " + remainingRange);
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setTankVolumen(int tankVolumen) {
        this.tankVolumen = tankVolumen;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankVolumen() {
        return tankVolumen;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
