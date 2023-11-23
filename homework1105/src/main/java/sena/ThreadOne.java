package sena;

/**
 * @author Sergej Chumakov on 23.11.2023
 */
public class ThreadOne extends Thread {

    private Thread thread2;

    public ThreadOne() {
        System.out.println("ThreadOne created");
    }

    public void setThread2(Thread thread2) {
        this.thread2 = thread2;
    }

    @Override
    public void run() {

        System.out.println("ThreadOne started");
        try {
            sleep(1000);
            System.out.println("ThreadOne interruped finish of ThreadSecond...");
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ThreadOne finished");
    }
}
