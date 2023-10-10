package sena.homework.hw06.hw0601;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergej Chumakov on 10.10.2023
 */
public class Zoo {

    private List<Animal> animalsInZoo = new ArrayList<>();

    public Zoo() {
        addAnimals();
    }

    private void addAnimals() {
        animalsInZoo.add(0, new Animal("слон"));
        animalsInZoo.add(1, new Animal("папуга"));
        animalsInZoo.add(2, new Animal("тигр"));
        animalsInZoo.add(3, new Animal("лев"));
        animalsInZoo.add(4, new Animal("зебра"));
        animalsInZoo.add(5, new Animal("бегемот"));
        animalsInZoo.add(6, new Animal("носоріг"));
        animalsInZoo.add(7, new Animal("пітон"));
    }

    public List<Animal> getAnimalsInZoo() {
        return animalsInZoo;
    }
}
