package sena.homework.hw04.hw0406;
/*
HW - 04 - 06
Створіть проект з класом Main.java.

Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
У тілі класу створіть методи void study(), void read(), void write(), void relax().
Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і
перевизначте кожен із методів, залежно від успішності учня. Конструктор класу ClassRoom приймає аргументи типу Pupil,
клас має складатися з 4 учнів. Передбачте можливість, що користувач може передати 2 або 3 аргументи.
Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
 */
/**
 * @author Sergej Chumakov on 19.09.2023
 */
public class Main {

    public static void main(String[] args) {

        ClassRoom classRoom1 = new ClassRoom(new ExcellentPupil(), new GoodPupil());
        ClassRoom classRoom2 = new ClassRoom(new ExcellentPupil(), new GoodPupil(), new BadPupil());
        ClassRoom classRoom3 = new ClassRoom(new ExcellentPupil(), new GoodPupil(), new BadPupil(), new GoodPupil());

        System.out.println("classRoom1:");
        getInfoAboutClassRoom(classRoom1);
        System.out.println("classRoom2:");
        getInfoAboutClassRoom(classRoom2);
        System.out.println("classRoom3:");
        getInfoAboutClassRoom(classRoom3);
    }

    private static void getInfoAboutClassRoom(ClassRoom classRoom1) {
        for (Pupil pupil : classRoom1.getPupils()) {
            pupil.study();
        }
        for (Pupil pupil : classRoom1.getPupils()) {
            pupil.read();
        }
        for (Pupil pupil : classRoom1.getPupils()) {
            pupil.write();
        }
        for (Pupil pupil : classRoom1.getPupils()) {
            pupil.relax();
        }
    }
}
