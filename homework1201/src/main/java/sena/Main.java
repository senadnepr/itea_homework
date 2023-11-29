package sena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sergej Chumakov on 27.11.2023
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Double randomDouble = Math.random() * 100;
            numbers.add(randomDouble.intValue());
        }
        System.out.println("numbers=" + numbers);

        int result = numbers.stream()
                .map(number -> (int) Math.pow(number, 2))
                .reduce(0, (subtotal, element) -> subtotal + element);


        System.out.println("result=" + result);
    }
}
