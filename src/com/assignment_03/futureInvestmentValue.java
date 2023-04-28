package com.assignment_03;

import java.util.Scanner;

public class futureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the current value: $");
        float current_value = input.nextFloat();
        System.out.printf("Enter the rate of return (in percent): ");
        float rate_of_return = input.nextFloat()/100;
        System.out.printf("Enter the years investment to be held: ");
        int years = input.nextInt();

        double future_value = current_value*Math.pow((1+rate_of_return),years);
        System.out.printf("The future value: "+future_value);
    }
}
