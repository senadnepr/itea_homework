package sena;

/**
 * @author Sergej Chumakov on 21.11.2023
 */
public class Main {
    public static void main(String[] args) {

        ThreadOne threadOne = new ThreadOne();
        ThreadSecond threadSecond = new ThreadSecond();

        threadOne.setThread2(threadSecond);
        threadSecond.setThread1(threadOne);

        threadOne.start();
        threadSecond.start();
    }
}
