package com.assignment_03;

import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int num = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.printf("The factorial is :"+factorial);
    }
}
