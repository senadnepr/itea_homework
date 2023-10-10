package sena.homework.hw05.hw0505;

/**
 * @author Sergej Chumakov on 04.10.2023
 */
public class Furniture {

    private final double price;
    private final String name;

    public Furniture(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\"" + name +
                "\", " + price +
                "грн. ";
    }
}
