package sena;

/**
 * @author Sergej Chumakov on 14.11.2023
 */
public class Main {
    public static void main(String[] args) {

        Bachelor student1 = new Bachelor();
        Master student2 = new Master();

        initStudent(student1);
        initStudent(student2);

        System.out.println(student1);
        System.out.println(student2);
    }

    private static void initStudent(Object object) {
        Class<?> clazz = object.getClass();

        if (clazz.isAnnotationPresent(Student.class)) {
            Student student = clazz.getAnnotation(Student.class);
            if (null != student) {
                ((StudentDHTI)object).setName(student.name());
                ((StudentDHTI)object).setAge(student.age());
                ((StudentDHTI)object).setSpecialisation(student.specialisation());
            }
        }
    }
}
