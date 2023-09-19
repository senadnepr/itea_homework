package sena.homework.hw04.hw0406;

/**
 * @author Sergej Chumakov on 19.09.2023
 */
public class ExcellentPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Studying is excellent");
    }

    @Override
    public void read() {
        System.out.println("Reading is excellent");
    }

    @Override
    public void write() {
        System.out.println("Writing is excellent");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing is bad");
    }
}
