package sena.homework.hw04.hw0406;

/**
 * @author Sergej Chumakov on 19.09.2023
 */
public class ClassRoom {

    private Pupil[] pupils = new Pupil[4];

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupils[0] = pupil1;
        this.pupils[1] = pupil2;
        this.pupils[2] = pupil3;
        this.pupils[3] = pupil4;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this(pupil1, pupil2, pupil3, new Pupil());
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this(pupil1, pupil2, new Pupil(), new Pupil());
    }

    public Pupil[] getPupils() {
        return pupils;
    }
}
