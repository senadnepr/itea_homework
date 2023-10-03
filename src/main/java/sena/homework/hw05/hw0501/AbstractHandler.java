package sena.homework.hw05.hw0501;

/**
 * @author Sergej Chumakov on 03.10.2023
 */
public abstract class AbstractHandler {

    private String open = " opens a document";
    private String create = " creates a document";
    private String change = " changes a document";
    private String save = " saves a document";

    abstract void open();
    abstract void create();
    abstract void change();
    abstract void save();

    public String getOpen() {
        return open;
    }

    public String getCreate() {
        return create;
    }

    public String getChange() {
        return change;
    }

    public String getSave() {
        return save;
    }
}
