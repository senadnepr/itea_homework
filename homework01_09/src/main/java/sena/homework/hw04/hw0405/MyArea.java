package sena.homework.hw04.hw0405;

/**
 * @author Sergej Chumakov on 19.09.2023
 */
public class MyArea {

    private static double pi = 3.14;

    public static void areaOfCircle(double radius){

        double square = 2 * pi * Math.pow(radius, 2);

        System.out.println("Area Of Circle is: " + square);
    }
}
