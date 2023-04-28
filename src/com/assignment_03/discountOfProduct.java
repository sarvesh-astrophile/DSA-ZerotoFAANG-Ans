package com.assignment_03;

import java.util.Scanner;

public class discountOfProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the product MRP: ");
        double mrp_price = input.nextDouble();
        System.out.printf("Enter the discount in percent: ");
        float discount = input.nextFloat();

        System.out.printf("The final product price: "+(mrp_price-(mrp_price*discount/100)));
    }
}
