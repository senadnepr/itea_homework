package sena;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sergej Chumakov on 27.11.2023
 */
public class Main {
    public static void main(String[] args) {

        Operation add = (x, y) -> x + y;
        Operation minus = (x, y) -> x - y;
        Operation multu = (x, y) -> x * y;
        Operation divide = (x, y) -> x / y;
        Operation pow = (x, y) -> Math.pow(x, y);
        Operation root = (x, y) -> Math.sqrt(x);

        List<Double> results = Arrays.asList(
        add.calculate(2, 4),
                minus.calculate(2, 4),
                multu.calculate(2, 4),
                divide.calculate(2, 4),
                pow.calculate(2, 4),
                root.calculate(121, 0)
        );

        System.out.println(results);
    }
}
