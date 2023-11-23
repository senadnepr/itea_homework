package sena;

/**
 * @author Sergej Chumakov on 23.11.2023
 */
public class ThreadSecond extends Thread {

    private Thread thread1;

    public ThreadSecond() {
        System.out.println("ThreadSecond created");
    }

    public void setThread1(Thread thread1) {
        this.thread1 = thread1;
    }

    @Override
    public void run() {
        System.out.println("ThreadSecond started");
        try {
            sleep(1000);
            System.out.println("ThreadSecond interruped finish of ThreadOne...");
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("ThreadSecond finished");
    }
}
