package at.elina.oo.examples.car;

public class Producer {
    public String nameOfProducer;
    public String countryOfOrigin;
    public double discount;

    public Producer(String nameOfProducer, String countryOfOrigin, double discount){
        this.nameOfProducer = nameOfProducer;
        this.countryOfOrigin = countryOfOrigin;
        this.discount = discount;
    }

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public void setNameOfProducer(String nameOfProducer) {
        this.nameOfProducer = nameOfProducer;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
