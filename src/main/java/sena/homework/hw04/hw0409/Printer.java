package sena.homework.hw04.hw0409;

/**
 * @author Sergej Chumakov on 21.09.2023
 */
public class Printer {

    private ConsoleColors colour;

    public Printer(ConsoleColors colour) {
        this.colour = colour;
    }

    public void print(String value){

        System.out.print(colour);
        System.out.println(value);
        System.out.println(ConsoleColors.RESET);
    }
}
