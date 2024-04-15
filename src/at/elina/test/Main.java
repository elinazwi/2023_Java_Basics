package at.elina.test;

public class Main {
    public static void main(String[] args) {
        Position position1 = new Position(10,10);
        Position position2 = new Position(50, 25);
        Plane plane1 = new Plane("Elinas Privatjet", position1);
        Plane plane2 = new Plane("Flugzeug1", position2);
        Passanger passanger1 = new Passanger("Elina", "Zwischenbrugger");
        Passanger passanger2 = new Passanger("Anita", "Zwischenbrugger");
        Passanger passanger3 = new Passanger("Marco", "Zwischenbrugger");
        TrafficController TC1 = new TrafficController();

        TC1.addPlane(plane1);
        TC1.addPlane(plane2);
        plane1.addPassanger(passanger1);
        plane2.addPassanger(passanger2);
        plane2.addPassanger(passanger3);
        plane2.informPassangers();
        TC1.informPeopleOnAllPlanes();
        TC1.printAllPlanes();
    }
}
