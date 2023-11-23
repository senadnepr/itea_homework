package sena;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergej Chumakov on 23.11.2023
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Addresses {

    @XmlElement(name="addresses")
    private List<Address1> addresses = new ArrayList<>();

    public List<Address1> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "addresses=" + addresses +
                '}';
    }
}
