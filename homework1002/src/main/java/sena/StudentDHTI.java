package sena;

/**
 * @author Sergej Chumakov on 14.11.2023
 */
@Student(name = "Petrenko", age = 22, specialisation = "Logistic")
abstract public class StudentDHTI {

    private String name;
    private int age;
    private String specialisation;

    abstract public int getCourseOfDegree();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public String toString() {
        return "StudentDHTI{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialisation='" + specialisation + '\'' +
                '}';
    }
}
