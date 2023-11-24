package sena;

import java.util.Date;

/**
 * @author Sergej Chumakov on 21.11.2023
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread("first"){
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Завершення " + getName());
            }
        };
        Thread thread2 = new Thread("second"){
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Завершення " + getName());
            }
        }
        ;
        Thread thread3 = new Thread("main"){
            @Override
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Завершення " + getName());
            }
        };
        Date begin = new Date();
        System.out.println("Begin");
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        System.out.println("thread1.joined");
        System.out.println(new Date().getTime() - begin.getTime());
        thread2.join(500);
        System.out.println("thread2.joined");
        System.out.println(new Date().getTime() - begin.getTime());
        thread3.join(400);
        System.out.println("thread3.joined");
        System.out.println(new Date().getTime() - begin.getTime());

        System.out.println("MAIN DONE");
    }
}
