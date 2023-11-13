package sena.homework.hw09.hw0903;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть назву класу (java.lang.String, наприклад): ");
        String className = sc.next();

        try {
            Class cl = Class.forName(className);
            if(cl.isInterface()){
                System.out.println("Він є інтерфейсом");
            }
            if(cl.isEnum()){
                System.out.println("Він є Enum");
            }
            if(cl.isArray()){
                System.out.println("Він є масивом");
            }
            Class[] interfaces = cl.getInterfaces();
            if(interfaces.length > 0){
                System.out.println("Він імплементує інтерфейси:");
                for (Class c: interfaces){
                    System.out.println(c.getName());
                }
            }
            Class superclass = cl.getSuperclass();
            if(null != superclass){
                System.out.println("Він наслідує класу " + superclass.getName());
            }
            Constructor[] constructors = cl.getConstructors();
            if(constructors.length > 0){
                System.out.println("Він має конструктори:");
                for (Constructor c: constructors){
                    System.out.println(c.getName() + " " + Arrays.toString(c.getParameterTypes()));
                }
            }
            Method[] methods = cl.getMethods();
            if(methods.length > 0){
                System.out.println("Він має публічні методи:");
                for (Method method: methods){
                    System.out.println(method.getName()+ " " + Arrays.toString(method.getParameterTypes()));
                }
            }
            Field[] fields = cl.getFields();
            if(fields.length > 0){
                System.out.println("Він має публічні поля:");
                for (Field field: fields){
                    System.out.println(field.getName());
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Такого класу не знайдено");
        }
    }
}
