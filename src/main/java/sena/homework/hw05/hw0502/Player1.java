package sena.homework.hw05.hw0502;

/**
 * @author Sergej Chumakov on 03.10.2023
 */
public class Player1 implements Playable, Recordable {
    private String className = "Player1";

    @Override
    public void play() {
        System.out.println(className + " plays");
    }

    @Override
    public void pause() {
        System.out.println(className + " pauses");
    }

    @Override
    public void stop() {
        System.out.println(className + " stops");
    }

    @Override
    public void record() {
        System.out.println(className + " records");
    }
}
