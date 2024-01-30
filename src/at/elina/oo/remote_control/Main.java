package at.elina.oo.remote_control;

public class Main {
    public static void main(String[]args){
        Battery battery1 = new Battery(Battery.TYPE.AA, 80);
        Battery battery2 = new Battery(Battery.TYPE.N, 90);

        Remote remote1 = new Remote("weiß", "neon orange", 12);

        remote1.addBattery(battery1);
        remote1.addBattery(battery2);

        remote1.turnOn();
        remote1.turnOff();
        remote1.getStatus();
    }
}