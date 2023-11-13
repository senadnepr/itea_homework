package sena.homework.hw04.hw0404;

/**
 * @author Sergej Chumakov on 19.09.2023
 */
public class Car {
    private int year;
    private double speed;
    private int weight;
    private String colour;

    public Car() {
        this.year = 1990;
        this.speed = 90;
        this.weight = 1200;
        this.colour = "black";
    }

    public Car(int year) {
        this();
        this.year = year;
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String colour) {
        this(year, speed, weight);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }
}
