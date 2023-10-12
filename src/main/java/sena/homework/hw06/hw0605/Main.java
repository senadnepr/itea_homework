package sena.homework.hw06.hw0605;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Sergej Chumakov on 11.10.2023
 */
public class Main {

    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        int thisYear = 2023;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Введіть ФІО працівника:");
            String fio = scanner.nextLine();
            System.out.println("Введіть посаду працівника:");
            String position = scanner.nextLine();
            System.out.println("Введіть рік надходження на роботу(YYYY):");
            int recruitmentYear = 0;
            boolean flag = false;
            do {
                try {
                    String recruitmentYearString = scanner.next("\\d{4}");
                    recruitmentYear = Integer.parseInt(recruitmentYearString);
                    flag = true;
                } catch (InputMismatchException e) {
                    System.out.println(e);
                    System.out.println("Введіть коректне значення року!");
                } finally {
                    scanner.nextLine();   //щоб "проковтнути" Enter, який не вичитує next((
                }
            } while (!flag);
            workers[i] = new Worker(fio, position, recruitmentYear);
        }
        Arrays.sort(workers);
        // виводимо для показу впорядкованості за абеткою
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].toString());
        }
        boolean flag = false;
        int seniority = 0;
        System.out.println("Введіть необхідний стаж працівника:");
        do {
            try {
                seniority = scanner.nextInt();
                flag = true;
            } catch (Exception e) {
                scanner.nextLine();   //щоб "проковтнути" Enter, який не вичитує next((
                System.out.println(e);
                System.out.println("Введіть коректне значення року!");
            }
        }while (!flag);
        for (int i = 0; i < workers.length; i++) {
            if (thisYear - workers[i].getRecruitmentYear() > seniority) {
//                System.out.println(workers[i].getFio());
                System.out.println(workers[i].getSecondName());
            }
        }
        scanner.close();
    }
}
