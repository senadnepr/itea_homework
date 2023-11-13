package sena.homework.hw05.hw0505;

/**
 * @author Sergej Chumakov on 05.10.2023
 */
public interface Fabrika {

    String getReport();

    void addFurniture(Furniture newFurniture);

    int getNumber();

    // замість Arrays.toString(furnitures), щоб уникнути "[]", бо їх немає в зразку у завданні
    default String getPrettyArrays(Furniture[] furnitures) {
        StringBuilder pretty = new StringBuilder("");
        for (int i = 0; i < furnitures.length; i++) {
            pretty.append(furnitures[i].toString());
        }
        return pretty.toString();
    }

    default double checkAmount(Furniture[] furnitures) {
        double res = 0;
        for (int i = 0; i < furnitures.length; i++) {
            res += furnitures[i].getPrice();
        }
        return res;
    }
}
