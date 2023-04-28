package com.assignment_03;

import java.util.Scanner;

public class battingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the no. of hits: ");
        int hits = input.nextInt();
        System.out.printf("Enter the no. of at-bats: ");

        System.out.printf("Batting average is: "+(hits*100/input.nextInt())+" percent");
    }
}
