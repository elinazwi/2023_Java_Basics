package at.elina.test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String name;
    private List<Passanger> passangers;
    private Position position;

    public Plane(String name, Position position) {
        this.passangers = new ArrayList<>();
        this.name = name;
        this.position = position;
    }




    public void informPassangers(){
        for (Passanger passengers: this.passangers) {
            passengers.inform();
        }
    }

    public void addPassanger(Passanger passanger){
        this.passangers.add(passanger);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
