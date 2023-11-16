package sena;

import java.io.Serializable;

/**
 * @author Sergej Chumakov on 02.11.2023
 */
public class Animal implements Serializable {

    String color;           //package
    private String name;
    public String vid;
    protected String continent;
    final String zoo;
    public static String sdf;
    public static final String COUNTRY = "Germany";
    private static Integer age;
    private static final String DFDFG = "adfgsdfg";

    public Animal() {
        this.zoo = "Berlin";
        this.continent = "Europe";
        this.color = "white";
        this.name = "name";
        this.vid = "animal";
        sdf = "dfgdfg";
        age = 10;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", vid='" + vid + '\'' +
                ", continent='" + continent + '\'' +
                ", zoo='" + zoo + '\'' +
                ", sdf='" + sdf + '\'' +
                ", COUNTRY='" + COUNTRY + '\'' +
                ", age='" + age + '\'' +
                ", DFDFG='" + DFDFG + '\'' +
                '}';
    }
}
