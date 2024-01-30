package at.elina.oo.remote_control;

public class Battery {
    public enum TYPE {AAA, AA, N, C}
    private Battery.TYPE batterySize;
    private int stateOfCharge;

    public Battery(TYPE batterySize, int stateOfCharge){
        this.batterySize = batterySize;
        this.stateOfCharge = stateOfCharge;
    }

    public TYPE getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(TYPE batterySize) {
        this.batterySize = batterySize;
    }

    public int getStateOfCharge() {
        return stateOfCharge;
    }

    public void setStateOfCharge(int stateOfCharge) {
        this.stateOfCharge = stateOfCharge;
    }
}
