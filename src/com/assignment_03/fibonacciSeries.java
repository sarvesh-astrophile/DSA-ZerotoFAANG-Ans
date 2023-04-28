package com.assignment_03;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the position up-to which you want fibonacci: ");
        int position = input.nextInt();
        int first = 0;
        int second = 1;
        System.out.printf(Integer.toString(first) + " ");
        System.out.printf(Integer.toString(second) + " ");
        for (int i = 1; i <= position; i++) {
            System.out.printf(Integer.toString(first + second) + " ");
            int temp = second;
            second = first + second;
            first = temp;
        }
    }
}
