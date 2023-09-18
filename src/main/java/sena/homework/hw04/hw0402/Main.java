package sena.homework.hw04.hw0402;
/*
HW - 04 - 02
Створіть проект з класом Main.java.

Потрібно: Створити клас  Address. У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
Для кожного поля створити метод з двома методами доступу (get, set) Створити екземпляр класу Address.
У поля экземпляра записати інформацію. Виведіть на екран значення полів, що описують адресу.
 */
/**
 * @author Sergej Chumakov on 18.09.2023
 */
public class Main {

    public static void main(String[] args) {

        Address address = new Address();
        address.setIndex("12345");
        address.setCountry("Ukraine");
        address.setCity("Dnipro");
        address.setStreet("Stroiteley");
        address.setHouse("11");
        address.setApartment("23");

        System.out.println(address);
    }
}
