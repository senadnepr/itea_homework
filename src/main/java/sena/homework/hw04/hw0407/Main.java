package sena.homework.hw04.hw0407;
/*
HW - 04 - 07

Створіть проект з класом Main.java.

Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має бути визначена висота та кількість пасажирів.
Для класу Ship – кількість пасажирів та порт приписки.
Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Sergej Chumakov on 20.09.2023
 */
public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("46°24'N","30°54'E", 15000, 150, 2015);
        vehicles[1] = new Ship("46°24'N","30°54'E", 15000000, 15, 2000, "Odesa", 200);
        vehicles[2] = new Plane("46°24'N","30°54'E", 1500000, 500, 2020, 2000, 10);

        System.out.println(Arrays.toString(vehicles));
    }
}
