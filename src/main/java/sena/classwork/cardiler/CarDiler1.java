package sena.classwork.cardiler;

/**
 * @author Sergej Chumakov on 30.09.2023
 */
public class CarDiler1 {
    public static void main(String[] args) {

        Car1[] cars1 = {new Car1(), 
                new HybridCar1(), 
                new ElectricCar1()};

        ElectricCar1 electricCar1 = 
                new ElectricCar1();
        int volume = electricCar1.volume;
    }
}

class Car1 {
    private int id;
    private String year;
    private String colour;

    protected int volume;
}

class HybridCar1 extends Car1 {
    private int kW;
    private int kWH;
}

class ElectricCar1 extends Car1{
    private int kW;
    private int kWH;
}
