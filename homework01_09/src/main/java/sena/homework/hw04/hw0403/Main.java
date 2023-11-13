package sena.homework.hw04.hw0403;
/*
HW - 04 - 03
Створити клас Машина з полями рік(int), колір(String). Створити конструктор за замовчуванням,
конструктор з одним і 2 параметрами. Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.
 */
/**
 * @author Sergej Chumakov on 18.09.2023
 */
public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2020);
        Car car3 = new Car(2020, "white");

        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
        System.out.println("car3: " + car3);
    }
}
