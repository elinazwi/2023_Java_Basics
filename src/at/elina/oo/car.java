package at.elina.oo;

public class car {
    public String color;
    public int fuelConsumption;
    public String serialNumber;
    public String brand;
    public int fuelAmount;
    public int tankVolumen;
    public int amountHonks;

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

    public void honk (int amountOfRepetitions){

    }
}