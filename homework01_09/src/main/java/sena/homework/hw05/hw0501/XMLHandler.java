package sena.homework.hw05.hw0501;

/**
 * @author Sergej Chumakov on 03.10.2023
 */
public class XMLHandler extends AbstractHandler {

    private String className = "XMLHandler";

    @Override
    void open() {
        process(getOpen());
    }

    @Override
    void create() {
        process(getCreate());
    }

    @Override
    void change() {
        process(getChange());
    }

    @Override
    void save() {
        process(getSave());
    }

    private void process(String processName){
        System.out.println(className + processName);
    }
}
