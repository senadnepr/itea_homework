package sena;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.List;

/**
 * @author Sergej Chumakov on 23.11.2023
 */
public class AddressHandler extends DefaultHandler {

    private List<Address> addressList;
    private Address address;
    private String lastElementName;

    public AddressHandler(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equals("address")){
            address = new Address();
        }
        if(qName.equals("city")){
            String size = attributes.getValue("size");
            address.setCitySize(size);
        }
        lastElementName = qName;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String information = new String(ch, start, length);

        information = information.replace("\n", "").trim();

        if (!information.isEmpty()) {
            if (lastElementName.equals("city"))
                address.setCity(information);
            if (lastElementName.equals("street"))
                address.setStreet(information);
            if (lastElementName.equals("building"))
                address.setBuilding(information);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("address")){
            addressList.add(address);
        }
    }
}
