package sena;

import java.io.*;
import java.net.URL;

/**
 * @author Sergej Chumakov on 14.11.2023
 */
public class Main {
    public static void main(String[] args) {

        ClassLoader classLoader = Main.class.getClassLoader();
        String path = classLoader.getResource("test.txt").getPath();
        System.out.println("path=" + path);
        System.out.println("test=" + path);
        File file = new File(path);

        ClassForSerialization classForSerialization = new ClassForSerialization();
        classForSerialization.dateOfBirth = "20011111";
        classForSerialization.setAge(22);
        classForSerialization.setName("Artur");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            oos.writeObject(classForSerialization);

            ClassForSerialization result = (ClassForSerialization) ois.readObject() ;

            System.out.println(result);

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
