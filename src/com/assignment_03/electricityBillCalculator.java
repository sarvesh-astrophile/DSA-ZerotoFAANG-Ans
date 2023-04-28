package com.assignment_03;

import java.util.Scanner;

public class electricityBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the units used: ");
        float units_used = input.nextFloat();
        System.out.printf("Enter the rate: ");
        float rate = input.nextFloat();

        System.out.printf("Bill will be: "+(units_used*rate));
    }
}
