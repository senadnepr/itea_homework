package sena.homework.hw05.hw0503;

/**
 * @author Sergej Chumakov on 03.10.2023
 */
public class CelsiusToKelvin implements ConverterTemperature{

    @Override
    public double convert(double input) {
        return input + 273.15;
    }

    @Override
    public String getId() {
        return "K";
    }
}
