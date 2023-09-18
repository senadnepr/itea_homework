package sena.homework.hw04.hw0401;
/*
HW - 04 - 01
Створіть проект з класом Main.java.

Потрібно: Створити клас Book. Створити класи Title, Author та Content, кожен з яких повинен містити
одне рядкове поле та метод void show(). Реалізувати можливість додавання назви книги, імені автора та змісту.
Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.
 */
/**
 * @author Sergej Chumakov on 18.09.2023
 */
public class Main {

    public static void main(String[] args) {

        Book book = new Book();
        book.author.name = "Mainak Mitra";
        book.title.title = "Mastering Gradle";
        book.content.content = "Master the technique of developing, migrating, and building automation using Gradle.";

        book.author.show();
        book.title.show();
        book.content.show();
    }
}


