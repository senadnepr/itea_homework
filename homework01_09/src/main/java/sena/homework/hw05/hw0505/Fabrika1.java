package sena.homework.hw05.hw0505;

/**
 * @author Sergej Chumakov on 05.10.2023
 */
public class Fabrika1 implements Fabrika{

    private final String name = "Ар-деко";
    private final int number = 1;
    private Furniture[] furnitures = new Furniture[0];
    private double amount;

    public Fabrika1() {
        addFurniture(new Chair(2340, "Тиха гавань"));
        addFurniture(new Table(7340.57, "Мудрість віків"));
        addFurniture(new Sofa(14020.57, "Місце роздумів"));
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
