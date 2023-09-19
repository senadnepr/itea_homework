package sena.homework.hw04.hw0406;

/**
 * @author Sergej Chumakov on 19.09.2023
 */
public class BadPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("Studying is bad");
    }

    @Override
    public void read() {
        System.out.println("Reading is bad");
    }

    @Override
    public void write() {
        System.out.println("Writing is bad");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing is excellent");
    }
}
