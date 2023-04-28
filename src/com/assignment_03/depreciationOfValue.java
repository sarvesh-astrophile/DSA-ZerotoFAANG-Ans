package com.assignment_03;

import java.util.Scanner;

public class depreciationOfValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the initial cost: Rs. ");
        float initial_cost = input.nextFloat();
        System.out.printf("Enter the useful life (Year): ");
        float useful_life = input.nextFloat();
        System.out.printf("Enter the salvage value: Rs. ");
        float salvage_value = input.nextFloat();

        System.out.printf("Annual Depreciation: "+((initial_cost-salvage_value)/useful_life)+"/year");
    }
}
