package sena.classwork20231007.cw03;

/**
 * @author Sergej Chumakov on 07.10.2023
 */
public class OuterClass {
    private double someVariable = 11;

    public class InnerClass{

        public void modifire(int var){

            double a = someVariable * var;
            System.out.println(a);
        }

    }
}
