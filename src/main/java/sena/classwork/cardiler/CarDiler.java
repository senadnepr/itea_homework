package sena.classwork.cardiler;

/**
 * @author Sergej Chumakov on 30.09.2023
 */
public class CarDiler {

    public static void main(String[] args) {

        Car[] cars = {new Car()};
        HybridCar[] hybridCar = {new HybridCar()};
        ElectricCar[] electricCar = {new ElectricCar()};
    }
}

class Car {
    private int id;
    private String year;
    private String colour;

    private int volume;
}

class HybridCar {
    private int id;
    private String year;
    private String colour;

    private int volume;

    private int kW;
    private int kWH;
}

class ElectricCar {
    private int id;
    private String year;
    private String colour;

    private int kW;
    private int kWH;
}
