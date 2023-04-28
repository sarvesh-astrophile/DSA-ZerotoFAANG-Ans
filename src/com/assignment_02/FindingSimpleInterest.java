package com.assignment_02;

import java.util.Scanner;

public class FindingSimpleInterest {
    public static void main(String[] args) {
        System.out.println("Input Principal,Time and Rate of interest");
        Scanner input = new Scanner(System.in);
        System.out.print("Principal:");
        int principal = input.nextInt();
        System.out.print("Time:");
        int time = input.nextInt();
        System.out.print("Rate of Interest:");
        int interest = input.nextInt();

        // formula for simple interest
        int simple_interest = (principal * interest * time)/100;

        System.out.println("Simple Interest: "+simple_interest);
    }
}
