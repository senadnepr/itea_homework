package sena;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Sergej Chumakov on 13.11.2023
 */
public class Main {
    public static void main(String[] args) {

        // звичайний варіант з клавіатури
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = getNumber(scanner);
        System.out.println("Input b: ");
        double b = getNumber(scanner);
        System.out.println("Input sign of calculate(+, -, *, /, ^, %): ");
        String sign = getSign(scanner);

        Calculator calculator = new Calculator();
        double result;
        switch (sign){
            case "+" -> result = calculator.add(a, b);
            case "-" -> result = calculator.minus(a, b);
            case "*" -> result = calculator.multi(a, b);
            case "/" -> result = calculator.divide(a, b);
            case "^" -> result = calculator.pow(a, b);
            case "%" -> result = calculator.residue(a, b);
            default  -> result = 0;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result +"\n");

        // варіант з анотаціями
        Class calculatorClass = Calculator.class;
        Method[] methods = calculatorClass.getMethods();

        try {
            for (Method method: methods) {
                MyArguments myArguments = method.getAnnotation(MyArguments.class);
                if (null != myArguments) {
                    double result1 = (double) method.invoke(calculator, myArguments.a(), myArguments.b());
                    System.out.println(myArguments.a() + " " + myArguments.sign() + " " + myArguments.b()
                            + " = " + result1);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * Отримання валідного значення знаку операції
     * @param scanner сканер вводу з консолі
     * @return      рядок знаку
     */
    private static String getSign(Scanner scanner) {
        boolean isSignCorrect = false;
        String res;
        do {
            res = scanner.next();
            if(Pattern.matches("[\\+\\-\\*/^%]{1}", res)){
                isSignCorrect = true;
            } else {
                System.out.println("Enter correct sign(+, -, *, /, ^, %):");
            }
        }while (!isSignCorrect);
        return res;
    }

    /**
     * Отримання валідного значення для обчислювання
     * @param scanner  сканер вводу з консолі
     * @return  значення для обчислювання
     */
    private static double getNumber(Scanner scanner) {
        boolean isNumberCorrect = false;
        double res = 0;
        do {
            String strNumber = scanner.next();
            try {
                res = Double.parseDouble(strNumber);
                isNumberCorrect = true;
            }catch (Exception e){
                System.out.println("Enter correct number:");
            }
        }while (!isNumberCorrect);
        return res;
    }
}
