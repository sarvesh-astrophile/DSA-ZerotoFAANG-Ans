package com.assignment_03;

import java.util.Scanner;

public class differenceOfSumAndProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int num = input.nextInt();
        
        // sum and product of digits
        int sum_of_digits = 0;
        int product_of_digits = 1;
//        for (int i = 0; i < (Integer.toString(num)).length(); i++) {
//            char character = Integer.toString(num).charAt(i);
//            int digit = Character.getNumericValue(character);
//            sum_of_digits = sum_of_digits + digit;
//            product_of_digits = product_of_digits * digit;
//        }

        // 2nd way to do it
        while (num>0){
            int digit = num%10;
            product_of_digits *= digit;
            sum_of_digits += digit;
            num /= 10;
        }

        System.out.printf("Difference of product and sum: "+(product_of_digits-sum_of_digits));
    }
}
