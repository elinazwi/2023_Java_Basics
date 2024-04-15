package at.elina.test;

public class Passanger {
    private String firstname;
    private String lastname;

    public Passanger(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void inform(){
        System.out.println("My name is: " + firstname + " " + lastname + " and i am informed");
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
