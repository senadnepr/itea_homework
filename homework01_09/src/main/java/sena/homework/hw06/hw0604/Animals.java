package sena.homework.hw06.hw0604;

/**
 * @author Sergej Chumakov on 11.10.2023
 */
public enum Animals {
    ELEPHANT(50),
    PARROT(10),
    TIGER(5),
    LION(6),
    ZEBRA(3),
    HIPPO(12),
    RHINOCEROS(20),
    PYTHON(60);

    private int age;

    Animals(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return super.name() +
                ", " + age;
    }
}
