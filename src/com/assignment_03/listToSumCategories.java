package com.assignment_03;

import java.util.Scanner;

public class listToSumCategories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // getting an input
        int num = 1;
        int sum_of_negative = 0;
        int sum_of_positive_even = 0;
        int sum_of_positive_odd = 0;
        while (num != 0){
            System.out.printf("Enter the number: ");
            num = input.nextInt();

            if (num < 0){
                sum_of_negative += num;
            } else if (num % 2 == 0) {
                sum_of_positive_even += num;
            } else if (num % 2 != 0) {
                sum_of_positive_odd += num;
            }
        }

        System.out.println("Sum of negatives: "+sum_of_negative);
        System.out.println("Sum of positive odd: "+sum_of_positive_odd);
        System.out.println("Sum of positive even: "+sum_of_positive_even);
    }
}
