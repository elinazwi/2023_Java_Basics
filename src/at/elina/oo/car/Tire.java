package at.elina.oo;

public class Tire {
    public int diameter;
    public int position; // 1 = vorne links, 2 = vorne rechts, 3 = hinten links, 4 = hinten rechts


    public Tire(int diameter, int position) {
        this.diameter = diameter;
        this.position = position;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
