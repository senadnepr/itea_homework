package sena.homework.hw05.hw0504;

import java.util.Arrays;

/**
 * @author Sergej Chumakov on 04.10.2023
 */
public class Main {
    public static void main(String[] args) {

        SomeCar ford = new SomeCar("Ford", 180, 250, 25000);
        SomeCar mitsubishi = new SomeCar("Mitsubishi", 100, 150, 15000);
        SomeCar toyota = new SomeCar("Toyota", 200, 220, 40000);
        SomeCar kia = new SomeCar("KIA", 120, 180, 18000);

        CarInfo carInfo = new CarInfo();
        carInfo.addCar(ford);
        carInfo.addCar(mitsubishi);
        carInfo.addCar(toyota);
        carInfo.addCar(kia);

        System.out.println("maxExpensiveCar is " + carInfo.maxExpensiveCar());
        System.out.println("maxSpeedCar is " + carInfo.maxSpeedCar());
        System.out.println("maxPowerCar is " + carInfo.maxPowerCar());
    }
}
