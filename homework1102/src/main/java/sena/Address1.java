package sena;

import jakarta.xml.bind.annotation.*;

/**
 * @author Sergej Chumakov on 23.11.2023
 */
@XmlType(name = "address")
@XmlAccessorType (XmlAccessType.FIELD)
public class Address1 {

    @XmlElement
    private City city;
    @XmlElement
    private String street;
    @XmlElement
    private String building;

    public Address1(String city, String street, String building, String citySize) {
        this.city = new City(citySize, city);
        this.street = street;
        this.building = building;
    }

    public Address1() {
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    @Override
    public String toString() {
        return "Address1{" +
                "city=" + city +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                '}';
    }
}
