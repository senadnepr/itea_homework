package sena.classwork;

import java.util.Arrays;

/**
 * @author Sergej Chumakov on 23.09.2023
 */
public class Main1 {

    public static void main(String[] args) {

        int[][] array1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] array2 = {{-1,-2,-3}, {-4,-5,-6}, {-7,-8,-9}};

        int[][] res = add(array1, array2);

        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }

    private static int[][] add(int[][] array1, int[][] array2) {
        int[][] res = new int[array1.length][array1[0].length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                res[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return res;
    }
}
