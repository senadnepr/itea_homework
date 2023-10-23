package sena.homework.hw08.hw0802;

public class CarModified implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    CarModified(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((CarModified)o).speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            temp = this.price - ((CarModified)o).price;
        } else {
            return temp;
        }
        if (temp == 0) {
            temp = this.color.compareTo(((CarModified)o).color);
        } else {
            return temp;
        }
        if (temp == 0) {
            return this.model.compareTo(((CarModified)o).model);
        } else {
            return temp;
        }
    }
}
