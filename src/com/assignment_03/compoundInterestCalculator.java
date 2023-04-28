package com.assignment_03;

import java.util.Scanner;

public class compoundInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the principal amount: ");
        float principal_amount = input.nextFloat();
        System.out.printf("Enter the interest rate: ");
        float interest_rate = input.nextFloat();
        System.out.printf("Enter the times compound in a year: ");
        float n_times = input.nextFloat();
        System.out.printf("Enter the no. of years: ");
        float years = input.nextFloat();

        double final_interest = principal_amount*(Math.pow((1+((interest_rate/100)/n_times)), (n_times*years))) - principal_amount;
        System.out.printf("The final interest will be: "+final_interest);
    }
}
