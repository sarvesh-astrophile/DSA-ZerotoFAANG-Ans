package com.assignment_04;

import java.util.Scanner;

public class SumOfFirstNnaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number up-to to sum: ");
        int end = input.nextInt();

        System.out.printf("The sum of natural number up-to "+end+" is: "+sumOfNatural(end));
    }

    private static int sumOfNatural(int end) {
        int sum = 0;
        for (int i = 1; i < end; i++) {
            sum += i;
        }
        return sum;
    }
}
