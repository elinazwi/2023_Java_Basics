package at.elina.oo.lamp;

public class Lightelement {
    private String name;
    private int electricityConsumption;
    public enum TYPE{on, off}
    private Lightelement.TYPE status;
    private String color;

    public Lightelement(String name, int electricityConsumption, TYPE status, String color) {
        this.name = name;
        this.electricityConsumption = electricityConsumption;
        this.status = status;
        this.color = color;
    }

    public void turnOn(){
        if (getStatus() == TYPE.off){
            setStatus(TYPE.on);
            this.electricityConsumption += 5;
            System.out.println("Mein Name ist " + name + " und ich bin jetzt eingeschalten! Mein neuer Stromverbrauch beträgt: " + this.electricityConsumption);
        } else {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschalten.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElectricityConsumption() {
        return electricityConsumption;
    }

    public void setElectricityConsumption(int electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }

    public TYPE getStatus() {
        return status;
    }

    public void setStatus(TYPE status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
