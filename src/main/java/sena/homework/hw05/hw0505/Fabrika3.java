package sena.homework.hw05.hw0505;

/**
 * @author Sergej Chumakov on 05.10.2023
 */
public class Fabrika3 implements Fabrika{

    private final String name = "Модерн";
    private final int number = 3;
    private Furniture[] furnitures = new Furniture[0];
    private double amount;

    public Fabrika3() {
        addFurniture(new Chair(1340, "Стар шіп"));
        addFurniture(new Table(5340.17, "Гіпер портал"));
        addFurniture(new Sofa( 4340, "Пульт керування"));
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
