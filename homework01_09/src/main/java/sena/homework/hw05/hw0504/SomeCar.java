package sena.homework.hw05.hw0504;

/**
 * @author Sergej Chumakov on 04.10.2023
 */
public abstract class SomeCar {

    private String model;
    private double power;                           // - від 0.0 до 200.0
    private int speed;                              // - від 0 до 320
    private double price;                           // - від 0.0 до 50000.0
    private final int yearOfManufacture = 1967;     // для всіх один рік i оголошується лише один раз

    public SomeCar(String model, double power, int speed, double price) {
        this.model = model;
        setPower(power);
        setSpeed(speed);
        setPrice(price);
    }

    public void setPower(double power) {
        if(power < 0) this.power = 0;
        else if (power > 200) this.power = 200;
        else this.power = power;
    }

    public void setSpeed(int speed) {
        if(speed < 0) this.speed = 0;
        else if (speed > 320) this.speed = 320;
        else this.speed = speed;
    }

    public void setPrice(double price) {
        if(price < 0) this.price = 0;
        else if (price > 50000) this.price = 50000;
        else this.price = price;
    }

    public double getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    //Brand: KIA Rio Power: 600 Speed: 189 Price: 3458.90 Year: 1967
    @Override
    public String toString() {
        return " " + model +
                " Power: " + power +
                " Speed: " + speed +
                " Price: " + price +
                " Year: " + yearOfManufacture;
    }
}
