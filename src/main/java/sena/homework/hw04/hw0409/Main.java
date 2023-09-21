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

    private final Printer[] printers = new Printer[3];

    public static void main(String[] args) {

        Printer[] printers1 = {new RedPrinter(), new GreenPrinter(), new BluePrinter()};
        for (int i = 0; i < printers1.length; i++) {
            if(printers1[i] instanceof GreenPrinter) {
                printers1[i].print("Зелений рядок");
            }
            if(printers1[i] instanceof RedPrinter) {
                printers1[i].print("Червоний рядок");
            }
            if(printers1[i] instanceof BluePrinter) {
                printers1[i].print("Блакитний рядок");
            }
        }
    }
}
