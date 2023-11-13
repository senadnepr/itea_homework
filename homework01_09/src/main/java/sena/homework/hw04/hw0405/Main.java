package sena.homework.hw04.hw0405;
/*
HW - 04 - 05
Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle, який повинен
приймати радіус та використовуючи PI порахувати площу кола і виводить результат в консоль.
Створити клас Main, де запустити цей метод.
 */
/**
 * @author Sergej Chumakov on 19.09.2023
 */
public class Main {

    public static void main(String[] args) {

        MyArea.areaOfCircle(12);
        MyArea.areaOfCircle(11.23);
        MyArea.areaOfCircle(0.34);
    }
}
