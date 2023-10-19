package sena.homework.hw07.hw0701;

/**
 * @author Sergej Chumakov on 18.10.2023
 */
public class Main {
    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<>();

        myList.add(2);
        myList.add(12);
        myList.add(-10);

        System.out.println("myList.size()=" + myList.size());

        System.out.println(myList);

        System.out.println("myList.get(2)=" + myList.get(2));
        myList.get(3); // тут буде наш Exception
//        myList.get(-4); // тут теж буде наш Exception
    }
}
