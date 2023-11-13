package sena.homework.hw04.hw0406;

/**
 * @author Sergej Chumakov on 19.09.2023
 */
public class GoodPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("Studying is good");
    }

    @Override
    public void read() {
        System.out.println("Reading is good");
    }

    @Override
    public void write() {
        System.out.println("Writing is good");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing is good");
    }
}
