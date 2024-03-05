package at.elina.units;

public class Email {

    public static void main(String[] args) {

        String email = "elinazwi@icloud.com";

        if (email.matches(".*@.*\\.[a-zA-Z]{2,3}")){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }



}
