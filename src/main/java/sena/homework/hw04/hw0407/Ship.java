package sena.homework.hw04.hw0407;

/**
 * @author Sergej Chumakov on 20.09.2023
 */
public class Ship extends Vehicle{

    private final String port;
    private final int passengers; //якщо ми припускаємо, що це кількість місць для пасажирів, яка є незмінною

    public Ship(String latitude, String longitude, int price, double speed, int year, String port, int passengers) {
        super(latitude, longitude, price, speed, year);
        this.port = port;
        this.passengers = passengers;
    }

    public String getPort() {
        return port;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "port=" + port +
                ", passengers=" + passengers +
                ", " + super.toString();
    }
}
