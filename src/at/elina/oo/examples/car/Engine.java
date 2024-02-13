package at.elina.oo.examples.car;

public class Engine {
    public enum TYPE{Gas, Diesel}
    private Engine.TYPE refuel;
    private int power;

    public Engine(TYPE refuel, int power){
        this.refuel = refuel;
        this.power = power;
    }

    public TYPE getRefuel() {
        return refuel;
    }

    public void setRefuel(TYPE refuel) {
        this.refuel = refuel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
