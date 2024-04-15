package at.elina.oo.phone;

public class PhoneFile {
    private String extension;
    private int sizeInMB;
    private String name;

    public PhoneFile(String extension, int sizeInMB, String name) {
        this.extension = extension;
        this.sizeInMB = sizeInMB;
        this.name = name;
    }

    public void getInfo(){
        System.out.println(name + "." + extension + " hat eine größe von: " + sizeInMB + "MB");
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return sizeInMB;
    }

    public String getName() {
        return name;
    }
}
