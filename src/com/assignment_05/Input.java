package com.assignment_05;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[3] = 223;
//        arr[4] = 445;
//        System.out.println(arr[3]);

        // input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }

//        for (int j : arr) {
//            System.out.printf(j + " ");
//        }
//
//        for (int j :
//                arr) {
//            System.out.printf(j + " ");
//        }

//        System.out.printf(Arrays.toString(arr));

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }

        System.out.printf(Arrays.toString(str));
    }
}
