package sena.homework.hw04.hw0407;

/**
 * @author Sergej Chumakov on 20.09.2023
 */
public class Plane extends Vehicle{

    private int high;
    private final int passengers; //якщо ми припускаємо, що це кількість місць для пасажирів, яка є незмінною

    public Plane(String latitude, String longitude, int price, double speed, int year, int high, int passengers) {
        super(latitude, longitude, price, speed, year);
        this.high = high;
        this.passengers = passengers;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "high=" + high +
                ", passengers=" + passengers +
                ", " + super.toString();
    }
}
