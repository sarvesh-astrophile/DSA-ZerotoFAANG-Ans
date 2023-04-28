package com.assignment_03;

import java.util.Scanner;

public class checkArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number to find armstrong: ");
        int check_num = input.nextInt();
        int sum_of_cube = 0;
        for (int i = 0; i < (Integer.toString(check_num).length()); i++) {
            int digit = Character.getNumericValue(Integer.toString(check_num).charAt(i));
            sum_of_cube += Math.pow(digit,3);
        }

        if (sum_of_cube == check_num){
            System.out.printf(check_num+" is an armstrong number");
        } else {
            System.out.printf(check_num+" is not an armstrong number");
        }
    }
}
