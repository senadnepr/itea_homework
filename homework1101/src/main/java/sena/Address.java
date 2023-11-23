package sena;

/**
 * @author Sergej Chumakov on 23.11.2023
 */
public class Address {


    private String city;
    private String street;
    private String building;

    private String citySize;

    public Address(String city, String street, String building, String citySize) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.citySize = citySize;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getCitySize() {
        return citySize;
    }

    public void setCitySize(String citySize) {
        this.citySize = citySize;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", citySize='" + citySize + '\'' +
                '}';
    }
}
