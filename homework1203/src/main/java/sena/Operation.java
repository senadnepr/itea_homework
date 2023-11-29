package sena;

/**
 * @author Sergej Chumakov on 29.11.2023
 */
@FunctionalInterface
public interface Operation {
    double calculate(double x, double y);
}
