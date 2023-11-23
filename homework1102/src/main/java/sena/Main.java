package sena;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergej Chumakov on 21.11.2023
 */
public class Main {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {

        ClassLoader classLoader = Main.class.getClassLoader();
        String path = classLoader.getResource("addresses.xml").getPath();

        Addresses addressList = new Addresses();
        addressList.getAddresses().add(new Address1("Zaporijja", "Dniprovska", "22", "middle"));
        addressList.getAddresses().add(new Address1("Dnipro", "Truda", "3", "strong middle"));

        JAXBContext context = JAXBContext.newInstance(Addresses.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(addressList, new File(path));

        Addresses addresses = (Addresses) context.createUnmarshaller().unmarshal(new FileReader(path));
        System.out.println("Result: " + addresses);
    }
}
