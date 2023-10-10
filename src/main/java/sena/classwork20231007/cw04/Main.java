package sena.classwork20231007.cw04;

/**
 * @author Sergej Chumakov on 07.10.2023
 */
public class Main implements Calculate{

    public static void main(String[] args) {

        System.out.println( Double.MAX_VALUE);

        double a = 12345678901234567890.1234;
//        int a = 12;


        Main main = new Main();

        double v = 0;
        double res = 0;
        try {
            v = a / 0;
            res = v * 0;
            System.out.println("v=" + v);
            System.out.println("res=" + res);
        }catch (Exception e){
            System.out.println("Exception" + e);
            e.printStackTrace();
        }
    }

    @Override
    public double add(double a, double b) {
        return 0;
    }

    @Override
    public double minus(double a, double b) {
        return 0;
    }

    @Override
    public double divide(double a, double b) {
        double v = 0;
        try {
            v = a / b;
        }catch (Exception e){
            System.out.println("Exception" + e);
        }
        return v;
    }

    @Override
    public double multiplue(double a, double b) {
        return 0;
    }

    @Override
    public double sqrt(double a) {
        if(a < 0){
            System.out.println("Не можно брати корень з негативного числа");
            return 0;
        } else {
            return Math.sqrt(a);
        }
    }
}
