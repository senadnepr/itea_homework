package sena.classwork;

import java.util.Arrays;

/**
 * @author Sergej Chumakov on 23.09.2023
 */
public class Main {

    public static void main(String[] args) {

        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] res = rev90(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }

    private static int[][] rev90(int[][] array1) {

        int length = array1.length;

        int[][] res = new int[array1.length][array1[0].length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                res[length - 1 - j][i] = array1[i][j];
            }
        }
        return res;
    }
}
