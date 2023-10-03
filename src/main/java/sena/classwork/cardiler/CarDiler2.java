package sena.classwork.cardiler;

/**
 * @author Sergej Chumakov on 30.09.2023
 */
public class CarDiler2 {
    public static void main(String[] args) {

        AbstractCar2[] cars2 = {new Car2(),
                new HybridCar2(),
                new ElectricCar2()};
    }
}

abstract class AbstractCar2 {
    private int id;
    private String year;
    private String colour;
}

class Car2  extends AbstractCar2 {
    private int volume;
}

class HybridCar2 extends AbstractCar2 {
    protected int volume;
    private int kW;
    private int kWH;
}

class ElectricCar2 extends AbstractCar2 {
    private int kW;
    private int kWH;
}
