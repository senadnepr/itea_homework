package sena.homework.hw04.hw0403;

/**
 * @author Sergej Chumakov on 18.09.2023
 */
public class Car {
    private int year;
    private String colour;

    public Car() {
        this.year = 2000;
        this.colour = "black";
    }

    public Car(int year) {
        this.year = year;
        this.colour = "black";
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }
}
