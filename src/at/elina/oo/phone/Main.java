package at.elina.oo.phone;

public class Main {
    public static void main(String[] args) {
        PhoneFile file1 = new PhoneFile("jpg", 2, "picture1");
        PhoneFile file2 = new PhoneFile("jpg", 6, "picture2");
        PhoneFile file3 = new PhoneFile("jpg", 8, "picture3");
        PhoneFile file4 = new PhoneFile("jpg", 10, "picture4");
        SDCard SDCard1 = new SDCard(50);

        file1.getInfo();
        file2.getInfo();
        file3.getInfo();
        file4.getInfo();
        SDCard1.getAllFiles();
    }
}
