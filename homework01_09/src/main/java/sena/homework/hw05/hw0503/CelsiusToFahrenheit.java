package sena.homework.hw05.hw0503;

/**
 * @author Sergej Chumakov on 03.10.2023
 */
public class CelsiusToFahrenheit implements ConverterTemperature{

    @Override
    public double convert(double input) {
        return (input * 9/5) + 32;
    }

    @Override
    public String getId() {
        return "F";
    }
}
