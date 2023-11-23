package sena;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergej Chumakov on 21.11.2023
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {

        ClassLoader classLoader = Main.class.getClassLoader();
        String path1 = classLoader.getResource("addresses.xml").getPath();
        String path2 = classLoader.getResource("addresses1.xml").getPath();

        List<Address> addressList1 = new ArrayList<>();
        addressList1.add(new Address("Zaporijja", "Dniprovska", "22", "middle"));
        addressList1.add(new Address("Dnipro", "Truda", "3", "strong middle"));

        DocumentBuilderFactory dbFactory =
                DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();
        Element rootElement = doc.createElement("addresses");
        doc.appendChild(rootElement);

        for (Address address:addressList1) {
            Element addressElement = doc.createElement("address");
            rootElement.appendChild(addressElement);
            Element cityElement = doc.createElement("city");
//            Attr sizeAttr = doc.createAttribute("size");
//            sizeAttr.setValue(address.getCitySize());
//            cityElement.setAttributeNode(sizeAttr);
            cityElement.setAttribute("size", address.getCitySize()); // так, мабуть, буде краще
            cityElement.appendChild(doc.createTextNode(address.getCity()));
            addressElement.appendChild(cityElement);
            Element streetElement = doc.createElement("street");
            streetElement.appendChild(doc.createTextNode(address.getStreet()));
            addressElement.appendChild(streetElement);
            Element buildingElement = doc.createElement("building");
            buildingElement.appendChild(doc.createTextNode(address.getBuilding()));
            addressElement.appendChild(buildingElement);
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        FileWriter writer = new FileWriter(path1);
        StreamResult result = new StreamResult(writer);
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.transform(source, result);

        List<Address> addressList2 = new ArrayList<>();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        AddressHandler addressHandler = new AddressHandler(addressList2);

        saxParser.parse(new File(path1), addressHandler);
        saxParser.parse(new File(path2), addressHandler);
        System.out.println("Result: " + addressList2);
    }
}
