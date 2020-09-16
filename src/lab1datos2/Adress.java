package lab1datos2;
import ListaDinamica.LinkedList;
import java.util.Arrays;

public class Adress {
    
    private String street;
    private String suite;
    private String city;
    private String zipCode;
    private Geo geo;

    public Adress() {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipCode = zipCode;
        this.geo = geo;
    }

    public void addGeo(Geo g) {
        geo = g;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Adress{" + "street=" + street + ", suite=" + suite + ", city=" + city + ", zipCode=" + zipCode + ", geo=" + geo + '}';
    }
    
}