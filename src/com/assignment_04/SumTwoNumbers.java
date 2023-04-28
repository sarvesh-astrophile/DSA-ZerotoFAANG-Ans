package com.assignment_04;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int first_num = input.nextInt();
        System.out.printf("Enter second number: ");
        int second_num = input.nextInt();

        System.out.printf("Sum of "+first_num+" and "+second_num+" is: "+ sumOf(first_num,second_num));
    }

    private static int sumOf(int first_num, int second_num) {
        return first_num+second_num;
    }
}
