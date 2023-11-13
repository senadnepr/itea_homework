package sena.homework.hw08.hw0803;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sergej Chumakov on 23.10.2023
 */
public class Main {
    public static void main(String[] args) {

//        List<String> myList = new ArrayList<>(); // немає значення, який лист у нас є, ArrayList або LinkedList
        List<String> myList = new LinkedList<>();

        for(int i = 1; i < 6; i++){
            myList.add("element" + i);
        }
        System.out.println(myList);

//        myList = doubleValues(myList);  // варіант 1 повертає новий лист с подвоєними рядками
//        doubleValues2(myList);          // варіант 2 перезаписує лист листом с подвоєними рядками
        doubleValues3(myList);            // варіант 3 додає у існуючий лист подвійні значення
        for (String element:myList) {
            System.out.println(element);
        }
    }

    public static List<String> doubleValues(List<String> listForDoubles){
        List<String> tmp = new ArrayList<>();
        for (String element: listForDoubles) {
            tmp.add(element);
            tmp.add(element);
        }
        return tmp;
    }

    public static void doubleValues2(List<String> listForDoubles){
        List<String> tmp = new LinkedList<>();
        for (String element: listForDoubles) {
            tmp.add(element);
            tmp.add(element);
        }
        listForDoubles.clear();
        listForDoubles.addAll(tmp);
    }

    public static void doubleValues3(List<String> listForDoubles){

        for (int i = 0; i < listForDoubles.size(); i++) {
            String element = listForDoubles.get(i);
            listForDoubles.add(++i, element);
        }
    }
}
