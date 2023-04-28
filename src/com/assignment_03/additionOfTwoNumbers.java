package com.assignment_03;

import java.util.Scanner;

public class additionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        int first_num = input.nextInt();
        System.out.printf("Enter the second number: ");
        int second_num = input.nextInt();

        int sum = first_num + second_num;
        System.out.printf("Sum of "+first_num+" + "+second_num+" is "+sum);
    }
}