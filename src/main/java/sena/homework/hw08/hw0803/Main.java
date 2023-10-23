package sena.homework.hw08.hw0803;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sergej Chumakov on 23.10.2023
 */
public class Main {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        for(int i = 1; i < 6; i++){
            myList.add("element" + i);
        }
        System.out.println(myList);

        doubleValues(myList);
        for (String element:myList) {
            System.out.println(element);
        }
    }

    public static void doubleValues(List<String> listForDoubles){

        for (String element:listForDoubles) {
            element = "sdfgdsfg";
        }
        Iterator<String> iterator = listForDoubles.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
//            iterator.
        }

    }
}
