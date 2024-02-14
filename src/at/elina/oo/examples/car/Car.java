package at.elina.oo.examples.car;

public class Car {
    private String color;
    public int maximumSpeed;
    public int basePrice;
    public double baseConsumption;
    public int distance;
    public int mileage;

    public Car(String color, int maximumSpeed, int basePrice, double baseConsumption, int distance, int mileage){
        this.color = color;
        this.maximumSpeed = maximumSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.distance = distance;
        this.mileage = mileage;
    }

    public void changeConsumption(){
        if (this.mileage > 50000){
            this.baseConsumption = baseConsumption * 1.098;
        }
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public double getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(double baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
