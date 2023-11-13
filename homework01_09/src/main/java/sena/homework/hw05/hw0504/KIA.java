package sena.homework.hw05.hw0504;

/**
 * @author Sergej Chumakov on 05.10.2023
 */
public class KIA extends SomeCar{

    private final String brandName = "KIA";

    public KIA(String model, double power, int speed, double price) {
        super(model, power, speed, price);
    }

    @Override
    public String toString() {
        return "Brand: " + brandName + super.toString();
    }
}
