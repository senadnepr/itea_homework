package sena.classwork20230930;

/**
 * @author Sergej Chumakov on 30.09.2023
 */
public interface ComplexInterface {
    int price = 10;

    void getPrice();

    default int getDefaultPrice(){
        return price;
    }
}
