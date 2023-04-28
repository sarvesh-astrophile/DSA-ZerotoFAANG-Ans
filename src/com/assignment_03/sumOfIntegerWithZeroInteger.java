package com.assignment_03;

import java.util.Scanner;

public class sumOfIntegerWithZeroInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the integers and 0 to break:");
        int num = input.nextInt();
        int sum_of_numbers = 0;
        while (num != 0){
            sum_of_numbers += num;
            num = input.nextInt();
        }
        System.out.printf("Sum of numbers: "+sum_of_numbers);
    }
}
