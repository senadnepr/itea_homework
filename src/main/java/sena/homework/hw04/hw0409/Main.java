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
        for (Printer printer :printers) {

            if(printer instanceof GreenPrinter) {
                printer.print("Зелений рядок");
            }
            if(printer instanceof RedPrinter) {
                printer.print("Червоний рядок");
            }
            if(printer instanceof BluePrinter) {
                printer.print("Блакитний рядок");
            }
        }
    }
}
