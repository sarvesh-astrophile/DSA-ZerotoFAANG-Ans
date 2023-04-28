package com.assignment_05;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9

         */
        Scanner input = new Scanner(System.in);
//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {7, 8, 9} // 2nd index -> arr[2] = {7, 8, 9}
//        };

        // input
        int[][] arr = new int[3][2];
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        // output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
////            for (int col = 0; col < arr[row].length; col++) {
////                System.out.print(arr[row][col]+" ");
////            }
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for (int[] a :
                arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
