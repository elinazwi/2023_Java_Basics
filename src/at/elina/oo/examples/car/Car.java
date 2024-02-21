package at.elina.oo.examples.car;

public class Car {
    private String color;
    public int maximumSpeed;
    public double basePrice;
    public double baseConsumption;
    public int distance;
    public int mileage;
    private Producer producer;
    private Engine engine;

    public Car(String color, int maximumSpeed, double basePrice, double baseConsumption, int distance, int mileage, Producer producer, Engine engine){
        this.color = color;
        this.maximumSpeed = maximumSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.distance = distance;
        this.mileage = mileage;
        this.producer = producer;
        this.engine = engine;
    }

    public void discountedPrice(){
        double discountOfCar = this.basePrice * producer.getDiscount() /100;
        double newPrice = basePrice - discountOfCar;
        System.out.println("The Base price is " + basePrice + "€ and the discounted Price is " + newPrice + "€");

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

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
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
