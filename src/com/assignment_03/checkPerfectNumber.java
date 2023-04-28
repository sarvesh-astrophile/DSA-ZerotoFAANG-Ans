package com.assignment_03;

import java.util.Scanner;

public class checkPerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number to check: ");
        int check_num = input.nextInt();
        int sum_of_factors = 0;
        for (int i = 1; i <= check_num / 2; i++) {
            if (check_num%i == 0) {
                sum_of_factors += i;
            };
        }
        if (sum_of_factors == check_num){
            System.out.printf(check_num+" is a perfect number");
        } else {
            System.out.printf(check_num+" is not a perfect number");
        }
    }
}
