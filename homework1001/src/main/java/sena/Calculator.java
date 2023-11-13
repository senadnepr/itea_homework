package sena;

/**
 * @author Sergej Chumakov on 13.11.2023
 *
 * клас з методами калькулятору
 */
public class Calculator {

    /**
     * Метод складання
     * @param a перший параметр
     * @param b другий параметр
     * @return  результат обчислення
     */
    @MyArguments(a = 3, b = 3, sign = "+")
    public double add(double a, double b){
        return a + b;
    }

    /**
     * Метод віднімання
     * @param a перший параметр
     * @param b другий параметр
     * @return  результат обчислення
     */
    @MyArguments(a = 120, b = 119, sign = "-")
    public double minus(double a, double b){
        return a - b;
    }

    /**
     * Метод множення
     * @param a перший параметр
     * @param b другий параметр
     * @return  результат обчислення
     */
    @MyArguments(a = 4, b = 5, sign = "*")
    public double multi(double a, double b){
        return a * b;
    }

    /**
     * Метод ділення
     * @param a перший параметр
     * @param b другий параметр
     * @return  результат обчислення
     */
    @MyArguments(a = 32, b = 4, sign = "/")
    public double divide(double a, double b){
        if(b == 0){
            System.out.println("Don't divide by zero!");
        }
        return a / b;
    }

    /**
     * Метод піднесення до степеня
     * @param a перший параметр
     * @param b другий параметр
     * @return  результат обчислення
     */
    @MyArguments(a = 2, b = 10, sign = "^")
    public double pow(double a, double b){
        return Math.pow(a, b);
    }

    /**
     * Метод отримання решти від ділення
     * @param a перший параметр
     * @param b другий параметр
     * @return  результат обчислення
     */
    @MyArguments(a = 22, b = 5, sign = "%")
    public double residue(double a, double b){
        return a % b;
    }
}
