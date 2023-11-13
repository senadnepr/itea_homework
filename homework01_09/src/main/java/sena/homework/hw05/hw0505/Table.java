package sena.homework.hw05.hw0505;

/**
 * @author Sergej Chumakov on 04.10.2023
 */
public class Table extends Furniture{
    private final String pieceOfFurniture = "Столик";

    public Table(double price, String name) {
        super(price, name);
    }

    @Override
    public String toString() {
        return pieceOfFurniture +
                " - " + super.toString();
    }
}
