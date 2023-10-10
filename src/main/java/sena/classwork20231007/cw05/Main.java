package sena.classwork20231007.cw05;

/**
 * @author Sergej Chumakov on 07.10.2023
 */
public class Main {

    public static void main(String[] args) throws Exception {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4};
        int[] arrayRes = new int[5];

        try {
            for (int i = 0; i < array1.length; i++) {
                arrayRes[i] = array1[i] + array2[i];
            }
        } catch (Exception e){
            throw new Exception("Масиви мають різний розмір");
        } finally {
            System.out.println("SSS");
        }
    }
}
