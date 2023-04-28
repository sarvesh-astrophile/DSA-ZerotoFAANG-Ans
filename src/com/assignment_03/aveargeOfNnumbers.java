package com.assignment_03;

import java.util.Scanner;

public class aveargeOfNnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of numbers you want to average: ");
        int n = input.nextInt();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter number "+(i+1)+": ");
            double num = input.nextDouble();
            sum += num;
        }

        double average = sum/n;
        System.out.printf("The average of the number is: "+average);
    }
}
