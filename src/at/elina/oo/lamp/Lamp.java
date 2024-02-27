package at.elina.oo.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Lightelement> lightelements;

    public Lamp(){
        this.lightelements = new ArrayList<>();
    }

    public void addLightelement(Lightelement lightelement){
        this.lightelements.add(lightelement);
    }

    public void turnAllOn(){
        for (Lightelement lightelement : this.lightelements) {
            lightelement.turnOn();
        }
    }

    public double getOverallUsage(){
        double overallPowerUsage = 0;
        for (Lightelement lightelement : this.lightelements) {
            overallPowerUsage += lightelement.getElectricityConsumption();
        }
        return overallPowerUsage;
    }

    public void printNamesOfLightElements(){
        for (Lightelement lightelement : this.lightelements) {
            System.out.println(lightelement.getName());
        }
    }
}
