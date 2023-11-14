package sena;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Sergej Chumakov on 14.11.2023
 */
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Class calculatorClass = Calculator.class;
        Method[] methods = calculatorClass.getMethods();

        try {
            for (Method method: methods) {
                Math myArguments = method.getAnnotation(Math.class);
                if (null != myArguments) {
                    method.invoke(calculator, myArguments.num1(), myArguments.num2());
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
