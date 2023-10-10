package sena.classwork20230930;

/**
 * @author Sergej Chumakov on 30.09.2023
 */
public class Main {

    public static void main(String[] args) {

        Cactus myCactus1 = new Cactus(10, "some type", "no leaves");
        Rose myRose1 = new Rose(9, "some rose", "green");
        Cactus myCactus2 = new Cactus(10, "some type", "no leaves", "sand", "30.00", "yellow", new Gorshok(10,10));
        Rose myRose2 = new Rose(9, "some rose", "green", "water sand", "30.00", "yellow", new Gorshok(10,10));

        System.out.println("myCactus1= " + myCactus1);
        System.out.println("myRose1= " + myRose1);
        System.out.println("myCactus2= " + myCactus2);
        System.out.println("myRose2= " + myRose2);
    }


}
