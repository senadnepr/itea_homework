package sena.homework.hw06.hw0602;

import sena.homework.hw06.hw0601.Animal;
import sena.homework.hw06.hw0601.Zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergej Chumakov on 10.10.2023
 */
public class Main {

    public static final String ANIMAL_COUNT = "Кількість залишившихся тварин: ";

    public static void main(String[] args) {

        // якщо в умові видалити 3-ю, 5-у, 7-у тварину
        Zoo zoo = new Zoo();
        zoo.getAnimalsInZoo().remove(7);
        zoo.getAnimalsInZoo().remove(5);
        zoo.getAnimalsInZoo().remove(3);
        System.out.println(ANIMAL_COUNT + zoo.getAnimalsInZoo().size());

        // якщо в умові видалити три, пʼять чи сім тварин
        zoo = new Zoo();
        removeAnimalsAndPrint(zoo.getAnimalsInZoo(), 3);
        zoo = new Zoo();
        removeAnimalsAndPrint(zoo.getAnimalsInZoo(), 5);
        zoo = new Zoo();
        removeAnimalsAndPrint(zoo.getAnimalsInZoo(), 7);

        zoo = new Zoo();
        removeAnimalsAndPrint(zoo.getAnimalsInZoo(), 9);
    }

    private static void removeAnimalsAndPrint(List<Animal> animalsInZoo, int numberForRemove) {
        if(numberForRemove > animalsInZoo.size()){
            System.out.println("Тут немає стільки тварин для перевезення.");
        } else {
            for (int i = 0; i < numberForRemove; i++) {
                animalsInZoo.remove(0);
            }
            System.out.println(ANIMAL_COUNT + animalsInZoo.size());
        }
    }
}
