package at.elina.oo;

public class car {
    public String color;
    public int fuelConsumption;
    public String serialNumber;
    public String brand;
    public int fuelAmount;
    public int tankVolume;

    //Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("i am driving");
    }

    public void brake(){
        System.out.println("the car is braking");
    }

    public void turboBoost(){
    }

}
