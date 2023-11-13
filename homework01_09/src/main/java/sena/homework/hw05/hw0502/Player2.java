package sena.homework.hw05.hw0502;

/**
 * @author Sergej Chumakov on 03.10.2023
 */
public class Player2 implements Recordable, Playable {
    private String className = "Player2";

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
