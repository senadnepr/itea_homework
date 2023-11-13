package sena.homework.hw09.hw0905;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {

        Cat cat = new Cat();
        System.out.println("standart cat: " + cat);

        Class catClass = Class.forName("sena.homework.hw09.hw0905.Cat");

        Class animalClass = catClass.getSuperclass();

        Field[] declaredFields = animalClass.getDeclaredFields();

        for (Field f :declaredFields) {

            int modifiers = f.getModifiers();
            if(!Modifier.isStatic(modifiers)) {
                f.setAccessible(true);
                if (f.getType().getSimpleName().equals("String")) {
                    f.set(cat, "newCat " + f.getName());
                } else if (f.getType().getSimpleName().equals("Integer")) {
                    f.set(cat, 12);
                }
            } else {
                // це для Java 12+ (до цього використовували modifiers класа Field - робили його не final)
                final Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                final Unsafe unsafe = (Unsafe) unsafeField.get(null);
                final Object staticFieldBase = unsafe.staticFieldBase(f);
                final long staticFieldOffset = unsafe.staticFieldOffset(f);
                if(f.getType().getSimpleName().equals("String")) {
                    unsafe.putObject(staticFieldBase, staticFieldOffset, "newCat " + f.getName());
                } else if (f.getType().getSimpleName().equals("Integer")){
                    unsafe.putObject(staticFieldBase, staticFieldOffset, 12);
                }
                // но це не працює для final змінних, хоча приклади всі для final static
            }
        }

        System.out.println("custom cat" + cat);
    }
}
