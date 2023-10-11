package sena.homework.hw06.hw0606;

/**
 * @author Sergej Chumakov on 10.10.2023
 */
public enum Vehicles {

    TOYOTA(35000),
    NISSAN(40000),
    DAWOO(12000),
    SUZUKI(24000),
    AUDI(50000);

    private int price;
    private String color;

    Vehicles(int price){
        this.price = price;
    }

    private String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.name() +
                ", " + getColor() +
                ", " + price;
    }
}
