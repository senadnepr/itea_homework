package sena.classwork20230930;

/**
 * @author Sergej Chumakov on 30.09.2023
 */
public abstract class Plants {
    private int age;
    private String type;
    private String leaves;
    private String typeEarth;
    private String price;
    private String color;
    private Gorshok gorshok;

    public Plants(int age, String type, String leaves) {
        this.age = age;
        this.type = type;
        this.leaves = leaves;
    }

    public Plants(int age, String type, String leaves, String typeEarth, String price, String color, Gorshok gorshok) {
        this.age = age;
        this.type = type;
        this.leaves = leaves;
        this.typeEarth = typeEarth;
        this.price = price;
        this.color = color;
        this.gorshok = gorshok;
    }

    public abstract void water();

    public abstract void dobriva();

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Gorshok getGorshok() {
        return gorshok;
    }

    public void setGorshok(Gorshok gorshok) {
        this.gorshok = gorshok;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "age=" + age +
                ", type='" + type + '\'' +
                ", leaves='" + leaves + '\'' +
                ", typeEarth='" + typeEarth + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                ", gorshok=" + gorshok +
                '}';
    }
}
