package sena.homework.hw08.hw0804;

import java.util.*;

/**
 * @author Sergej Chumakov on 24.10.2023
 */
public class Main {

    public static void main(String[] args) {

        Date begin = new Date();
        List<Integer> myList = getIntegerList(1000000);
        Date getList = new Date();
        System.out.println("getList: " + (getList.getTime() - begin.getTime()));
//        Integer min = getMinimum(myList);
        Integer min = getMinimumOpt(myList);

        Date sortList = new Date();
        System.out.println("sortList: " + (sortList.getTime() - getList.getTime()));
        System.out.println("min = " + min);
    }

    private static List<Integer> getIntegerList(int listSize) {

        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < listSize; i++){
            res.add(Math.toIntExact(Math.round(Math.random() * 10000)));
        }
        return res;
    }

    private static Integer getMinimum(List<Integer> myList) {
        Collections.sort(myList);
        return myList.get(0);
    }

    private static Integer getMinimumOpt(List<Integer> myList) {
        // це працює тільки для знаходження min значення
        PriorityQueue<Integer> pq = new PriorityQueue<>(myList);
        return pq.peek();
    }
}
