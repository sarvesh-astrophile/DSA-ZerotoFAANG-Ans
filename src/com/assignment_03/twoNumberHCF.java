package com.assignment_03;

import java.util.Scanner;

public class twoNumberHCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        int first_num = input.nextInt();
        System.out.printf("Enter the second number: ");
        int second_num = input.nextInt();

        int smaller = second_num;
        // swapping numbers
        if (second_num>first_num){
            smaller = first_num;
        }

        // finding HCF
        int HCF = 1;
        for (int i = 1; i <= smaller; i++) {
            if (first_num%i == 0 && second_num%i == 0) {
                HCF = i;
            }
        }

        System.out.printf("HCF of "+first_num+" and "+second_num+" is: "+HCF);
    }
}
