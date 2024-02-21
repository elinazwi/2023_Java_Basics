package at.elina.oo.examples.car;

public class Main {
    public static void main(String[] args){
        Engine e1 = new Engine(Engine.TYPE.Diesel, 300);
        Producer p1 = new Producer("Elina:))", "Austria", 0.8);
        Car car1 = new Car("gold", 250, 100000, 20, 600, 51000, p1, e1);
        System.out.println("Color of the car: " + car1.getColor());
        System.out.println("Name of Producer: " + p1.getNameOfProducer());
        car1.changeConsumption();
        System.out.println(car1.getBaseConsumption());
        System.out.println(car1.getBasePrice());
        car1.discountedPrice();
    }
}
