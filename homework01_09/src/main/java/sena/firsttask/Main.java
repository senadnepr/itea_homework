package sena.firsttask;

/**
 * @author Sergej Chumakov on 23.09.2023
 */
public class Main {

    public static void main(String[] args) {

        Car myCar = new Car(1, 50, "white", 15000);

        myCar.setColour("black");
        myCar.setSpeed(250);
        double price = myCar.getPrice();
        myCar.setPrice(price * 1.25);

        System.out.println(myCar.getId() + " " + myCar.getSpeed()  + " " +  myCar.getColour() + " " + myCar.getPrice());
        System.out.println(myCar);
    }
}
