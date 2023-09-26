package sena.firsttask;

/**
 * @author Sergej Chumakov on 23.09.2023
 */
public class Car {
    private int id;
    private int speed;
    private String colour;
    private double price;

    public Car(int id, int speed, String colour, double price) {
        this.id = id;
        this.speed = speed;
        this.colour = colour;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", speed=" + speed +
                ", colour='" + colour + '\'' +
                ", price=" + price;
    }
}
