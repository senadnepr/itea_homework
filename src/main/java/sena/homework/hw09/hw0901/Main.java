package sena.homework.hw09.hw0901;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Sergej Chumakov on 31.10.2023
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Set<String> pryimen = new HashSet<>(Arrays.asList(" в ", " із ", " на ", " до ", " від ", " у ", " з ", " за ", " над ",
                " під ", " при ", " про ", " через ", " без ", " для ", " по ", " серед ", " попід" , " навколо ",
                " спереду ", " поза ", " понад ", " перед ", " близько ", " посеред "));

        StringBuilder stringBuilder = new StringBuilder();

        ClassLoader classLoader = Main.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("text.txt");
        InputStreamReader isr = new InputStreamReader(inputStream);
        try (BufferedReader br
                     = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String lineWithSpace = line + " "; // якщо прийменник у нас у кінці рядка
                for (String pryimen1: pryimen) {
                    String tmp = lineWithSpace.replace(pryimen1, " Java ");
                    lineWithSpace = tmp;
                }
                stringBuilder.append(lineWithSpace).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(stringBuilder);
    }
}
