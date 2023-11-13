package sena.classwork20231021.cw02;

/**
 * @author Sergej Chumakov on 21.10.2023
 */
public class Calculator {

    public <T> T add(T a, T b){
        if(a instanceof Integer){
            return (T)(Object) ((int)a + (int)b);
        }
        if(a instanceof Double){
            return (T)(Object) ((double)a + (double)b);
        }
        return (T) (Object) 0;
    }

    public <T> T minus(T a, T b){
        if(a instanceof Integer){
            return (T)(Object) ((Integer)a - (Integer)b);
        }
        if(a instanceof Double){
            return (T)(Object) ((Double)a - (Double)b);
        }
        return (T) (Object) 0;
    }

    public <T> T multi(T a, T b){
        if(a instanceof Integer){
            return (T)(Object) ((Integer)a * (Integer)b);
        }
        if(a instanceof Double){
            return (T)(Object) ((Double)a * (Double)b);
        }
        return (T) (Object) 0;
    }

    public <T> T divide(T a, T b){
        if(a instanceof Integer){
            if((Integer)b == 0) System.out.println("На нуль ділити не можна");
            return (T)(Object) ((Integer)a / (Integer)b);
        }
        if(a instanceof Double){
            return (T)(Object) ((Double)a / (Double)b);
        }
        return (T) (Object) 0;
    }
}
