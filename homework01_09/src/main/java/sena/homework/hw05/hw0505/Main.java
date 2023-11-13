package sena.homework.hw05.hw0505;

import java.util.Scanner;

/**
 * @author Sergej Chumakov on 04.10.2023
 */
public class Main {
    public static void main(String[] args) {

        Fabrika factory1 = new Fabrika1();
        Fabrika factory2 = new Fabrika2();
        Fabrika factory3 = new Fabrika3();

        Fabrika[] factories = {factory1, factory2, factory3};

        int res;
        boolean isCorrect = false;
        do {
            System.out.println("Який варіант набору Ви хотіли б придбати ? " +
                    "1 -> Ар-деко 2 -> Вікторіанській 3 -> Модерн");
            Scanner scanner = new Scanner(System.in);
            res = scanner.nextInt();  // тут треба обробити Exception, якщо буде не цифра, але ми ще цього не вивчали
            if (res == 1 || res == 2 || res == 3) isCorrect = true;
        }while (!isCorrect);

        System.out.println("Ви обрали варіант: " + getFabrika(res, factories).getReport());

        // додавання нової меблі
        factory2.addFurniture(new Shelf(2500, "Камінна поличка"));
        // дивимось, як вийшло
        System.out.println("Ви обрали варіант: " + factory2.getReport());
    }

    private static Fabrika getFabrika(int res, Fabrika[] factories) {
        for (int i = 0; i < factories.length; i++) {
            if(res == factories[i].getNumber()) return factories[i];
        }
        return new EmptyFabrika();
    }
}
