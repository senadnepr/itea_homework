package sena.classwork20231111.work01;

/**
 * @author Sergej Chumakov on 11.11.2023
 */
public class Main {
    public static void main(String[] args) {

        ClientLinkDTO clientLinkDTO = new ClientLinkDTO();
        clientLinkDTO.setLinkID("12");
        clientLinkDTO.setLinkColor("red");
        clientLinkDTO.setMainClientID(123);
        clientLinkDTO.setGroupType("5");

        System.out.println("clientLinkDTO:\n" + clientLinkDTO);
    }
}
