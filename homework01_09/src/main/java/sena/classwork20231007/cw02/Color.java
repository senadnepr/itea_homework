package sena.classwork20231007.cw02;

/**
 * @author Sergej Chumakov on 07.10.2023
 */
public enum Color {

    RED(4, "red"),
    YELLOW(3, "yellow"),
    BLACK(2, "black"),
    WHITE(1, "white");

    private int id;
    private String name;

    Color(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
