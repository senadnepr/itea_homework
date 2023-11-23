package sena;

import jakarta.xml.bind.annotation.*;

/**
 * @author Sergej Chumakov on 23.11.2023
 */
@XmlType(name = "city")
@XmlAccessorType(XmlAccessType.FIELD)
public class City {

    @XmlValue
    private String city;

    @XmlAttribute(name="size")
    private String citySize;

    public City() {
    }

    public City(String citySize, String city) {
        this.citySize = citySize;
        this.city = city;
    }

    public void setCitySize(String citySize) {
        this.citySize = citySize;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "citySize='" + citySize + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
