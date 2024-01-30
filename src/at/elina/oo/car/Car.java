package at.elina.oo.car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Tire> tires;
    private String color;
    private int fuelConsumption;
    private String serialNumber;
    private String brand;
    private int fuelAmount;
    private int tankVolumen;


    public Car(Engine engine, int fuelConsumption, String brand, String serialNumber, String color, int fuelAmount, int tankVolumen) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.fuelAmount = fuelAmount;
        this.tankVolumen = tankVolumen;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void addTires(Tire tires){
        this.tires.add(tires);
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    //Methode
    public void drive(int amount, int speed) {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("i am driving");
        this.engine.drive(amount, speed);
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
            System.out.println("Ich bin ein " + this.brand + " und habe die Farbe " + this.color + " und habe " + this.getEngine().getHorsePower() + " ps.");
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

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }


    public Engine getEngine() {
        return engine;
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
