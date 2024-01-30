package at.elina.oo.remote_control;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private String colorOfRemote;
    private String colorOfButtons;
    private int remoteSize;
    private List<Battery>  battery;

    public Remote(String colorOfRemote, String colorOfButtons, int remoteSize){
        this.colorOfRemote = colorOfRemote;
        this.colorOfButtons = colorOfButtons;
        this.remoteSize = remoteSize;
        this.battery = new ArrayList<>();
    }

    public void addBattery(Battery battery){
        this.battery.add(battery);
    }

    public String getColorOfRemote() {
        return colorOfRemote;
    }

    public void setColorOfRemote(String colorOfRemote) {
        this.colorOfRemote = colorOfRemote;
    }

    public String getColorOfButtons() {
        return colorOfButtons;
    }

    public void setColorOfButtons(String colorOfButtons) {
        this.colorOfButtons = colorOfButtons;
    }

    public int getRemoteSize() {
        return remoteSize;
    }

    public void setRemoteSize(int remoteSize) {
        this.remoteSize = remoteSize;
    }

    public List<Battery> getBattery() {
        return battery;
    }

    public void setBattery(List<Battery> battery) {
        this.battery = battery;
    }

    public void getStatus(){
        int result = (getBattery().get(0).getStateOfCharge() + getBattery().get(1).getStateOfCharge()) / 2;
        System.out.println(result);
    }

    public void turnOn(){
        int currentState1 = this.battery.get(0).getStateOfCharge();
        int currentState2 = this.battery.get(1).getStateOfCharge();
        int fivePercent = 5;
        this.battery.get(0).setStateOfCharge(currentState1 - 5);
        this.battery.get(1).setStateOfCharge(currentState2 - 5);
        System.out.println("Batterie 1: Verbraucher angeschlossen. Verbliebene Prozent: " + battery.get(0).getStateOfCharge());
        System.out.println("Batterie 2: Verbraucher angeschlossen. Verbliebene Prozent: " + battery.get(1).getStateOfCharge());
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen!");
    }
}


