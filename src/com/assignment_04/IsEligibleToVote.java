package com.assignment_04;

import java.util.Scanner;

public class IsEligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your age: ");
        int check_age = input.nextInt();
        if (isEligible(check_age)){
            System.out.printf("You are eligible to vote");
        } else {
            System.out.printf("You are not eligible to vote");
        }
    }

    private static boolean isEligible(int check_age) {
        return check_age >= 18 ;
    }
}
