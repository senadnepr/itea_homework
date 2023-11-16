package sena;

import java.io.*;

/**
 * @author Sergej Chumakov on 14.11.2023
 */
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println("animal1: " + animal);
        ClassLoader classLoader = Main.class.getClassLoader();
        String path = classLoader.getResource("test.txt").getPath();
        File file = new File(path);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            oos.writeObject(animal);

            Animal result = (Animal) ois.readObject() ;

            System.out.println("animal2: " + result);

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
