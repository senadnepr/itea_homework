package sena.classwork;

/**
 * @author Sergej Chumakov on 30.09.2023
 */
public class Rose extends Plants{

    public Rose(int age, String type, String leaves) {
        super(age, type, leaves);
    }

    public Rose(int age, String type, String leaves, String typeEarth, String price, String color, Gorshok gorshok) {
        super(age, type, leaves, typeEarth, "10.50", "white", new Gorshok(10,10 ));
    }

    @Override
    public void water() {
        System.out.println("water oftenly? once a week");
    }

    @Override
    public void dobriva() {
        System.out.println("minerals");
    }
}
