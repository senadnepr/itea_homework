package sena.homework.hw05.hw0505;

/**
 * @author Sergej Chumakov on 04.10.2023
 */
public class Chair extends Furniture{
    private final String pieceOfFurniture = "Крісло";

    public Chair(double price, String name) {
        super(price, name);
    }

    @Override
    public String toString() {
        return pieceOfFurniture +
                " - " + super.toString();
    }
}
