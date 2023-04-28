package com.assignment_03;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number to find sum: ");
        int pro_num = input.nextInt();

        // sum of number
        int sum_of_digits = 0;
        for (int i = 0; i < Integer.toString(pro_num).length(); i++) {
            sum_of_digits += Character.getNumericValue(Integer.toString(pro_num).charAt(i));
//            System.out.println("sum : "+Integer.toString(pro_num).charAt(i));
        }
        System.out.printf("sum of digits: "+sum_of_digits);
    }
}
