package sena.homework.hw05.hw0505;

/**
 * @author Sergej Chumakov on 04.10.2023
 */
public class Sofa extends Furniture{
    private final String pieceOfFurniture = "Диван";

    public Sofa(double price, String name) {
        super(price, name);
    }

    @Override
    public String toString() {
        return pieceOfFurniture +
                " - " + super.toString();
    }
}
