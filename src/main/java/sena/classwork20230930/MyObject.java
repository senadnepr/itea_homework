package sena.classwork20230930;

/**
 * @author Sergej Chumakov on 30.09.2023
 */
public class MyObject implements ComplexInterface{

    private int price;

    public MyObject() {
        this.price = getDefaultPrice();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void getPrice() {
        System.out.println(price);
    }
}
