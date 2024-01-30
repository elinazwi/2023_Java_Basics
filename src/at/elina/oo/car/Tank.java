package at.elina.oo;

public class Tank {
    private double fuelAmount;
    private double fuelConsumption;
    private String Type;

    public Tank(double fuelAmount, double fuelConsumption, String Type) {
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.Type = Type;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
}

