package sena;

/**
 * @author Sergej Chumakov on 14.11.2023
 */
public class Calculator {

    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2){
        int res = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + res);
    }
}
