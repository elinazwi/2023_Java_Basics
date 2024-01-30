package at.elina.oo.car;

public class Engine {
    //public enum TYPE {DIESEL, GAS};
    private  int horsePower;
    //private TYPE type; //Diesel oder Benzin
    private Tank tank;
    private int power;


    public Engine(int horsePower, Tank tank){
        this.horsePower = horsePower;
        //this.type = type;
        this.tank = tank;
    }
    //amount should be between 0 and 100
    public void drive(int amount, int speed){
        System.out.println("the motor is running with " + amount + " and is driving at a speed of " + speed + "km/h");
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    /*public TYPE getType() {
        return type;
    }*/

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Tank getTank() {
        return tank;
    }

    public void setPower(int power) {
        if ((power<1)|| (power>100)){
            System.out.println("Es muss eine Zahl zwischen 1 und 100 eingegeben werden!");

        }
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}