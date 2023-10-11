package sena.work;

/**
 * @author Sergej Chumakov on 11.10.2023
 */
public class Main {

    public static void main(String[] args) {

        CorrectFrame correctFrame = new CorrectFrame();
        System.out.println("correctFrame.getFiles()" + correctFrame.getFiles());
        correctFrame.getOut().print();
    }
}
