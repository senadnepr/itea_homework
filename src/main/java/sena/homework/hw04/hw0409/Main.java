package sena.homework.hw04.hw0409;
/*
HW - 04 - 09
Створіть проект з класом Main.java.

Потрібно: Створити клас Printer. У тілі класу створіть метод void print(String value), який виводить на екран
значення аргументу. Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів, та виклику
відповідного методу їх екземпляра, рядки, передані як аргументи методів, виводилися різними кольорами. Обовʼязково
використовуйте приведення типів (Upcast / Downcast Explicitly).

 */

/**
 * @author Sergej Chumakov on 21.09.2023
 */
public class Main {

    public static void main(String[] args) {

        Printer[] printers = {new RedPrinter(), new GreenPrinter(), new BluePrinter()};

        RedPrinter redPrinter = (RedPrinter) printers[0];
        GreenPrinter greenPrinter = (GreenPrinter) printers[1];
        BluePrinter bluePrinter = (BluePrinter) printers[2];

        greenPrinter.print("Зелений рядок");
        redPrinter.print("Червоний рядок");
        bluePrinter.print("Блакитний рядок");
    }
}
