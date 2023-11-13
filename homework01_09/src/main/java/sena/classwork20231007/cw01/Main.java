package sena.classwork20231007.cw01;

import java.util.*;

/**
 * @author Sergej Chumakov on 07.10.2023
 */
public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Serg");
        Student student2 = new Student("Oleksandra");
        Student student3 = new Student("Ksenia");
        Student student4 = new Student("Yuriy");
        Student student5 = new Student("Valeriy");
        Student student6 = new Student("Oleksandr");

        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5, student6));
        Student[] array = new Student[6];
        array[0] = student1;
        array[1] = student2;
        array[2] = student3;
        array[3] = student4;
        array[4] = student5;
        array[5] = student6;

        for (Student s: array) {
            System.out.println(s.getName());
        }

        System.out.println();

        for (Student s: students) {
            System.out.println(s);
        }
    }
}
