package at.elina.oo;

public class car {
    public String color;
    public int fuelConsumption;
    public String serialNumber;
    public String brand;
    public int fuelAmount;
    public int tankVolumen;


    public car(int fuelConsumption, String brand, String serialNumber, String color, int fuelAmount, int tankVolumen){
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

    public void honk (int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuuuuuuut");
        }
    }

    public void RemainingRange(){
        if (fuelConsumption !=0) {
            double remainingRange = (double) fuelAmount / fuelConsumption;
            System.out.println("Remaining Range: " + remainingRange);
        }
    }
}