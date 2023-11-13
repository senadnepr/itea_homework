package sena.homework.hw08.hw0805;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Sergej Chumakov on 24.10.2023
 */
public class Main {

    public static void main(String[] args) {
        Map<String,String> detect = new TreeMap<>();

        detect.put("Львів", "Іванови");
        detect.put("Київ", "Петрови");
        detect.put("Лондон", "Абрамовичі");
        //бачимо, що відсортовані по ключу
        System.out.println(detect);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть назву міста: ");
        String city = sc.nextLine();
        String name = detect.get(city);
        if(name == null){
            System.out.println("Такого міста немає в нашому довіднику.");
        } else {
            System.out.println(name);
        }
    }
}
