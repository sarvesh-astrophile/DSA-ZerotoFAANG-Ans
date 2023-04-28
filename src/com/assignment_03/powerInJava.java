package com.assignment_03;

import java.util.Scanner;

public class powerInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        double num = input.nextDouble();
        System.out.printf("Enter the power: ");
        System.out.printf("Power is: "+(Math.pow(num,input.nextDouble())));
    }
}
