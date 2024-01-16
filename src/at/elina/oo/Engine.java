package at.elina.oo;

public class Engine {
    //public enum TYPE {DIESEL, GAS};
    private  int horsePower;
    //private TYPE type; //Diesel oder Benzin
    private Tank tank;

    public Engine(int horsePower, Tank tank){
        this.horsePower = horsePower;
        //this.type = type;
        this.tank = tank;
    }
    //amount should be between 0 and 100
    public void drive(int amount){
        System.out.println("the motor is running with " + amount);
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
}