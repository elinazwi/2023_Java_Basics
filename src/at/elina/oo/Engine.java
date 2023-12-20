package at.elina.oo;

public class Engine {
    private enum TYPE (DIESEL, GAS);
    private  int horsePower;
    private TYPE type; //Diesel oder Benzin

    public Engine(int horsePower, TYPE type){
        this.horsePower = horsePower;
        this.type = type;
    }
    //amount should be between 0 and 100
    public void drive(int amount){
        System.out.println("the motor is running with " + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }
}