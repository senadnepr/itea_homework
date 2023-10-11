package sena.work;

/**
 * @author Sergej Chumakov on 11.10.2023
 */
public class MyButton {

    private CorrectFrame correctFrame;

    public MyButton(CorrectFrame correctFrame) {
        this.correctFrame = correctFrame;
    }

    public void print(){
        System.out.println("correctFrame.getFiles().size()=" + correctFrame.getFiles().size());
    }
}
