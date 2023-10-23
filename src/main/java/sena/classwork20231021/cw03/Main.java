package sena.classwork20231021.cw03;

import java.util.*;

/**
 * @author Sergej Chumakov on 21.10.2023
 */
public class Main {
    public static void main(String[] args) {

        List<String> arrayInt = new ArrayList<>();
        arrayInt.add("2");
        arrayInt.add("3");
        arrayInt.add("5");
//        for (String i : arrayInt) {
//            if(i.equals("5")) arrayInt.remove("5");
//        }

        Iterator it = arrayInt.iterator();

        while (it.hasNext()){
            String e = (String) it.next();
            if (e.equals("5")) it.remove();
        }

        System.out.println(arrayInt);

        List<Integer> myList = new LinkedList<>();
        Queue<Integer> myList2 = new LinkedList<>();
        myList.add(6);
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        myList.add(1);
//        Queue<Integer> sortedStrings = new PriorityQueue(myList.size(), Comparator.comparingInt(o -> (Integer) o));
        Queue<Integer> sortedStrings = new PriorityQueue(myList.size(), null);
        sortedStrings.addAll(myList);
        Iterator it1 = sortedStrings.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println(sortedStrings);
        Collections.sort(myList);
        System.out.println(myList);
//        myList.sort();
    }
}
