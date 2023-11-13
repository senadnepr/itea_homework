package sena.homework.hw05.hw0503;
/*
HW - 05 - 03
Створіть проєкт з класом Main.java.
Створіть ConverterTemperature з методом convert.
Реалізуйте для ConverterTemperature класи для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти.
У класу має бути метод convert, який робить конвертацію.
Інстанс ConverterTemperature створити неможливо.
 */
/**
 * @author Sergej Chumakov on 03.10.2023
 */
public class Main {
    public static void main(String[] args) {

        ConverterTemperature[] converterTemperatures = {new CelsiusToFahrenheit(), new CelsiusToKelvin()};

        double input = 23;
        for (ConverterTemperature converterTemperature:converterTemperatures) {
            System.out.println(input + "C = " + converterTemperature.convert(input) + converterTemperature.getId());
        }
    }
}
