package com.assignment_04;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        float first_num = input.nextFloat();
        System.out.printf("Enter the second number: ");
        float second_num = input.nextFloat();

        System.out.printf("Product of "+first_num+" and "+second_num+" is: "+ productOf(first_num,second_num));
    }

    private static double productOf(float first_num, float second_num) {
        return first_num*second_num;
    }
}
