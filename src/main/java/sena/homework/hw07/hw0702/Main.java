package sena.homework.hw07.hw0702;

/**
 * @author Sergej Chumakov on 18.10.2023
 */
public class Main {
    public static void main(String[] args) {

        MyDictionary myDictionary = new MyDictionary();

        myDictionary.add("next", "nächste");
        myDictionary.add("previous", "vorherige");
        myDictionary.add("last", "letzte");
        myDictionary.add("second", "zweite");

        System.out.println(myDictionary);
        System.out.println("myDictionary.getSize()=" + myDictionary.getSize());

        myDictionary.add("last", "drittes");

        System.out.println(myDictionary);
        System.out.println("myDictionary.getSize()=" + myDictionary.getSize());

        System.out.println(myDictionary.transate("next"));
        System.out.println(myDictionary.transate("previous"));
        System.out.println(myDictionary.transate("last"));
    }
}
