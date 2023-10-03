package sena.classwork;

/**
 * @author Sergej Chumakov on 30.09.2023
 */
public class Gorshok {
    private int height;
    private int volume;

    public Gorshok(int height, int volume) {
        this.height = height;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Gorshok{" +
                "height=" + height +
                ", volume=" + volume +
                '}';
    }
}
