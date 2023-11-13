package sena.homework.hw04.hw0407;

/**
 * @author Sergej Chumakov on 20.09.2023
 */
public class Car extends Vehicle {

    public Car(String latitude, String longitude, int price, double speed, int year) {
        super(latitude, longitude, price, speed, year);
    }

    @Override
    public String toString() {
        return "Car{" + super.toString();
    }
}
