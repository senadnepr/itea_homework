package sena.homework.hw04.hw0404;
/*
HW - 04 - 04
Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
Перевантажити конструктори викликаючи конструктор із конструктора.
Створити клас Main, де створити екземпляри класу Машина з різними параметрами.
 */
/**
 * @author Sergej Chumakov on 19.09.2023
 */
public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2002);
        Car car3 = new Car(2003, 120.10);
        Car car4 = new Car(2004, 110.0, 1850);
        Car car5 = new Car(2005, 130.0, 1560, "white");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
