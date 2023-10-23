package sena.homework.hw08.hw0801;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sergej Chumakov on 23.10.2023
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new LinkedList<>();

        for (int i = 1; i < 11; i++){
            myList.add(i);
        }

        Iterator<Integer> iterator = myList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
