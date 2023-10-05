package sena.homework.hw05.hw0504;

/**
 * @author Sergej Chumakov on 05.10.2023
 */
public class Toyota extends SomeCar{

    private final String brandName = "Toyota";

    public Toyota(String model, double power, int speed, double price) {
        super(model, power, speed, price);
    }

    @Override
    public String toString() {
        return "Brand: " + brandName + super.toString();
    }
}
