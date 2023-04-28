package com.assignment_04;

import java.util.Scanner;

public class CheckPythagoreanTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int first_num = input.nextInt();
        System.out.printf("Enter second number: ");
        int second_num = input.nextInt();
        System.out.printf("Enter third number: ");
        int third_num = input.nextInt();

        if (isPythagoreanTriplet(first_num,second_num,third_num)){
            System.out.printf("Yes they form Pythagorean triplet");
        } else {
            System.out.printf("No they don't form Pythagorean triplet");
        }
    }

    private static boolean isPythagoreanTriplet(int first_num, int second_num, int third_num) {
        return Math.pow(first_num,2) + Math.pow(second_num,2) == Math.pow(third_num,2);
    }
}
