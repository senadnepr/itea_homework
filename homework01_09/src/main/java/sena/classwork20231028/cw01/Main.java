package sena.classwork20231028.cw01;

import java.util.*;

/**
 * @author Sergej Chumakov on 28.10.2023
 */
public class Main {
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer)o2 - (Integer)o1;
            }
        });

        List<Integer> l = new LinkedList<>();

    }
}
