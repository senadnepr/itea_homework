package sena.homework.hw05.hw0502;
/*
HW - 05 - 02

Створіть проєкт з класом Main.java.
Потрібно: Створіть 2 інтерфейси Playable та Recordable. У кожному з інтерфейсів створіть по 3 методи
void play() / void pause() / void stop() та void record() / void pause() / void stop() відповідно.
Створити похідний клас Player від базових інтерфейсів Playable та Recordable.
Написати програму, яка виконує програвання та запис.
 */
/**
 * @author Sergej Chumakov on 03.10.2023
 */
public class Main {
    public static void main(String[] args) {

        Playable[] players = {new Player1(), new Player2()};
        for (Playable player:players) {
            player.play();
            player.pause();
            player.stop();
        }
        System.out.println("");
        Recordable[] recorders = {new Player1(), new Player2()};
        for (Recordable recorder:recorders) {
            recorder.pause();
            recorder.stop();
            recorder.record();
        }
        System.out.println("");
        Player1 player1 = new Player1();
        player1.record();
        player1.stop();
        player1.play();
        player1.pause();
    }
}
