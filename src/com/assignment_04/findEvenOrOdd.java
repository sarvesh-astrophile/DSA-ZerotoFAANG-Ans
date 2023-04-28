package com.assignment_04;

import java.util.Scanner;

public class findEvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number to check: ");
        int check_num = input.nextInt();
        if (isEven(check_num)){
            System.out.printf(check_num+" is Even");
        } else {
            System.out.printf(check_num+" is Odd");
        }
    }

    private static boolean isEven(int check_num) {
        return check_num % 2 == 0;
    }
}
