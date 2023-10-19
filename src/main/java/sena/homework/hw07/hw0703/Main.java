package sena.homework.hw07.hw0703;

/**
 * @author Sergej Chumakov on 18.10.2023
 */
public class Main {
    public static void main(String[] args) {

        ModernUnidirectionalLinkedList<Integer> myList = new ModernUnidirectionalLinkedList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        System.out.println(myList);
        System.out.println("myList.size()=" + myList.size());

        myList.add(4, 10);
        System.out.println("After add 4 index value 10: " + myList);
        System.out.println("2 myList.size()=" + myList.size());

        myList.remove(4);
        System.out.println("After remove 4 index: " + myList);

        myList.remove(Integer.valueOf(5));
        System.out.println("After remove value 5: " + myList);

        myList.insertHead(Integer.valueOf(120));
        System.out.println("After insertHead value 120: " + myList);
    }
}
