package com.assignment_02;

import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in Rupees: Rs.");
        float rupee = input.nextFloat();
        float result = rupee/82 ;
        System.out.println("The money in USD is: $"+result);
    }
}
