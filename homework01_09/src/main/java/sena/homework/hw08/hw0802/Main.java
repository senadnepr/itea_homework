package sena.homework.hw08.hw0802;

import sena.homework.hw08.hw0802.interface_comparable.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CarModified c1 = new CarModified(190, 8000, "BMW", "Red");
        CarModified c2 = new CarModified(190, 2000, "Opel", "Black");
        CarModified c3 = new CarModified(190, 2000, "Nissan", "Blue");
        CarModified c4 = new CarModified(190, 2000, "Toyota", "Blue");
        CarModified c5 = new CarModified(185, 10000, "Mercedes", "White");
        CarModified[] c = {c1, c2, c3, c4, c5};

        Arrays.sort(c);   // ClassCastException
        for (CarModified temp : c) {
            System.out.println(temp);
        }
    }
}
