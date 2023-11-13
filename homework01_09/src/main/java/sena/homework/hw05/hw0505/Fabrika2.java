package sena.homework.hw05.hw0505;

/**
 * @author Sergej Chumakov on 05.10.2023
 */
public class Fabrika2 implements Fabrika{

    private final String name = "Вікторіанській";
    private final int number = 2;
    private Furniture[] furnitures = new Furniture[0];
    private double amount;

    public Fabrika2() {
        addFurniture(new Chair(2520, "Королівське"));
        addFurniture(new Table(5730, "Шерлок"));
        addFurniture(new Sofa(15450, "Гановер"));
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getReport() {
        return number +
                " Детальний опис: " +
                getPrettyArrays(furnitures) +
                "Загальна сума: " + amount +
                " грн.";
    }

    @Override
    public void addFurniture(Furniture newFurniture) {
        int oldArrayLenght = furnitures.length;
        Furniture[] newArray = new Furniture[oldArrayLenght + 1];
        for (int i = 0; i < oldArrayLenght; i++) {
            newArray[i] = furnitures[i];
        }
        newArray[oldArrayLenght] = newFurniture;
        furnitures = newArray;
        amount = checkAmount(furnitures);
    }
}
