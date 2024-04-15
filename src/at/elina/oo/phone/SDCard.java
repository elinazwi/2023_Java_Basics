package at.elina.oo.phone;

import java.util.ArrayList;

public class SDCard {
    private int capacity;
    private ArrayList<PhoneFile> phoneFiles;


    public SDCard(int capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }



    public int getCapacity() {
        return capacity;
    }

    public ArrayList<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }
}
