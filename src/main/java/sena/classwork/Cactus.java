package sena.classwork;

/**
 * @author Sergej Chumakov on 30.09.2023
 */
public class Cactus extends Plants{

    public Cactus(int age, String type, String leaves) {
        super(age, type, leaves, "sand", "20.20", "green", new Gorshok(5,5));
    }

    public Cactus(int age, String type, String leaves, String typeEarth, String price, String color, Gorshok gorshok) {
        super(age, type, leaves, typeEarth, price,  color,  gorshok);
    }

    @Override
    public void water() {
        System.out.println("water occasion only a month");
    }

    @Override
    public void dobriva() {
        System.out.println("organic");
    }
}
