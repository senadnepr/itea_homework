package sena;

/**
 * @author Sergej Chumakov on 21.11.2023
 */
public class Main {
    public static void main(String[] args) {

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

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
