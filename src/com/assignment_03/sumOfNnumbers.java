package com.assignment_03;

import java.util.Scanner;

public class sumOfNnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number to type: ");
        float sum_of_num = 0;
        int no_of_num = input.nextInt();
        for (int i = 0; i < no_of_num; i++) {
            System.out.printf("Enter the number "+(i+1)+": ");
            sum_of_num += input.nextFloat();
        }
        System.out.printf("Sum of "+(no_of_num)+" numbers: "+sum_of_num);
    }
}
