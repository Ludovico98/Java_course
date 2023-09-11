package Section_6_Methods;

import java.util.Random;

public class Examples2DArrays {

    public static void main(String[] args) {
        int[][] my2DArray = new int[2][3];

        fill2DArray(my2DArray);
        print2DArray(my2DArray);
        System.out.println();
        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    }

    public static void fill2DArray(int[][] twoDArr) {
        Random rand = new Random();

        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] = rand.nextInt(100);
            }
        }
    }//end fill 2d arr

    public static void print2DArray(int[][] twoDArr) {
        for (int[] arr : twoDArr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void twice2DArray(int[][] twoDarr) {
        for (int i = 0; i < twoDarr.length; i++) {
            for (int j = 0; j < twoDarr[i].length; j++) {
                twoDarr[i][j] *= 2;
            }

        }
    }

}
