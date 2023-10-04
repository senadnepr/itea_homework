package sena.homework.hw05.hw0505;

import java.util.Scanner;

/**
 * @author Sergej Chumakov on 04.10.2023
 */
public class Main {
    public static void main(String[] args) {

        Seria artDeko = new Seria(1,"Ар-деко",
                new Chair(2340, "Тиха гавань"),
                new Table(7340.57, "Мудрість віків"),
                new Sofa(14020.57, "Місце роздумів"));

        Seria viktoria = new Seria(2,"Вікторіанській",
                new Chair(2520, "Королівське"),
                new Table(5730, "Шерлок"),
                new Sofa(15450, "Гановер"));

        Seria modern = new Seria(3,"Модерн",
                new Chair(1340, "Стар шіп"),
                new Table(5340.17, "Гіпер портал"),
                new Sofa( 4340, "Пульт керування"));

        Seria[] allSeries = {artDeko, viktoria, modern};

        int res = 0;
        boolean isCorrect = false;
        do {
            System.out.println("Який варіант набору Ви хотіли б придбати ? " +
                    "1 -> Ар-деко 2 -> Вікторіанській 3 -> Модерн");
            Scanner scanner = new Scanner(System.in);
            res = scanner.nextInt();  // тут треба обробити Exception, якщо буде не цифра, але ми ще цього не вивчали
            if (res == 1 || res == 2 || res == 3) isCorrect = true;
        }while (!isCorrect);

        System.out.println("Ви обрали варіант: " + getSeria(res, allSeries).toString());

        // додавання нової меблі
        viktoria.addFurniture(new Shelf(2500, "Камінна поличка"));
        // дивимось, як вийшло
        System.out.println("Ви обрали варіант: " + viktoria);
    }

    private static Seria getSeria(int res, Seria[] allSeries) {
        for (int i = 0; i < allSeries.length; i++) {
            if(res == allSeries[i].getNumber()) return allSeries[i];
        }
        return new Seria(0, "Помилка вибору", new Furniture[0]); // на всяк випадок, хоча do...wile не допустить цього
    }
}
