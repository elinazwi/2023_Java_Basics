package at.elina.oo.phone;

public class Camera {
    private String resolution;
    private SDCard SDCard;

    public Camera(String resolution, SDCard SDCard) {
        this.resolution = resolution;
        this.SDCard = SDCard;
    }

    public String getResolution() {
        return resolution;
    }

    public SDCard getSDCard() {
        return SDCard;
    }
}
