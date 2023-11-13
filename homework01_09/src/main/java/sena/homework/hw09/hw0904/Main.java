package sena.homework.hw09.hw0904;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class myClass = Class.forName("sena.homework.hw09.hw0904.MyClass");

        Constructor[] constructors = myClass.getConstructors();
        if(constructors.length > 0){
            System.out.println("Він має конструктори:");
            for (Constructor c: constructors){
                System.out.println(c.getName() + " " + Arrays.toString(c.getParameterTypes()));
            }
        }
        Method[] methods = myClass.getMethods();
        if(methods.length > 0){
            System.out.println("Він має публічні методи:");
            for (Method method: methods){
                System.out.println(method.getReturnType().getSimpleName() + " "
                        + method.getName()+ " " + Arrays.toString(method.getParameterTypes()));
            }
        }
        Field[] fields = myClass.getDeclaredFields();
        if(fields.length > 0){
            System.out.println("Він має поля:");
            for (Field field: fields){
                int modifiers = field.getModifiers();
                String modifier = "";
                switch (modifiers){
                    case Modifier.PRIVATE -> modifier = "private";
                    case Modifier.PROTECTED -> modifier = "protected";
                    case Modifier.PUBLIC -> modifier = "public";
                }
                System.out.println(modifier + " "
                        + field.getType().getSimpleName() + " " + field.getName());
            }
        }

    }
}

class MyClass {

    private String name;
    protected String secondName;
    public int age;

    public MyClass(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public MyClass(String name, String secondName) {
        this(name, secondName, 0);
    }

    public MyClass(String name) {
        this(name, "");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
