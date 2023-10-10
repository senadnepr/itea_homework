package sena.classwork20231007.cw03;

/**
 * @author Sergej Chumakov on 07.10.2023
 */
public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.modifire(20);
    }
}
