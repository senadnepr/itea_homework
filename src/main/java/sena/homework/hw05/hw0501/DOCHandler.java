package sena.homework.hw05.hw0501;

/**
 * @author Sergej Chumakov on 03.10.2023
 */
public class DOCHandler extends AbstractHandler{

    private String className = "DOCHandler";

    @Override
    void open() {
        System.out.println(className + getOpen());
    }

    @Override
    void create() {
        System.out.println(className + getCreate());
    }

    @Override
    void change() {
        System.out.println(className + getChange());
    }

    @Override
    void save() {
        System.out.println(className + getSave());
    }
}
