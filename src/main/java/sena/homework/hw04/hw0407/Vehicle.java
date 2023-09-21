package sena.homework.hw04.hw0407;

/**
 * @author Sergej Chumakov on 20.09.2023
 */
public class Vehicle {

    private String latitude;
    private String longitude;
    private double speed; // якщо це швидкість не максимальна для судна, а у цей момент

    private final int price; //значення будуть досить великими, тому без копійок
    private final int year;

    public Vehicle(String latitude, String longitude, int price, double speed, int year) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public int getPrice() {
        return price;
    }

    public double getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
