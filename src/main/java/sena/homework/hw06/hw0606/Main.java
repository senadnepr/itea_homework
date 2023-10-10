package sena.homework.hw06.hw0606;

/**
 * @author Sergej Chumakov on 10.10.2023
 */
public class Main {
    public static void main(String[] args) {

        Vehicles.TOYOTA.setColor("white");
        Vehicles.NISSAN.setColor("braun");
        Vehicles.DAWOO.setColor("red");
        Vehicles.SUZUKI.setColor("black");
        Vehicles.AUDI.setColor("gray");

        System.out.println(Vehicles.TOYOTA);
        System.out.println(Vehicles.NISSAN);
        System.out.println(Vehicles.DAWOO);
        System.out.println(Vehicles.SUZUKI);
        System.out.println(Vehicles.AUDI);
    }
}
