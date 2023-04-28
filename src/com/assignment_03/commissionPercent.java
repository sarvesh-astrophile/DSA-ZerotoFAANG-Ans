package com.assignment_03;

import java.util.Scanner;

public class commissionPercent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the sale price: ");
        float sale_price = input.nextFloat();
        System.out.printf("Enter the commission amount: ");
        float commission_amount = input.nextFloat();

        System.out.printf("Commission percent: "+((commission_amount*100)/sale_price));
    }
}
