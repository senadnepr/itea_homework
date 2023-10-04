package sena.homework.hw05.hw0505;

/**
 * @author Sergej Chumakov on 04.10.2023
 */
public class Seria {
    private String name;
    private Furniture[] furnitures;
    private int number;
    private double amount;

    public Seria(int number, String name, Furniture... furnitures) {
        this.number = number;
        this.name = name;
        this.furnitures = furnitures;
        this.amount = checkAmount();
    }

    private double checkAmount() {
        double res = 0;
        for (int i = 0; i < furnitures.length; i++) {
            res += furnitures[i].getPrice();
        }
        return res;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void addFurniture(Furniture newFurniture){
        int oldArrayLenght = furnitures.length;
        Furniture[] newArray = new Furniture[oldArrayLenght + 1];
        for (int i = 0; i < oldArrayLenght; i++) {
            newArray[i] = furnitures[i];
        }
        newArray[oldArrayLenght] = newFurniture;
        furnitures = newArray;
        amount = checkAmount();
    }

    // замість Arrays.toString(furnitures), щоб уникнути "[]", бо їх немає в зразку у завданні
    private String getPrettyArrays(Furniture[] furnitures) {
        StringBuilder pretty = new StringBuilder("");
        for (int i = 0; i < furnitures.length; i++) {
            pretty.append(furnitures[i].toString());
        }
        return pretty.toString();
    }

    @Override
    public String toString() {
        return number +
                " Детальний опис: " +
                getPrettyArrays(furnitures) +
                "Загальна сума: " + amount +
                " грн.";
    }
}
