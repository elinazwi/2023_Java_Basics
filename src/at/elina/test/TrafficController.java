package at.elina.test;

import java.util.ArrayList;
import java.util.List;

public class TrafficController {
    private List<Plane> planes;

    public TrafficController(){
        this.planes = new ArrayList<>();
    }

    public void informPeopleOnAllPlanes(){
        for (Plane planes: this.planes) {
            planes.informPassangers();
        }
    }

    public void printAllPlanes(){
        for (Plane planes: this.planes) {
            System.out.println("Flugzeugname: " + planes.getName() + " und Position: " + planes.getPosition().getLatitude() + ", " + planes.getPosition().getLongitude());
        }
    }

    public void addPlane(Plane plane){
        this.planes.add(plane);
    }
}
